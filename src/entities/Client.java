package entities;

public class Client {
    private String nom;
    private String postnom;
    private String adresse;
    private String mail;
    private int id;

    public Client()
    {

    }
    public Client(String nom, String postnom, String adresse, String mail) {
        this.nom = nom;
        this.postnom = postnom;
        this.adresse = adresse;
        this.mail = mail;
    }

    public Client(String nom, String postnom, String adresse, String mail, int id) {
        this.nom = nom;
        this.postnom = postnom;
        this.adresse = adresse;
        this.mail = mail;
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPostnom() {
        return postnom;
    }

    public void setPostnom(String postnom) {
        this.postnom = postnom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
