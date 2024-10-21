package jdr;

import java.util.Random;
import java.util.Scanner;

public class Jeu {
    private Personnage personnage;
    private Scanner scanner;

    public Jeu() {
        this.scanner = new Scanner(System.in);
    }

    public void menu() {
        int choix;
        do {
            System.out.println("1. Créer le personnage");
            System.out.println("2. Combattre une créature");
            System.out.println("3. Afficher score");
            System.out.println("4. Sortir");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    creerPersonnage();
                    break;
                case 2:
                    combattreCreature();
                    break;
                case 3:
                    afficherScore();
                    break;
                case 4:
                    sortir();
                    break;
                default:
                    System.out.println("Choix invalide. Réessayez.");
            }
        } while (choix != 4);
    }

    public void creerPersonnage() {
        personnage = new Personnage();
        System.out.println("Personnage créé avec succès !");
        System.out.println("Force : " + personnage.getForce());
        System.out.println("Points de vie : " + personnage.getPointsDeVie());
        System.out.println("Score : " + personnage.getScore());
    }

    public void combattreCreature() {
        if (personnage == null || !personnage.estVivant()) {
            System.out.println("Votre personnage est décédé. Veuillez créer un nouveau personnage.");
            return;
        }

        Creature creature = creerCreatureAleatoire();
        System.out.println("Vous combattez un " + creature.getClass().getSimpleName());

        while (personnage.estVivant() && creature.estVivant()) {
            int attaquePersonnage = personnage.calculerAttaque();
            int attaqueCreature = creature.calculerAttaque();

            // Calcule l'issue de l'attaque
            if (attaquePersonnage > attaqueCreature) {
                int degats = attaquePersonnage - attaqueCreature;
                creature.subirDegats(degats);
                System.out.println("Vous infligez " + degats + " points de dégâts !");
            } else {
                int degats = attaqueCreature - attaquePersonnage;
                personnage.subirDegats(degats);
                System.out.println("La créature inflige " + degats + " points de dégâts !");
            }
        }

        if (!personnage.estVivant()) {
            System.out.println("Votre personnage est décédé. Votre score est de " + personnage.getScore());
        } else {
            int scoreGagne = (creature instanceof Loup) ? 1 : (creature instanceof Gobelin) ? 2 : 5;
            personnage.augmenterScore(scoreGagne);
            System.out.println("Vous avez gagné le combat ! Votre score est maintenant " + personnage.getScore());
        }
    }

    private Creature creerCreatureAleatoire() {
        Random rand = new Random();
        int type = rand.nextInt(3); // 0, 1 ou 2
        switch (type) {
            case 0:
                return new Loup();
            case 1:
                return new Gobelin();
            case 2:
                return new Troll();
            default:
                return null; // Juste une sécurité ; cela ne devrait pas arriver
        }
    }

    public void afficherScore() {
        if (personnage != null) {
            System.out.println("Votre score actuel est : " + personnage.getScore());
        } else {
            System.out.println("Aucun personnage créé.");
        }
    }

    public void sortir() {
        System.out.println("Merci d'avoir joué !");
        scanner.close();
    }
}