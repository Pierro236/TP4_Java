package com.tp4.rpg;

public class BasicEnemy extends Enemy {

    public BasicEnemy() {
        super(250);
    }

    @Override
    public void attack() {
        System.out.println("Basic attack");
    }
}
