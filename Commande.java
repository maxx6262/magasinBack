import java.util.HashSet;

public class Commande {
    private Client client;
    private HashSet<Article> listeArticles;
    private int nbArt;

    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }

    public HashSet<Article> getListeArticles() {
        return listeArticles;
    }
    public void setListeArticles(HashSet<Article> listeArticles) {
        this.listeArticles = listeArticles;
    }

    public int getNbArt() {
        return nbArt;
    }
    public void setNbArt(int nbArt) {
        this.nbArt = nbArt;
    }


    public Commande(Client client, HashSet<Article> listeArticles, int nbArt) {
        this.client = client;
        this.listeArticles = listeArticles;
        this.nbArt = nbArt;
    }

    public Commande(Client client){
        this.client = client;
        this.nbArt = 0;
        this.listeArticles = new HashSet<Article>();
    }

    @Override
    public String toString() {
        return "Commande{" +
                "client=" + client +
                ", listeArticles=" + listeArticles +
                ", nbArt=" + nbArt +
                '}';
    }

    public void addArt(Article art){
        HashSet<Article> tmp = this.getListeArticles();
        tmp.add(art);
        this.setListeArticles(tmp);
        this.setNbArt(this.getNbArt() + 1 );
    }

}
