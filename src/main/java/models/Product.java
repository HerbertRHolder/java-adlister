package models;

import java.io.Serializable;

public class Product implements Serializable {
    private long id;
    private String artists_name;
    private String album_name;
    private int release_date;
    private double sales;
    private String genre;
    public Product() {}
    public Product(long ident, String art, String alb, int open_date,double sal,String g) {
        this.id = ident;
        this.artists_name = art;
        this.album_name = alb;
        this.release_date = open_date;
        this.sales = sal;
        this.genre = g;
    }

    public String getArtists_name() {
        return artists_name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                "Artist_name=" + artists_name +
                ", Album_name=" + album_name +
                ", Release_date='" + release_date + '\'' +
                ", Sales='" + sales + '\'' +
                ", Genre=" + genre +
                '}';
    }
}