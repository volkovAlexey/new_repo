package com.my_company.task5;

import java.util.Objects;

public class Liquid {
    private int density;
    private String color;
    private boolean isSparkling;

    Liquid(int density, String color, boolean isSparkling) {
        this.density = density;
        this.color = color;
        this.isSparkling = isSparkling;
    }

    public int getDensity() {
        return density;
    }

    public String getColor() {
        return color;
    }

    public boolean isSparkling() {
        return isSparkling;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Liquid liquid = (Liquid) obj;
        return getDensity() == liquid.getDensity()
                && isSparkling() == liquid.isSparkling()
                && getColor().equals(liquid.getColor());
    }
}
