package com.nju.window;

public class ReThread extends Thread {
    MyPanel mainJpanel;
    public ReThread(MyPanel mainJpanel){
        this.mainJpanel=mainJpanel;
    }
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(10);
            } catch (Exception e) {

                e.printStackTrace();
            }
            mainJpanel.repaint();
        }
    }
}
