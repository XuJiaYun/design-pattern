package com.nju.role;

public class Weapon{
    private String name = "剑";
    private int level = 1;
    private int attackPoint = level*10;

    public int getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }
}

