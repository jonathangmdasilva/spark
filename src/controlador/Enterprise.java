
package controlador;


public class Enterprise {
    
        public String gerarInsertTaxparameterExt (String brccComItem,String brccSemItem,String cliente,String usuario,String produtos){        
                String insert = "INSERT INTO MC1_TaxParameterExt\n" +
                                "(cIDCompany\n" +
                                ",cIDCustomer\n" +
                                ",cIDProduct\n" +
                                ",cNcm\n" +
                                ",xProductOrigin\n" +
                                ",nBaseValue\n" +
                                ",nCFOP\n" +
                                ",cDescriptionCFOP\n" +
                                ",cFlagICMS\n" +
                                ",cFlagSumICMSST\n" +
                                ",nOptionPIS\n" +
                                ",nOptionCOFINS\n" +
                                ",nOptionIPI\n" +
                                ",nOptionICMS\n" +
                                ",cCalculateIPI\n" +
                                ",cIPISumICMS\n" +
                                ",nLowICMS\n" +
                                ",nPercICMS\n" +
                                ",nPercentageIPI\n" +
                                ",nPercentagePIS\n" +
                                ",nPercentageCOFINS\n" +
                                ",nPercentageReductionIPI\n" +
                                ",cIDInvoiceMessageICMS\n" +
                                ",cIDInvoiceMessageIPI\n" +
                                ",cIDInvoiceMessagePIS\n" +
                                ",cIDInvoiceMessageCOFINS\n" +
                                ",cIDTerritory\n" +
                                ",cIDBranchInvoice\n" +
                                ",cIDTrip\n" +
                                ",cCnpj\n" +
                                ",cCpf\n" +
                                ",cFCI\n" +
                                ",nOptionEnqIPI\n" +
                                ",cIDInvoiceMessageEnqIPI\n" +
                                ",nPercDescICMSBH\n" +
                                ",nPercDiffParcICMS\n" +
                                ",nPercFECP\n" +
                                ",nPercDestICMS\n" +
                                ",nBasePercFECP\n" +
                                ",cIEST\n" +
                                ",nBaseRetPis\n" +
                                ",nBaseRetConfins\n" +
                                ",nBaseRetCSLL\n" +
                                ",nBaseRetIRRF\n" +
                                ",nPercRetPis\n" +
                                ",nPercRetConfins\n" +
                                ",nPercRetCSLL\n" +
                                ",nPercRetIRRF\n" +
                                ",MC1Enabled\n" +
                                ",mc1LastUpdate\n" +
                                ",nFreightVariable ----AQUIII\n" +
                                ",nFreightFixed\n" +
                                ",nPercICMSFull\n" +
                                ")\n" +
                                "SELECT\n" +
                                "'01' AS 'cIDCompany',\n" +
                                "B.KUNNR_SH AS 'cIDCustomer',\n" +
                                "B.MATNR AS 'cIDProduct',\n" +
                                "--dbo.fn_GetNumeric(C.STEUC) AS CNCM,\n" +
                                "REPLACE(C.STEUC,'.',''),\n" +
                                "D.MTORG,\n" +
                                "B.PRICE,\n" +
                                "SUBSTRING(B.J_1BCFOP, 1, 4),\n" +
                                "B.CFOTXT,\n" +
                                "'1',\n" +
                                "'0',\n" +
                                "CAST(B.TAXSI5 as int),\n" +
                                "CAST(B.TAXSI4 as int),\n" +
                                "CAST(B.TAXSI2 as int),\n" +
                                "CAST(B.TAXSIT as int),\n" +
                                "CASE WHEN B.IPVA <> 0 THEN 'S' ELSE 'N'END,\n" +
                                "'0',\n" +
                                "CAST(CASE WHEN B.ICBS = 100 THEN 0 WHEN B.ICBS = 0 THEN 100 ELSE ( 100 - B.ICBS) END as numeric(18, 5)),\n" +
                                "CAST(CASE WHEN B.ZBI7 = 0 THEN B.ICVA ELSE B.ZBI7 END as numeric(18, 5)),\n" +
                                "B.IPVA,\n" +
                                "B.BPI1,\n" +
                                "B.BCO1,\n" +
                                "0.00,\n" +
                                "B.ICMS_TEXT,\n" +
                                "B.IPI_TEXT,\n" +
                                "B.PIS_TEXT,\n" +
                                "B.COFINS_TEXT,\n'" +
                                usuario + "',\n" +
                                "B.WERKS,\n" +
                                "'" + brccSemItem + "' AS cIDTrip, --Inserir a BRCC que não tem o produto\n" +
                                "B.AUTXML_CNPJ,\n" +
                                "B.AUTXML_CPF,\n" +
                                "B.FCI_NUMBER,\n" +
                                "ISNULL(B.CENQOUT,999),\n" +
                                "B.CENQOUT_TXT,\n" +
                                "CAST(CASE WHEN B.ZBI7 = 0 THEN B.ZBI7 ELSE B.ICVA END as numeric(18, 5)),\n" +
                                "CAST(B.ZBI8 as numeric(18, 5)),\n" +
                                "CAST(B.ISFR as numeric(18, 5)),\n" +
                                "CAST(B.ISIC as numeric(18, 5)),\n" +
                                "CAST(B.ISFB as numeric(18, 5)),\n" +
                                "'',\n" +
                                "B.BW11,\n" +
                                "B.BW21,\n" +
                                "B.BW31,\n" +
                                "B.BW41,\n" +
                                "B.BW12,\n" +
                                "B.BW22,\n" +
                                "B.BW32,\n" +
                                "B.BW42,\n" +
                                "0,\n" +
                                "CAST(GETDATE () AS DATE) AS 'mc1LastUpdate',\n" +
                                "B.ZFMC AS 'nFreightVariable',\n" +
                                "B.ZASU AS 'nFreightFixed',\n" +
                                "B.ZIFU AS 'nPercICMSFull'\n" +
                                "FROM BO_WTM_ETL_LINDE..ETL_LGCSDTBRHH_HD A WITH(NOLOCK)\n" +
                                "INNER JOIN BO_WTM_ETL_LINDE..ETL_LGCSDTBRHH_OU B WITH(NOLOCK) ON A.MANDT = B.MANDT AND A.USER_HH = B.USER_HH AND A.VBELN_US = B.VBELN_US\n" +
                                "LEFT JOIN BO_WTM_ETL_LINDE..ETL_MARC C WITH(NOLOCK) ON B.MANDT = C.MANDT AND B.MATNR = C.MATNR AND B.WERKS = C.WERKS\n" +
                                "LEFT JOIN BO_WTM_ETL_LINDE..ETL_MBEW D WITH(NOLOCK) ON B.MANDT = D.MANDT AND B.MATNR = D.MATNR AND B.WERKS = D.BWKEY\n" +
                "WHERE A.VBELN_US = '" + brccComItem + "'\t-- BRCC COM OS ITENS\n" +
                        "AND B.KUNNR_SH = '"+ cliente + "'\t-- CÓDIGO DO CLIENTE\n" +
                    "AND B.MATNR IN " + produtos + "\t-- PRODUTO(S)";
        return insert;
    }
        
        
    public String gerarUpdateInvoiceEmissionBaseExt (String chaves){
        String insert = "SELECT datacriacaoNOTAFISCAL,chaveacessoNOTAFISCAL,*FROM NFE_LINDE..tb1501_Notas_Fiscais WHERE chaveacessoNOTAFISCAL IN " + chaves + "\n" +
        "\n" +
        "\n" +
        "UPDATE tb1501_Notas_Fiscais SET datacriacaoNOTAFISCAL = GETDATE() WHERE chaveacessoNOTAFISCAL IN " + chaves;
        return insert;
    }
    
    public String gerarUpdateNotaDenegada (String chave,String pedido,String codigo){
        String update = "-- QUERYS BKP\n" +
            "SELECT situacaonfeNOTAFISCAL, * FROM NFE_LINDE..tb1501_Notas_Fiscais WHERE chaveacessoNOTAFISCAL = '" + chave + "'\n" +
            "SELECT cXMLCancellation, xInvoiceResquest, * FROM BO_WTM_LINDE..MC1_InvoiceEmission WHERE cidOrder = '" + pedido + "'\n" +
            "\n" +
            "\n" +
            "--QUERYS AJUSTE\n" +
            "UPDATE tb1501_Notas_Fiscais SET situacaonfeNOTAFISCAL = " + codigo + " WHERE chaveacessonotafiscal = '" + chave + "' \n" +
            "UPDATE MC1_InvoiceEmission SET xInvoiceResquest = '01',cXMLCancellation = NULL, mc1LastUpdate = GETDATE() WHERE cidOrder ='" + pedido + "'";
        return update;
    }
                
    public String gerarSqlPaliativo(String pedido,String brcc){
        String sql = "--1º INSERT Checks\n" +
        "INSERT INTO MC1_OrderCheckINExt (cIDOrder,cIDCompany,ddateCheckin,mc1Enabled,mc1LastUpdate) VALUES ('" + pedido + "','01',GETDATE(),1,GETDATE())\n" +
        "INSERT INTO MC1_OrderCheckOutExt(cIDOrder,cIDCompany,ddateCheckOut,mc1Enabled,mc1LastUpdate) VALUES ('" + pedido + "','01',GETDATE(),1,GETDATE())\n" +
        "\n" +
        "\n" +
        "--2º INSERT NA MC1_OrderItem\n" +
        "INSERT INTO MC1_OrderItem (\n" +
        "cIDOrder\n" +
        ",cIDProduct\n" +
        ",cIDCompany\n" +
        ",nSeq\n" +
        ",nAmount\n" +
        ",nUnitValue\n" +
        ",nTotalValue\n" +
        ",cIDUserLastUpdate\n" +
        ",nWeight\n" +
        ",xIDPaymentCondition\n" +
        ",cIDBranchInvoice\n" +
        ",cIDAddressDelivery\n" +
        ",cIDCustomer\n" +
        ",xIDAddressType\n" +
        ",xIDUnitMeasureType\n" +
        ",cIDProductLotNumber\n" +
        ",nFreeGoods\n" +
        ",dExpectedBilling\n" +
        ",dExpectedDelivery\n" +
        ",xIncoterms1\n" +
        ",xIncoterms2\n" +
        ",xGroupPrice\n" +
        ",mc1Enabled\n" +
        ",mc1LastUpdate\n" +
        ",dExport\n" +
        ",xMessageException\n" +
        ",nSeqLegacy) \n" +
        "SELECT \n" +
        "cIDOrder\n" +
        ",cIDProduct\n" +
        ",cIDCompany\n" +
        ",CASE  \n" +
        "   WHEN nSeq = 10 THEN '10101001'\n" +
        "   WHEN nSeq = 30 THEN '10301001'\n" +
        "   WHEN nSeq = 50 THEN '10501001'\n" +
        "   WHEN nSeq = 70 THEN '11701001'\n" +
        "   WHEN nSeq = 90 THEN '10901001'\n" +
        "   WHEN nSeq = 110 THEN '110'\n" +
        "   WHEN nSeq = 130 THEN '130'\n" +
        "   WHEN nSeq = 150 THEN '150'\n" +
        "   WHEN nSeq = 170 THEN '170'\n" +
        "   WHEN nSeq = 190 THEN '190'\n" +
        "END as 'nSeq'\n" +
        ",'0.00000'\n" +
        ",nUnitValue\n" +
        ",'0.00000'\n" +
        ",cIDUserLastUpdate\n" +
        ",nWeight\n" +
        ",xIDPaymentCondition\n" +
        ",cIDBranchInvoice\n" +
        ",cIDAddressDelivery\n" +
        ",cIDCustomer\n" +
        ",xIDAddressType\n" +
        ",xIDUnitMeasureType\n" +
        ",cIDProductLotNumber\n" +
        ",nFreeGoods\n" +
        ",dExpectedBilling\n" +
        ",dExpectedDelivery\n" +
        ",xIncoterms1\n" +
        ",xIncoterms2\n" +
        ",xGroupPrice\n" +
        ",mc1Enabled\n" +
        ",GETDATE()\n" +
        ",dExport\n" +
        ",xMessageException\n" +
        ",CASE  \n" +
        "   WHEN nSeq = 10 THEN '10101001'\n" +
        "   WHEN nSeq = 30 THEN '10301001'\n" +
        "   WHEN nSeq = 50 THEN '10501001'\n" +
        "   WHEN nSeq = 70 THEN '11701001'\n" +
        "   WHEN nSeq = 90 THEN '10901001'\n" +
        "   WHEN nSeq = 110 THEN '110'\n" +
        "   WHEN nSeq = 130 THEN '130'\n" +
        "   WHEN nSeq = 150 THEN '150'\n" +
        "   WHEN nSeq = 170 THEN '170'\n" +
        "   WHEN nSeq = 190 THEN '190'\n" +                
        "END as 'nSeq'\n" +
        "FROM MC1_OrderItem\n" +
        "WHERE cIDOrder = '" + pedido + "'\n" +
        "\n" +
        "\n" +
        "--3° UPDATE NA MC1_OrderItem\n" +
        "UPDATE MC1_OrderItem SET mc1Enabled = 0,mc1LastUpdate = GETDATE() WHERE cidOrder = '" + pedido + "'  AND nSeq IN (SELECT nSeq FROM MC1_OrderItem WHERE cidOrder = '" + pedido + "' AND nSeq < 200)\n" +
        "\n" +
        "\n" +
        "--4º INSERT NA MC1_OrderItemExt\n" +
        "INSERT INTO MC1_OrderItemExt (\n" +
        "cIDOrder\n" +
        ",cIDProduct\n" +
        ",cIDCompany\n" +
        ",nSeq\n" +
        ",cIDProductLotNumber\n" +
        ",nAmountDelivered\n" +
        ",nAmountReturned\n" +
        ",nAmountBonus \n" +
        ",XIDReasonReturn\n" +
        ",mc1Enabled\n" +
        ",mc1LastUpdate\n" +
        ",cIDUserLastUpdate)\n" +
        "SELECT \n" +
        "cIDOrder\n" +
        ",cIDProduct\n" +
        ",cIDCompany\n" +
        ",CASE  \n" +
        "   WHEN nSeq = 10 THEN '10101001'\n" +
        "   WHEN nSeq = 30 THEN '10301001'\n" +
        "   WHEN nSeq = 50 THEN '10501001'\n" +
        "   WHEN nSeq = 70 THEN '11701001'\n" +
        "   WHEN nSeq = 90 THEN '10901001'\n" +
        "   WHEN nSeq = 110 THEN '110'\n" +
        "   WHEN nSeq = 130 THEN '130'\n" +
        "   WHEN nSeq = 150 THEN '150'\n" +
        "   WHEN nSeq = 170 THEN '170'\n" +
        "   WHEN nSeq = 190 THEN '190'\n" +                
        "END as 'nSeq'\n" +
        ",cIDProductLotNumber\n" +
        ",'0.00000' AS 'nAmountDelivered'\n" +
        ",'0.00000' AS 'nAmountReturned'\n" +
        "--,'-' + nAmount AS 'nAmountReturned'\n" +
        ",CAST (-nAmount AS VARCHAR) AS 'nAmountBonus'\n" +
        ",NULL AS 'XIDReasonReturn'\n" +
        ",1 AS 'mc1Enabled'\n" +
        ",GETDATE()\n" +
        ",cIDUserLastUpdate\n" +
        "FROM dbo.MC1_OrderItem WHERE cIDOrder = '" + pedido + "' AND mc1Enabled = 0\n" +
        "\n" +
        "\n" +
        "--5º INSERT NA MC1_OrderExt\n" +
        "INSERT INTO dbo.MC1_OrderExt (\n" +
        "    cIDOrder,\n" +
        "    cIDCompany,\n" +
        "    cIDCustomer,\n" +
        "    cIDTerritory,\n" +
        "    mc1Enabled,\n" +
        "    mc1LastUpdate\n" +
        ")\n" +
        "SELECT \n" +
        "    cIDOrder  AS 'cIDOrder'\n" +
        "    ,cIDCompany AS 'cIDCompany'\n" +
        "    ,cIDCustomer AS 'cIDCustomer'\n" +
        "    ,cIDTerritory AS 'cIDTerritory'\n" +
        "    ,1 AS 'mc1Enabled'\n" +
        "    ,GETDATE() AS  'mc1LastUpdate'        \n" +
        "FROM MC1_Order WHERE cidOrder = '" + pedido + "'\n" +
        "\n" +
        "\n" +
        "--6º UPDATE NA MC1_Order (FINALIZAR PEDIDO)\n" +
        "UPDATE MC1_Order SET lFinished = 1, xOrderStatus = '06',dSynced = GETDATE(), mc1LastUpdate = GETDATE() WHERE cIdOrder = '" + pedido + "' AND cIDTrip = '" + brcc + "'";
        return sql;
    }
    
    public String gerarSqlPaliativoReenviarPedido(String pedido,String produto,String seq,String qtdPlanejada, String qtdVendida,String qtdRetorno,String totalItem){
        String sql = "";
        sql = "--1° ITENS DO PEDIDO \n" +
                "UPDATE MC1_OrderItem SET nAmount = '" + qtdVendida + "' ,nTotalValue = '" + totalItem + "' WHERE cIDOrder = '"+pedido + "' AND nSeq = '" + seq + "'\n" +
                "\n" +
                "--2º EXTENDS DO ITEM DE PEDIDO\n" +
                "UPDATE MC1_OrderItemExt SET nAmountDelivered = '"+ qtdVendida + "',nAmountReturned = '" + qtdVendida + "',[nAmountBonus ] = '"+ qtdRetorno + "' WHERE cIDOrder = '" + pedido + "' AND nSeq = '" +seq + "'\n" +
                "\n" +
                "--3º CAPA\n" +
                "UPDATE MC1_Order SET dExport = NULL,mc1Lastupdate = GETDATE() WHERE cIDOrder IN ('" + pedido + "')";
        return sql;
    }
    
    public String gerarSqlPaliativoCustomerPartnerExt(String cliente,String brcc){
        String sql = "";
        sql = "-- 1º \n" +
            "INSERT INTO MC1_CustomerPartnerExt(\n" +
            "cIDCompany\n" +
            ",cIDCustomer\n" +
            ",cIDTrip\n" +
            ",xSalesOrganization\n" +
            ",xChannelDistribution\n" +
            ",xSector\n" +
            ",xPartnerType\n" +
            ",nSequence\n" +
            ",cIDCustomerPartner\n" +
            ",mc1Enabled\n" +
            ",mc1LastUpdate\n" +
            ",lOrigin\n" +
            ",cIDUserLastUpdate\n" +
            ")\n" +
            "SELECT \n" +
            "cIDCompany\n" +
            ",cIDCustomer\n" +
            ",'" + brcc + "' AS cIDTrip\n" +
            ",xSalesOrganization\n" +
            ",xChannelDistribution\n" +
            ",xSector\n" +
            ",xPartnerType\n" +
            ",'"+ (Integer.parseInt(brcc )+1) + "' AS nSequence\n" +
            ",cIDCustomerPartner\n" +
            ",'1' AS mc1Enabled\n" +
            ",GETDATE() AS mc1LastUpdate\n" +
            ",lOrigin\n" +
            ",cIDUserLastUpdate\n" +
            "FROM MC1_CustomerPartnerExt WHERE cIDCustomer = '" + cliente + "' AND  xPartnerType = 1\n" +
            "AND cidtrip = (SELECT TOP 1 cIDTrip FROM MC1_CustomerPartnerExt WHERE cIDCustomer = '" + cliente + "')\n" +
            "\n\n" +
            "-- 2º \n" +
            "INSERT INTO MC1_CustomerPartnerExt(\n" +
            "cIDCompany\n" +
            ",cIDCustomer\n" +
            ",cIDTrip\n" +
            ",xSalesOrganization\n" +
            ",xChannelDistribution\n" +
            ",xSector\n" +
            ",xPartnerType\n" +
            ",nSequence\n" +
            ",cIDCustomerPartner\n" +
            ",mc1Enabled\n" +
            ",mc1LastUpdate\n" +
            ",lOrigin\n" +
            ",cIDUserLastUpdate\n" +
            ")\n" +
            "SELECT \n" +
            "cIDCompany\n" +
            ",cIDCustomer\n" +
            ",'" + brcc + "' AS cIDTrip\n" +
            ",xSalesOrganization\n" +
            ",xChannelDistribution\n" +
            ",xSector\n" +
            ",xPartnerType\n" +
            ",'"+ (Integer.parseInt(brcc )+2) + "' AS nSequence\n" +
            ",cIDCustomerPartner\n" +
            ",'1' AS mc1Enabled\n" +
            ",GETDATE() AS mc1LastUpdate\n" +
            ",lOrigin\n" +
            ",cIDUserLastUpdate\n" +
            "FROM MC1_CustomerPartnerExt WHERE cIDCustomer = '" + cliente + "' AND  xPartnerType = 2\n" +
            "AND cidtrip = (SELECT TOP 1 cIDTrip FROM MC1_CustomerPartnerExt WHERE cIDCustomer = '" + cliente + "')\n" +
            "\n\n" +
            "-- 3º \n" +
            "INSERT INTO MC1_CustomerPartnerExt(\n" +
            "cIDCompany\n" +
            ",cIDCustomer\n" +
            ",cIDTrip\n" +
            ",xSalesOrganization\n" +
            ",xChannelDistribution\n" +
            ",xSector\n" +
            ",xPartnerType\n" +
            ",nSequence\n" +
            ",cIDCustomerPartner\n" +
            ",mc1Enabled\n" +
            ",mc1LastUpdate\n" +
            ",lOrigin\n" +
            ",cIDUserLastUpdate\n" +
            ")\n" +
            "SELECT \n" +
            "cIDCompany\n" +
            ",cIDCustomer\n" +
            ",'" + brcc + "' AS cIDTrip\n" +
            ",xSalesOrganization\n" +
            ",xChannelDistribution\n" +
            ",xSector\n" +
            ",xPartnerType\n" +
            ",'"+ (Integer.parseInt(brcc )+3) + "' AS nSequence\n" +
            ",cIDCustomerPartner\n" +
            ",'1' AS mc1Enabled\n" +
            ",GETDATE() AS mc1LastUpdate\n" +
            ",lOrigin\n" +
            ",cIDUserLastUpdate\n" +
            "FROM MC1_CustomerPartnerExt WHERE cIDCustomer = '" + cliente + "' AND  xPartnerType = 3\n" +
            "AND cidtrip = (SELECT TOP 1 cIDTrip FROM MC1_CustomerPartnerExt WHERE cIDCustomer = '" + cliente + "')";
        return sql;
    }
    
    public String gerarSqlPaliativoEndereco(String cliente){
        String sql = "";
        sql = "--Integração:  4798 (MC1_Address - fazer o integration test)';\n" +
             "SELECT *FROM MC1_Address WHERE cidCustomer = '" + cliente + "';\n" +
              "SELECT *FROM BO_WTM_ETL_LINDE..ETL_ADRC WHERE ADDRNUMBER = (SELECT ADRNR FROM BO_WTM_ETL_LINDE..ETL_KNA1 WHERE KUNNR = '"+ cliente +"');\n" +
              "UPDATE ETL_ADRC SET CITY2 = '' WHERE ADDRNUMBER = (SELECT ADRNR FROM BO_WTM_ETL_LINDE..ETL_KNA1 WHERE KUNNR = '" + cliente + "');";
        return sql;
    }
    
    public String gerarSqlPaliativoMC1_OrderItemDetail(String pedido){
        String sql = "";
        sql = "INSERT INTO MC1_OrderItemDetail (cIDOrder, cIDProduct, cIDCompany, nSeq, cIDStep, cIDPricing, nValue, nPercentage, mc1Enabled, mc1LastUpdate, dExport, xMessageException)\n" +
              "SELECT cIDOrder, cIDProduct, cIDCompany, nSeq, cIDStep, cIDPricing, nValue, nPercentage, 1[mc1Enabled], getdate()[mc1LastUpdate], NULL [dExport], xMessageException\n" +
              "FROM MC1_OrderItemDetail_History WITH(NOLOCK) WHERE cIDorder = '" + pedido + "';";
        return sql;
    }
    
    
    public String gerarInsertInvoiceCancellationExt (String pedido){
        String insert = "INSERT INTO MC1_InvoiceCancellationExt select A.cIDCompany ,A.cIDInvoice ,cast(A.cSerie as int) 'cSerie' ,a.cForm ,A.cIDBranchInvoice ,GETDATE() 'dCancel' ,A.cXMLAuthorizedCancel 'cXML' ,SubString(cXMLSended,CHARINDEX('Id=\"NFe',cXMLSended)+7,44) 'cKey' ,SubString(cXMLAuthorizedCancel,CHARINDEX('\n" +
            "<nProt>',cXMLAuthorizedCancel)+7,15) 'Protocol' ,102 'nIDSefaz' ,1 'lOrigin' ,NULL 'dExport' ,1 'mc1Enabled' ,GETDATE() 'mc1LastUpdate' from mc1_invoiceemission A (NOLOCK) WHERE a.cidorder in ('"+ pedido +"')";
        return insert;
    }
    
}
