package com.nju.role;

import java.awt.*;

public class LowMonster extends Monster{
    private String name = "alpha";
    private int life = 50;
    private int attack = 10;
    private int defend = 5;

    public LowMonster(int local_x, int local_y) {
        super(local_x, local_y);
    }

    @Override
    public void draw() {
        setImg(Toolkit.getDefaultToolkit().getImage("/Users/ywh/IdeaProjects/alpha/src/main/resources/Pictures/LowMonster.JPG"));
    }



}

