package ex2;

public class TestCompteBancaire {
    public static void main(String[] args) {

        CompteBancaire ccp = new CompteBancaire( 2500.63, 400);
        LivretA livretA = new LivretA(1250.14, 1.2);

        ccp.debiterMontant(50);
        ccp.debiterMontant(1300);
        ccp.debiterMontant(1200);
        System.out.println(ccp.getSolde());
        System.out.println(ccp.getDecouvert());

        livretA.appliquerRemuAnnuelle();
        System.out.println(livretA.getSolde());
        System.out.println(livretA.getTauxRemuneration());
    }
}
