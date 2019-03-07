package com.nju.role;

public class LowMonster implements Role{
    private String name = "alpha";
    private int life = 50;
    private int attack = 10;
    private int defend = 5;


    public void attack() {
        System.out.println(name+"造成"+attack+"点伤害");
    }
}

