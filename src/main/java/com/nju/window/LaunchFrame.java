package com.nju.window;

import javax.swing.*;

public class LaunchFrame extends JFrame {

    public static int Frame_Width = 500;
    public static int Frame_Height = 500;
    MyPanel panel = new MyPanel();

    public void launchFrame() {
        //窗口大小及位置
        setSize(Frame_Width, Frame_Height);
        setLocation(500, 100);

        add(panel);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        new LaunchFrame().launchFrame();
    }


}
