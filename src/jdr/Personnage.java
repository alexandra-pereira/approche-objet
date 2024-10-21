package jdr;

import java.util.Random;

public class Personnage {
    private int force;
    private int pointsDeVie;
    private int score;

    public Personnage() {
        Random rand = new Random();
        this.force = rand.nextInt(7) + 12; // Force aléatoire entre 12 et 18
        this.pointsDeVie = rand.nextInt(31) + 20; // Points de vie aléatoires entre 20 et 50
        this.score = 0;
    }

    public int getForce() {
        return this.force;
    }

    public int getPointsDeVie() {
        return this.pointsDeVie;
    }

    public int getScore() {
        return this.score;
    }

    public int calculerAttaque() {
        Random rand = new Random();
        return this.force + rand.nextInt(10) + 1; // Attaque = force + [1, 10]
    }

    public boolean estVivant() {
        return this.pointsDeVie > 0;
    }

    public void subirDegats(int degats) {
        this.pointsDeVie -= degats;
    }

    public void augmenterScore(int points) {
        this.score += points;
    }
}
