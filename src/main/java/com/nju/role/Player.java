package com.nju.role;

import com.nju.util.GameUtil;

import java.awt.*;

public class Player implements Role{
    private String name;
    private int attack;
    private int defend;
    private int life;
    private Weapon weapon;
    private Armour armour;
    private Image img = GameUtil.getImage("/Users/ywh/IdeaProjects/alpha/src/main/resources/Pictures/Player.jpg");

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

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }
}
