package ex2;

/**
 * Représente un compte bancaire de type compte courant (type=CC) ou livret A (type=LA)
 *
 * @author DIGINAMIC
 */
public class CompteBancaire {

    /**
     * solde : solde du compte
     */
    protected double solde;

    /**
     * decouvert : un découvert est autorisé seulement pour les comptes courants
     */
    protected double decouvert;


    /**
     * Le type vaut CC= Compte Courant ou LA= Livret A
     */
    protected String type;


    /**
     * Ce constructeur est utilisé pour créer un compte bancaire
     *
     * @param type      représente le type du compte
     * @param solde     représente le solde du compte
     * @param decouvert représente le découvert autorisé
     */
    public CompteBancaire( double solde, double decouvert) {
        this.type = "CC";
        this.solde = solde;
        this.decouvert = decouvert;
    }

    /**
     * Ajoute un montant au solde
     *
     * @param montant
     */
    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    /**
     * Débite un montant au solde
     *
     * @param montant
     */
    public void debiterMontant(double montant) {
        if (this.solde - montant > decouvert) {
            this.solde = solde - montant;
        }
    }


    /**
     * Getter for solde
     *
     * @return the solde
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Setter
     *
     * @param solde the solde to set
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * Getter for decouvert
     *
     * @return the decouvert
     */
    public double getDecouvert() {
        return decouvert;
    }

    /**
     * Setter
     *
     * @param decouvert the decouvert to set
     */
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }


    /**
     * Getter for type
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Setter
     *
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
}
