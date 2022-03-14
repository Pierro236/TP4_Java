package com.tp4.rpg;

public class Boss extends Enemy {

    public Boss() {
        super(500);
    }

    @Override
    public void attack() {
        System.out.println("Boss attack");
    }
}
