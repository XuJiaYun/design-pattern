package com.nju.role;

public class Armour{
    private String name = "盔甲";
    private int level = 1;
    private int defendPoint = 5*level;
    private int lifePoint = 10*level;


    public int getDefendPoint() {
        return defendPoint;
    }

    public void setDefendPoint(int defendPoint) {
        this.defendPoint = defendPoint;
    }

    public int getLifePoint() {
        return lifePoint;
    }

    public void setLifePoint(int lifePoint) {
        this.lifePoint = lifePoint;
    }
}
