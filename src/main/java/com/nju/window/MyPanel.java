package com.nju.window;

import com.nju.role.*;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    PlayerDirector director = new MyPlayerDirector(new MyPlayerBuilder());
    Player player = director.directPlayer();

    int id = (int) (Math.random()*2+1);
    Monster monster = new MonsterFactory().createMonster(id);

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
//        g.fillRect(0, 0, LaunchFrame.Frame_Width, LaunchFrame.Frame_Height);//背景涂黑

        //绘制我的角色
        player.draw();
        g.drawImage(player.getImg(), player.getLocal_x(), player.getLocal_y(), player.getWidth(), player.getHeight(),
                this);
        //随机绘制怪物
        monster.draw();
        g.drawImage(monster.getImg(), monster.getLocal_x(), monster.getLocal_y(), monster.getWidth(), monster.getHeight(),
                this);

    }

}
