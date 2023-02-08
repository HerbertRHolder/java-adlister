package models;
import java.io.Serializable;

public class Album implements Serializable {
    private long id;
    private String artists_name;
    private String album_name;
    private int release_date;
    private double sales;
    private String genre;

    public Album() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getArtists_name() {
        return artists_name;
    }

    public void setArtists_name(String artists_name) {
        this.artists_name = artists_name;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public int getRelease_date() {
        return release_date;
    }

    public void setRelease_date(int release_date) {
        this.release_date = release_date;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
