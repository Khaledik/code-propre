package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

    private List<Caisse> caisses;

    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new Caisse("Petits objets", 0, 5));
        caisses.add(new Caisse("Moyens objets", 5, 20));
        caisses.add(new Caisse("Grands objets", 20, Integer.MAX_VALUE));
    }

    /*
    Méthode pour ajouter un item à une caisse
     */
    public void addItem(Item item) {

        //TODO Faites évoluer ce code (idée: c'est le caisse qui doit "savoir" si elle peut accepter un objet ou non)
        for (Caisse c : caisses) {
            if (c.accepte(item)) {
                c.getItems().add(item);
            }
        }
    }


    /*
    Méthode pour connaitre la taille d'une caisse
     */
    public int taille() {

        int taille = 0;
        //TODO faites évoluer ce code.
        for (Caisse c : caisses) {
            taille += c.getItems().size();
        }
        return taille;
    }
}
