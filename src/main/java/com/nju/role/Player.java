package com.nju.role;

import java.awt.*;

public class Player extends Role{
    private String name;
    private int width = 50;
    private int height = 50;
    private int attack;
    private int defend;
    private int life;
    private Weapon weapon;
    private Armour armour;
    private String img;

    public Player(int local_x, int local_y) {
        this.local_x = local_x;
        this.local_y = local_y;
    }

    @Override
    public void draw() {
        setImg(Toolkit.getDefaultToolkit().getImage("/Users/ywh/IdeaProjects/alpha/src/main/resources/Pictures/Player.png"));
    }
}
