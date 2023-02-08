package models;
import models.Product;

public class BeanTest {
    public static void main(String[] args) {
        long id = 0;
        String artists_name = "Chill";
        String album_name = "Study album";
        int release_date = 2001;
        double sales = 5.3;
        String genre = "Lofi";


        Product album = new Product(id,artists_name,album_name,release_date,sales,genre);

        System.out.println(album.getArtists_name());
        System.out.println(album.getAlbum_name());
        System.out.println(album.getRelease_date());
        System.out.println(album.getSales());
        System.out.println(album.getGenre());
        System.out.println(album.getId());


    }

}
