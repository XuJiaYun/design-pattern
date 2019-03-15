package com.nju.window;

import javax.swing.*;

public class LaunchFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    public static int Frame_Width = 500;
    public static int Frame_Height = 500;

    public void launchFrame() {
        //窗口大小及位置
        setSize(Frame_Width, Frame_Height);
        setLocation(1000, 100);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        new LaunchFrame().launchFrame();
    }


}
