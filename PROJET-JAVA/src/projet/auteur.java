package projet;

import java.util.ArrayList;

public class auteur extends utilisateur {
    protected ArrayList<String> liste_de_chanson = new ArrayList<String>();

    auteur(String nom){
        super(nom);
        this.liste_de_chanson = liste_de_chanson ;
    }

    public ArrayList<String> getListe_de_chanson() {
        return liste_de_chanson;
    }

    public void setListe_de_chanson(ArrayList<String> liste_de_chanson) {
        this.liste_de_chanson = liste_de_chanson;
    }
}
