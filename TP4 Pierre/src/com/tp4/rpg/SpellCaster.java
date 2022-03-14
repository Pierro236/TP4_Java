package com.tp4.rpg;

import java.util.List;

public abstract class SpellCaster extends Hero  {
    private final int manaPoints;

    protected SpellCaster(int manaPoints, List<Potion> potions, List<Food> lembas) {
        super(200, 100, 0, potions, lembas);
        this.manaPoints = manaPoints;
    }

    @Override
    public void attack() {

    }

    @Override
    public void defend() {

    }

    @Override
    public void useConsumable(Consumable consumable) {

    }

}
