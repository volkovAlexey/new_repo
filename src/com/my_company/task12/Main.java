package com.my_company.task12;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Report report = new Report();
        List<Row> rows = new ArrayList<>();

        Row row1 = new Row();
        Row row2 = new Row();

        row1.cells.add("a");
        row1.cells.add("b");
        row1.cells.add("c");

        row2.cells.add("d");
        row2.cells.add("e");
        row2.cells.add("f");

        rows.add(row1);
        rows.add(row2);

        report.rows = rows;

        for (Row temp : rows) {
            System.out.println(temp.cells.toString());
        }
    }
}