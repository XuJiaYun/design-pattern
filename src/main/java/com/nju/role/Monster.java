package com.nju.role;

import java.awt.*;

public abstract class Monster {
    private String name;
    private int attack;
    private int defend;
    private int life;
    private Image img;
    int local_x;
    int local_y;
    private int width = 50;
    private int height = 50;
    public void attack(){
        System.out.println(name+"造成"+attack+"点伤害");
    }

    public Monster(int local_x, int local_y) {
        this.local_x = local_x;
        this.local_y = local_y;
    }

    public abstract void draw();

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

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public int getLocal_x() {
        return local_x;
    }

    public void setLocal_x(int local_x) {
        this.local_x = local_x;
    }

    public int getLocal_y() {
        return local_y;
    }

    public void setLocal_y(int local_y) {
        this.local_y = local_y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
