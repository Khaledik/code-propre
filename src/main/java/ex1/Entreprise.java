package ex1;

import java.util.Date;

/**
 * Représente une entreprise avec un numéro SIRET, un nom, une adresse, et une date de création.
 * Cette classe inclut une méthode pour afficher le statut de l'entreprise.
 */
public class Entreprise {


    /**
     * Numéro SIRET unique de l'entreprise.
     */
    private int siret;

    /**
     * Nom de l'entreprise.
     */
    private String nom;

    /**
     * Adressse de l'entreprise.
     */
    private String adresse;

    /**
     * Date de création de l'entreprise.
     */
    private Date dateCreation;


    /**
     * Montant maximal du capital autorisé pour une entreprise.
     */
    public static final int CAPITALE_MAX = 3000000;

    /**
     * Méthode qui affiche le status de l'entreprise
     */
    public String afficherStatus() {
        return nom + " " + adresse + " " + siret + " " + dateCreation + " " + CAPITALE_MAX;
    }

    /**
     * Getter pour siret
     *
     * @return le siret
     */
    public int getSiret() {
        return siret;
    }

    /**
     * Setter
     *
     * @param siret pour set le siret
     */
    public void setSiret(int siret) {
        this.siret = siret;
    }

    /**
     * Getter pour nom
     *
     * @return le nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter
     *
     * @param nom pour set le nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter pour adresse
     *
     * @return le adresse
     */
    public String getAdresse() {
        return adresse;
    }


    /**
     * Setter
     *
     * @param adresse pour set l'adresse
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * Getter pour dateCreation
     *
     * @return la  date de creation
     */
    public Date getDateCreation() {
        return dateCreation;
    }

    /**
     * Setter
     *
     * @param dateCreation pour set la date création
     */
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }


}
