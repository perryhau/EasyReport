/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.webx.easyreport.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.webx.easyreport.test.domain.Product;
import org.webx.easyreport.factory.ReportFactory;
import org.webx.easyreport.test.dao.TestRepositoryProducts;

/**
 *
 * @author webcloud
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        ReportFactory<Product> rf = new ReportFactory<Product>();

        rf.setTitle("Relatorio de testes");
        rf.setSubTitle("Apenas um teste qualquer de relatorio");
        rf.setGrandTotalTitle("Totais");

        rf.generateReport(TestRepositoryProducts.getDummyCollection(), Product.class);

//        List<String> fields = new ArrayList<String>();
//        fields.add("state");
//        fields.add("productLine");
//        fields.add("quantity");
//        fields.add("id"); /* adicionando um campo que não estava originalmente configurado */

//        HashMap<String,Boolean> customCfg = new HashMap<String, Boolean>();
//        customCfg.put("groupingCriteria", Boolean.FALSE);
//
//        HashMap<String,Boolean> customCfg2 = new HashMap<String, Boolean>();
//        customCfg2.put("sumable", Boolean.FALSE);
//
//        HashMap<String,Boolean> customCfg3 = new HashMap<String, Boolean>();
//        customCfg3.put("groupingCriteria", Boolean.FALSE);

        /* adicionando um campo que não estava originalmente configurado */
//        HashMap<String,String> customCfg4 = new HashMap<String, String>();
//        customCfg4.put("property", "id");
//        customCfg4.put("className", Long.class.getName());
//        customCfg4.put("title", "ID");


//        HashMap<String, HashMap> customCfgv = new HashMap<String, HashMap>();
//        customCfgv.put("productLine", customCfg);
//        customCfgv.put("quantity", customCfg2);
//        customCfgv.put("state", customCfg3);
//        customCfgv.put("id", customCfg4);/* adicionando um campo que não estava originalmente configurado */

//        rf.generateReport(TestRepositoryProducts.getDummyCollection(), fields, Product.class);
//        rf.generateReport(TestRepositoryProducts.getDummyCollection(), fields, customCfgv, Product.class);
    }

}
