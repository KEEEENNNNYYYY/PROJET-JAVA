package projet;

public class platforme {
    public static void main(String[] args) {
        utilisateur utilisateur1 = new utilisateur("Benja");
        chanson chanson1 = new chanson("galatée", auteur.nom, "???");
        chanson chanson2 = new chanson("princesse", auteur.nom, "???");
        auteur auteur1 = new auteur("benja folo");
        album album1 = new album("feu", auteur1.nom, "???");
        System.out.println(chanson1.getNom_auteur());
        playlist playlist1 = new playlist("feu",utilisateur1.nom);
        playlist1.addToPlaylist(chanson1);
        System.out.println(playlist1.getPlaylist_list());

    }
}