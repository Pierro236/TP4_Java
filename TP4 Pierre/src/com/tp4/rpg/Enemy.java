package com.tp4.rpg;

public abstract class Enemy {
    private final int lifePoints;
    public abstract void attack();

    protected Enemy(int lifePoints){
        this.lifePoints = lifePoints;
    }

}
