package com.tp4.rpg;

import com.tp4.rpg.rpg.util.InputParser;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private List<Hero> heroes= new ArrayList<>();
    private int playerTurn;
    private InputParser inputParser;
    private final GameStarter gameStarter = new GameStarter();

    public void playGame() {
        gameStarter.start();
        this.heroes = gameStarter.getHeroes();
    }

    public void generateCombat() {
        playerTurn = ThreadLocalRandom.current().nextInt(0, 1);
        while (true) {
            this.doPlay();
        }
    }

    private void doPlay() {
        if(playerTurn == 0) {
            var enemies = gameStarter.getEnemies();
            var attackOrder= ThreadLocalRandom.current().nextInt(0, enemies.size());
            enemies.get(attackOrder).attack();
            //TODO Suppimer l'énemi lorsqu'il n'a plus de livepoints
            playerTurn = 1;
        } else {
            var attackOrder= ThreadLocalRandom.current().nextInt(0, heroes.size());
            heroes.get(attackOrder).attack();
            try {
                Thread.sleep(2000L);
            } catch(InterruptedException ie) {
                Thread.currentThread().interrupt();
            }

            //TODO Scanner laisser au player l'action de choisir le futur héros qui va attaquer
            //TODO Suppimer les heros qui n'ont plus de livepoints
            playerTurn = 0;
        }
    }
}

