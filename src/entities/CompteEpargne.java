package entities;

public class CompteEpargne extends Compte {
    private double decouvert;

    public CompteEpargne(){

    }
    public CompteEpargne(String numCompte, Client proprio, double solde) {
        super(numCompte, proprio, solde);
    }

    public CompteEpargne(String numCompte, Client proprio, double solde, double decouvert) {
        super(numCompte, proprio, solde);
        this.decouvert = decouvert;
    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }
}
