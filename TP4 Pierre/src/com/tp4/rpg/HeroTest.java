package com.tp4.rpg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HeroTest {

    @Test

    public void testPV() {

        Hero hero = new Hunter();


        assertTrue(hero.getLivepoints() < 0);

    }
    @Test

    public void testFaux() {
        Hero hero = new Hunter();


        assertTrue(hero.getLivepoints() < 0);
    }
}
