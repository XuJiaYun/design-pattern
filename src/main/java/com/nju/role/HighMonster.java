package com.nju.role;

import java.awt.*;

public class HighMonster extends Monster{
    private String name = "gama";
    private int life = 150;
    private int attack = 30;
    private int defend = 15;


    public HighMonster(int local_x, int local_y) {
        super(local_x, local_y);
    }

    @Override
    public void draw(){
        setImg(Toolkit.getDefaultToolkit().getImage("/Users/ywh/IdeaProjects/alpha/src/main/resources/Pictures/HighMonster.png"));
    }

}

