package com.nju.role;

public class MyPlayerBuilder implements PlayerBuilder{
    public Weapon buildWeapon() {
        return new Weapon();
    }

    public Armour buildArmour() {
        return new Armour();
    }
}
