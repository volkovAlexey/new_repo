package com.my_company.task6;

public enum Color {
    RED("#ff0000"),

    GREEN("#00ff00"),

    BLUE("#0000ff"),

    WHITE("#ffffff"),

    BLACK("#ffffff");

    private String hex;

    Color(String hex) {
        this.hex = hex;
    }

    public String getHex() {
        return hex;
    }
}
