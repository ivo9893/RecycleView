package com.example.recycleview;

public class Movie {
    private int imgID;
    private String title;
    private String genre;
    private String length;

    public Movie(int imgID, String title, String genre, String length) {
        this.imgID = imgID;
        this.title = title;
        this.genre = genre;
        this.length = length;
    }

    public int getImgID() {
        return imgID;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getLength() {
        return length;
    }
}
