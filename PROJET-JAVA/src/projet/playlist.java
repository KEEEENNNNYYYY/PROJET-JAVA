package projet;

import java.util.ArrayList;

public class playlist{
    protected String nom;
    protected String owner;
    protected ArrayList<String> playlist_list = new ArrayList<String>();
    protected ArrayList<String> favorit = new ArrayList<String>();
    boolean liked;
    int like_number;

    playlist(String nom,String owner){
        this.nom = nom;
        this.owner  = utilisateur.nom;
        this.liked = liked;
        this.like_number = 0;
    }

    public void addToPlaylist(chanson chanson) {
        this.playlist_list.add(chanson.titre);
        System.out.println(chanson.titre +" a été ajouté à "+ this.playlist_list);
    }
    String id = chanson.id;
    public String removeById(String id){
        this.playlist_list.remove(id);
        System.out.println(id +" a été retiré");
        return"";
    }
    public boolean like(boolean state){
        if (this.liked = true){
            favorit.add(String.valueOf(this.playlist_list));
            this.like_number--;
            System.out.println("like");
            return this.liked = false;

        }
        else{
            favorit.remove(String.valueOf(this.playlist_list));
            this.like_number ++;
            System.out.println("disliked");
            return this.liked = true;
        }
    }
    public void getTotalLike(){
        System.out.println("ce playlist a : "+this.like_number);
    }
    public void exclude(chanson chanson){
        this.playlist_list.remove(chanson);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ArrayList<String> getPlaylist_list() {
        return playlist_list;
    }

    public void setPlaylist_list(ArrayList<String> playlist_list) {
        this.playlist_list = playlist_list;
    }

    public ArrayList<String> getFavorit() {
        return favorit;
    }

    public void setFavorit(ArrayList<String> favorit) {
        this.favorit = favorit;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public int getLike_number() {
        return like_number;
    }

    public void setLike_number(int like_number) {
        this.like_number = like_number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
