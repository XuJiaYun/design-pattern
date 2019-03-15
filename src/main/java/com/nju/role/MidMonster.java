package com.nju.role;

import com.nju.util.GameUtil;

import java.awt.*;

public class MidMonster implements Role{
    private String name = "beta";
    private int life = 100;
    private int attack = 20;
    private int defend = 10;
    private Image img = GameUtil.getImage("/Users/ywh/IdeaProjects/alpha/src/main/resources/Pictures/MidMonster.jpeg");

    public void attack() {
        System.out.println(name+"造成"+attack+"点伤害");
    }
}

