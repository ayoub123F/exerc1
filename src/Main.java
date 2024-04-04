public class Main {
    public static void main(String[] args) {
        // Test de la classe Compte
        Compte compte1 = new Compte();
        compte1.setNumero("123456");
        compte1.deposer(1000);
        compte1.afficherCompteInfo();

        compte1.retirer(500);
        compte1.afficherCompteInfo();

        Compte compte2 = new Compte();
        compte2.setNumero("789012");
        compte2.deposer(2000);
        compte2.afficherCompteInfo();

        Compte.afficherNbComptes();
    }
}
