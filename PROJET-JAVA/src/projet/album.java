package projet;

import java.util.ArrayList;

public class album extends chanson{
    protected ArrayList<String> chanson_membre = new ArrayList<String>();

    album(String titre, String nom_auteur, String genre){
        super(titre,nom_auteur,genre);
        this.chanson_membre = chanson_membre;
    }

    public void setChanson_membre(ArrayList chanson_membre,String chanson_a_ajouter) {
        chanson_membre.add(chanson_a_ajouter);
    }

    public ArrayList<String> getChanson_membre() {
        return chanson_membre;
    }

    public void setChanson_membre(ArrayList<String> chanson_membre) {
        this.chanson_membre = chanson_membre;
    }
}
