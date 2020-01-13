package entities;

public class CompteCourant extends Compte {
    private double tauxInt;

    public CompteCourant()
    {

    }
    public CompteCourant(String numCompte, Client proprio, double solde) {
        super(numCompte, proprio, solde);
    }

    public CompteCourant(String numCompte, Client proprio, double solde, double tauxInt) {
        super(numCompte, proprio, solde);
        this.tauxInt = tauxInt;
    }

    public double getTauxInt() {
        return tauxInt;
    }

    public void setTauxInt(double tauxInt) {
        this.tauxInt = tauxInt;
    }
}
