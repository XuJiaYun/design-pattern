package com.nju.role;

import com.nju.util.GameUtil;

import java.awt.*;

public class LowMonster implements Role{
    private String name = "alpha";
    private int life = 50;
    private int attack = 10;
    private int defend = 5;
    private Image img = GameUtil.getImage("/Users/ywh/IdeaProjects/alpha/src/main/resources/Pictures/LowMonster.jpeg");


    public void attack() {
        System.out.println(name+"造成"+attack+"点伤害");
    }
}

