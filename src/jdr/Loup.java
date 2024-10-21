package jdr;

import java.util.Random;

class Loup extends Creature {
    public Loup() {
        Random rand = new Random();
        this.force = rand.nextInt(6) + 3; // Force aléatoire entre 3 et 8
        this.pointsDeVie = rand.nextInt(6) + 5; // Points de vie aléatoires entre 5 et 10
    }

    @Override
    public int calculerAttaque() {
        Random rand = new Random();
        return this.force + rand.nextInt(10) + 1;
    }
}