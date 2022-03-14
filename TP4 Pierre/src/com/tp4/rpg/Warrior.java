package com.tp4.rpg;

import java.util.List;

public class Warrior extends Hero{

    public Warrior() {
        super(200, 100, 50, List.of(), List.of());
    }

    @Override
    public void attack()  {
        System.out.println("Warrior attack");
    }

    @Override
    public void defend() {

    }

    @Override
    public void useConsumable(Consumable consumable) {

    }
}
