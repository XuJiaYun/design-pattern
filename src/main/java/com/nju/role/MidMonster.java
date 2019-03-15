package com.nju.role;

import java.awt.*;

public class MidMonster extends Monster{
    private String name = "beta";
    private int life = 100;
    private int attack = 20;
    private int defend = 10;

    public MidMonster(int local_x, int local_y) {
        super(local_x, local_y);
    }

    @Override
    public void draw(){
        setImg(Toolkit.getDefaultToolkit().getImage("/Users/ywh/IdeaProjects/alpha/src/main/resources/Pictures/MidMonster.JPG"));
    }
}

