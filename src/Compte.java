public class Compte {
    private String numero;
    private double solde;
    private static int nbComptes = 0;

    // Constructeur sans paramètres
    public Compte() {
        this.numero = "";
        this.solde = 0;
        nbComptes++;
    }

    // Getters et Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    // Méthode deposer
    public void deposer(double montant) {
        solde += montant;
    }

    // Méthode retirer
    public void retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
        } else {
            System.out.println("Solde insuffisant pour retirer " + montant);
        }
    }

    // Méthode afficherCompteInfo
    public void afficherCompteInfo() {
        System.out.println("Numéro de compte : " + numero);
        System.out.println("Solde actuel : " + solde);
    }

    // Méthode statique afficherNbComptes
    public static void afficherNbComptes() {
        System.out.println("Nombre de comptes créés : " + nbComptes);
    }
}
