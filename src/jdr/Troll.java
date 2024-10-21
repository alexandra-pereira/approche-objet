package jdr;

import java.util.Random;

class Troll extends Creature {
    public Troll() {
        Random rand = new Random();
        this.force = rand.nextInt(6) + 10; // Force aléatoire entre 10 et 15
        this.pointsDeVie = rand.nextInt(11) + 20; // Points de vie aléatoires entre 20 et 30
    }

    @Override
    public int calculerAttaque() {
        Random rand = new Random();
        return this.force + rand.nextInt(10) + 1;
    }
}