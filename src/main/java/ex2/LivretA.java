package ex2;

/**
 * Représente un compte bancaire de type compte Livret A
 *
 * @author DIGINAMIC
 */
public class LivretA extends CompteBancaire {

    /**
     * tauxRemuneration : taux de rémunération dans le cas d'un livret A
     */
    private double tauxRemuneration;

    /**
     * Ce constructeur est utilisé pour créer un livret A
     *
     * @param solde            représente le solde du compte
     * @param tauxRemuneration représente le taux de rémunération du livret A
     */
    public LivretA(double solde, double tauxRemuneration) {
        super( solde, 0);
        this.type = "LA";
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Applique la remuneration annuelle
     */
    public void appliquerRemuAnnuelle() {
        if (type.equals("LA")) {
            this.solde = solde + solde * tauxRemuneration / 100;
        }
    }


    /**
     * Getter for tauxRemuneration
     *
     * @return the tauxRemuneration
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }


    /**
     * Setter
     *
     * @param tauxRemuneration the tauxRemuneration to set
     */
    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

}
