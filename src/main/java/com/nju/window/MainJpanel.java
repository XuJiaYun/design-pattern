package com.nju.window;

import com.nju.role.Player;

import javax.swing.*;
import java.awt.*;

public class MainJpanel extends JPanel {
    //声明全局的begin对象
    Begin begin;
    //声明玩家对象
    public Player player=new Player();
    //声明一个图片对象
    ImageIcon bg = new ImageIcon("/Users/ywh/IdeaProjects/alpha/src/main/resources/Pictures/bg.jpeg");
    ImageIcon pimg=new ImageIcon(player.getImg());

    //面板加载方法
    public void init(Begin begin) {
        this.begin = begin;
        //启用刷新面板线程
        ReThread rt = new ReThread(this);
        rt.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //在面板上面出玩家
        g.drawImage(pimg.getImage(), 300, 100 ,40, 40, this);
        g.drawImage(bg.getImage(), 0, 0 ,1920, 1200, this);
    }
}
