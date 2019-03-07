package com.nju.role;

public class MidMonster implements Role{
    private String name = "beta";
    private int life = 100;
    private int attack = 20;
    private int defend = 10;

    public void attack() {
        System.out.println(name+"造成"+attack+"点伤害");
    }
}

