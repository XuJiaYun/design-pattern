package com.nju.role;

public class Client {
    public static void main(String[] args) {
        MonsterFactory factory = new MonsterFactory();
        Role lm = factory.createLowMonster();
        lm.attack();
    }
}
