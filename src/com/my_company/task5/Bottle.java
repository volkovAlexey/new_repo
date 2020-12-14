package com.my_company.task5;

public class Bottle {
    private int volume;
    private Liquid liquid;

    Bottle(int volume, Liquid liquid) {
        this.volume = volume;
        this.liquid = liquid;
    }

    public int getVolume() {
        return volume;
    }

    public Liquid getLiquid() {
        return liquid;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Bottle bottle = (Bottle) obj;
        return getVolume() == bottle.getVolume()
                && getLiquid().equals(bottle.getLiquid());
    }
}
