package com.example.demo.models;

public class TableGenerator {

    public static String generaTabella(Integer numeroRigheTabella){
        String tabella = "";
        Table table = new Table();

        tabella += table.getBASE();

        tabella = tabella.replace("$ROW_HEAD$", table.getROW_HEAD());

        String rows = "";
        for(int i=0; i<numeroRigheTabella; i++)
            rows += table.getROW();
        tabella = tabella.replace("$ROWS$", rows);

        return tabella;
    }

}
