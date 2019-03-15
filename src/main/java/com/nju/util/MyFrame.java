package com.nju.util;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {

    /*
     * 加载窗口
     */
    public void launchFrame() {
        setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
        setLocation(100,100);
        setVisible(true);

        new PaintThread().start();

        addWindowListener(new WindowAdapter(){

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });
    }

    class PaintThread extends Thread{
        public void run() {
            while(true) {
                repaint();
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

