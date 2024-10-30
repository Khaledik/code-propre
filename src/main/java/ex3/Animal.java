package ex3;

/**
 * Représente un animal avec un nom, un type et un comportement.
 */
public class Animal {

    /**
     * Nom de l'animal.
     */
    private String nom;

    /**
     * Type de l'animal.
     */
    private String type;

    /**
     * Comportement de l'animal.
     */
    private String comportement;

    /**
     * Constructeur pour créer un animal avec un nom, un type et un comportement.
     *
     * @param nom          le nom de l'animal
     * @param type         le type de l'animal
     * @param comportement le comportement de l'animal
     */
    public Animal(String nom, String type, String comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de l'animal.
     *
     * @return une chaîne contenant le nom, le type et le comportement de l'animal
     */
    @Override
    public String toString() {
        return nom + " " + type + " " + comportement;
    }

    /**
     * Getter pour le nom de l'animal.
     *
     * @return le nom de l'animal
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour le nom de l'animal.
     *
     * @param nom le nouveau nom de l'animal
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter pour le type de l'animal.
     *
     * @return le type de l'animal
     */
    public String getType() {
        return type;
    }

    /**
     * Setter pour le type de l'animal.
     *
     * @param type le nouveau type de l'animal
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter pour le comportement de l'animal.
     *
     * @return le comportement de l'animal
     */
    public String getComportement() {
        return comportement;
    }

    /**
     * Setter pour le comportement de l'animal.
     *
     * @param comportement le nouveau comportement de l'animal
     */
    public void setComportement(String comportement) {
        this.comportement = comportement;
    }

}
