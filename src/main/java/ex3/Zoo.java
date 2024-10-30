package ex3;

import ex3.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un zoo avec un nom et une liste d'animaux.
 */
public class Zoo {

    /**
     * Nom du zoo.
     */
    private String nom;

    /**
     * Liste des animaux présents dans le zoo.
     */
    private List<Animal> Animaux = new ArrayList<>();

    /**
     * Constructeur pour créer un zoo avec un nom spécifique.
     *
     * @param nom le nom du zoo
     */
    public Zoo(String nom) {
        this.nom = nom;
    }

    /**
     * Ajoute un animal à la liste des animaux du zoo.
     *
     * @param animal l'animal à ajouter
     */
    public void addAnimal(Animal animal) {
        Animaux.add(animal);
    }

    /**
     * Affiche la liste des animaux du zoo.
     */
    public void afficherListeAnimaux() {
        for (Animal animal : Animaux) {
            System.out.println(animal);
        }
    }

    /**
     * Getter pour le nom du zoo.
     *
     * @return le nom du zoo
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour le nom du zoo.
     *
     * @param nom le nouveau nom du zoo
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}
