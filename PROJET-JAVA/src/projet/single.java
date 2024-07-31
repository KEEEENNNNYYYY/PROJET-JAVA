package projet;

public class single extends chanson{
    single(String titre, String nom_auteur, String genre) {
        super(titre, nom_auteur, genre);
    }

    @Override
    public String toString() {
        return "single{" +
                "nom_auteur='" + nom_auteur + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
