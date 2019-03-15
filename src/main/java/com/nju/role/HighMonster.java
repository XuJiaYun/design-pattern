package com.nju.role;

import com.nju.util.GameUtil;

import java.awt.*;

public class HighMonster implements Role{
    private String name = "gama";
    private int life = 150;
    private int attack = 30;
    private int defend = 15;
    private Image img = GameUtil.getImage("/Users/ywh/IdeaProjects/alpha/src/main/resources/Pictures/HighMonster.jpeg");


    public void attack() {
        System.out.println(name+"造成"+attack+"点伤害");
    }
}

