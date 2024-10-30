package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe utilitaire qui fournit des méthodes pour formater une date.
 */
public class DateUtils {


    /**
     * Méthode pour formater une date avec un pattern fournit.
     *
     * @param pattern représente le formatage de la date que l'on souhaite.
     * @param date    représente la date que l'on souhaite formater.
     * @return la date formatée.
     */
    public static String format(String pattern, Date date) {

        SimpleDateFormat formateur = new SimpleDateFormat(pattern);
        return formateur.format(date);
    }

    /**
     * @param date représente la date que l'on souhaite formater.
     * @return la date formatée.
     */
    public static String formatDefaut(Date date) {

        return format("dd/MM/yyyy HH:mm:ss", date);
    }
}
