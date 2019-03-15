package com.nju.window;

import com.nju.role.MyPlayerBuilder;
import com.nju.role.MyPlayerDirector;
import com.nju.role.Player;
import com.nju.util.Constant;
import com.nju.util.GameUtil;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    JMenuBar menuBar = new JMenuBar();
    JButton button = new JButton();
    public MyFrame(){
        initFrame();
    }

    public void initFrame(){

    }

    Image bg = GameUtil.getImage("/Users/ywh/IdeaProjects/alpha/src/main/resources/Pictures/bg.jpeg");
    Player player = new MyPlayerDirector(new MyPlayerBuilder()).directPlayer();

    public void paint(Graphics g) {

        g.drawImage(bg, 0, 0, null);
        g.drawImage(player.getImg(), 200, 200, null);

        }
        if(!player.isLive()) {
            printInfo(g,"GameOver!",50,100,100,Color.WHITE);
            long period = (endTime.getTime()/-startTime.getTime())/1000;
            printInfo(g,"存活时间:"+period+"秒",50,100,150,Color.WHITE);

        }
    }

    public void printInfo(Graphics g,String str,int size,double x,double y,Color color) {
        Color c = g.getColor();
        g.setColor(color);
        Font f = new Font("宋体",Font.BOLD,size);
        g.setFont(f);
        g.drawString(str,(int)x,(int)y);
        g.setColor(c);
    }


    private Image offScreenImage = null;  //利用双缓冲技术消除闪烁
    public void update(Graphics g) {
        if(offScreenImage==null) {
            offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
        }

        Graphics gOff = offScreenImage.getGraphics();

        paint(gOff);
        g.drawImage(offScreenImage, 0, 0, null);
    }

}