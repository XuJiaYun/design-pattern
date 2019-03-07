package com.nju.role;

public class Player implements Role{
    private String name;
    private int attack;
    private int defend;
    private int life;
    private Weapon weapon;
    private Armour armour;

    public void attack() {
        System.out.println("造成"+attack+"点伤害");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefend() {
        return defend;
    }

    public void setDefend(int defend) {
        this.defend = defend;
    }



}
