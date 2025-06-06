package dao;

import banco.ConexaoSqlServer;
import controlador.Funcoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class PaliativoDao {
    
    private final Connection c ;
    Funcoes f = new Funcoes();    
    
    public PaliativoDao() throws SQLException, ClassNotFoundException, Exception{
        this.c = new ConexaoSqlServer().getConnection("AWSBR1PDCLIDB05.AWS.MC1.BR","BO_WTM_LINDE");        
    }       
    
    public String emissaoNotasMesser(String usuario){        
        int atual = 0 ,ultimaNota = 0;
        String branch = "";
        String retorno = "--NÃO EXISTE DIVERGÊNCIA!\n\n";
        String sql = "SELECT TOP 1 I.cIDInvoice as Nota_Atual,ISerie.nLastInvoice as Ultima_Nota,I.cSerie, ISerie.cIDUser,I.dEmission,I.cIdBranchInvoice FROM MC1_Invoice I \n" +
                     "INNER JOIN MC1_InvoiceSerie ISerie ON i.cIDTerritory = ISerie.cIDUser AND I.cIDBranchInvoice = ISerie.cIDBranchInvoice\n" +
                     "WHERE ISerie.cIDUser = '" + usuario + "' ORDER BY I.mc1Lastupdate DESC";
        try ( 
            PreparedStatement stmt = this.c.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();                            
            while (rs.next()) {
                atual = (rs.getInt(1));
                ultimaNota = (rs.getInt(2));
                branch = (rs.getString(3));                
            }
            stmt.close();  
            rs.close();
            c.close();
            if (atual != ultimaNota) {
                retorno = "-- Chamado: ???\n" +
                          "-- Servidor: AWSBR1PDCLIDB05\n" +
                          "-- Banco: BO_WTM_LINDE\n" +
                          "-- Tabela: MC1_InvoiceSerie\n"+
                          "\n\n --1º\nUPDATE MC1_InvoiceSerie SET nLastInvoice =" + atual + " WHERE cidUser = '" + usuario + "' AND cIDBranchInvoice = '" + branch + "'";
            }else{
              retorno = retorno.concat(sql);
            }            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO CONSULTAR emissaoNotasMesser(String usuario): \n" + ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);                        
            c.close();
        }finally{
            return retorno;
        }
    }    
}