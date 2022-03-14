package com.tp4.rpg;

import java.util.List;

//TODO les potions et les lembas & perte des points
public class Hunter extends Hero {


    public Hunter() {
        super(200, 100, 50, List.of(), List.of());
    }

    @Override
    public void attack() {
        System.out.println("Hunter attack");
    }

    @Override
    public void defend() {

    }

    @Override
    public void useConsumable(Consumable consumable) {

    }
}
