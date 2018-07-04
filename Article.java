public class Article {
    private String libelle;
    private float prix;
    private String description;


    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public float getPrix() {
        return prix;
    }
    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Article(String libelle, float prix, String description) {
        this.libelle = libelle;
        this.prix = prix;
        this.description = description;
    }

}
