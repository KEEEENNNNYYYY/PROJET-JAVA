package projet;

public class chanson {
    //attribut:
    static String titre;
    protected String nom_auteur;
    protected String genre;
    protected static String id;
    private static long idCounter = 0;

    public static synchronized String createID()
    {
        return String.valueOf(idCounter++);
    }

    //constructeur
    chanson(String titre,String nom_auteur,String genre){
        this.titre = titre;
        this.nom_auteur = auteur.nom;
        this.genre = genre;
        this.id = createID();
    }

    public static String getTitre() {
        return titre;
    }

    public static void setTitre(String titre) {
        chanson.titre = titre;
    }

    public String getNom_auteur() {
        return nom_auteur;
    }

    public void setNom_auteur(String nom_auteur) {
        this.nom_auteur = nom_auteur;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        chanson.id = id;
    }

    public static long getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(long idCounter) {
        chanson.idCounter = idCounter;
    }
}
