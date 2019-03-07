package com.nju.role;

public class MyPlayerDirector implements PlayerDirector{
    private MyPlayerBuilder builder;

    public MyPlayerDirector(MyPlayerBuilder builder) {
        this.builder = builder;
    }

    public Player directPlayer() {
        Weapon weapon = builder.buildWeapon();
        Armour armour = builder.buildArmour();

        Player player = new Player();
        player.setAttack(weapon.getAttackPoint());
        player.setDefend(armour.getDefendPoint());
        return player;
    }
}
