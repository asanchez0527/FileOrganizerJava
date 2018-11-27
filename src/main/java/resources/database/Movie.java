package main.java.resources.database;

public class Movie {
    private String name;
    private String movie_id;
    private String description;
    private String releaseDate;
    private String path;
    private String image;

    public Movie(String name, String movie_id, String description, String release_date, String path, String image) {
        this.name = name;
        this.movie_id = movie_id;
        this.description = description;
        this.releaseDate = release_date;
        this.path = path;
        this.image = image;
    }

    public String Summary(){
        return ("Name: " + this.name + "\n" + "Release date: " +
                this.releaseDate + "\n" + "Description: " + this.description + "\n"
                + "Path: " + this.path + "\n" + "Image: " + this.image + "\n");
    }

    public String getMovie_id(){
        return this.movie_id;
    }
}
