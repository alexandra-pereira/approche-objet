package jdr;

import java.util.Random;

public abstract class Creature {
    protected int force;
    protected int pointsDeVie;

    public abstract int calculerAttaque();

    public void subirDegats(int degats) {
        this.pointsDeVie -= degats;
    }

    public boolean estVivant() {
        return this.pointsDeVie > 0;
    }
}