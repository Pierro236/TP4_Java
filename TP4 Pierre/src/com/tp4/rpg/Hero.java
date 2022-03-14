package com.tp4.rpg;

import java.util.List;

public abstract class Hero {
    private final int livepoints;
    private final int armor;
    private final int weaponDamage;
    private final List<Potion> potions;
    private final List<Food> lembas;

    protected Hero(int livepoints, int armor, int weaponDamage, List<Potion> potions, List<Food> lembas) {
        this.livepoints = livepoints;
        this.armor = armor;
        this.weaponDamage = weaponDamage;
        this.potions = potions;
        this.lembas = lembas;
    }

    public List<Food> getLembas() {
        return lembas;
    }

    public int getArmor() {
        return armor;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public List<Potion> getPotions() {
        return potions;
    }

    public abstract void attack();

    public abstract void defend();

    public abstract  void useConsumable(Consumable consumable);

    public int getLivepoints() {
        return livepoints;
    }
}
