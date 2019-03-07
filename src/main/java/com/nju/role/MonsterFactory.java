package com.nju.role;

public class MonsterFactory {
    public static Role createLowMonster(){
        return new LowMonster();
    }

    public static Role createMidMonster() {
        return new MidMonster();
    }

    public static Role createHighMonster(){
        return new HighMonster();
    }
}
