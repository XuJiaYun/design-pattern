package com.nju.window;

public class ReThread extends Thread {
    MainJpanel mainJpanel;
    public ReThread(MainJpanel mainJpanel){
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
