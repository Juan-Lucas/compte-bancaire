package entities;

public abstract class Compte {
    private String numCompte;
    private Client proprio;
    private double solde;

    public Compte()
    {

    }

    public Compte(String numCompte, Client proprio, double solde) {
        this.numCompte = numCompte;
        this.proprio = proprio;
        this.solde = solde;
    }

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    public Client getProprio() {
        return proprio;
    }

    public void setProprio(Client proprio) {
        this.proprio = proprio;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
