package jdr;

import java.util.Random;

class Gobelin extends Creature {
    public Gobelin() {
        Random rand = new Random();
        this.force = rand.nextInt(6) + 5; // Force aléatoire entre 5 et 10
        this.pointsDeVie = rand.nextInt(6) + 10; // Points de vie aléatoires entre 10 et 15
    }

    @Override
    public int calculerAttaque() {
        Random rand = new Random();
        return this.force + rand.nextInt(10) + 1;
    }
}