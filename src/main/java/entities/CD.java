package entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class CD {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String description;
    private Integer year;
    @Column(name="singer")
    private String artist;
    private Integer price;

    public CD() {
    }

    public CD(Integer id, String title, String description, Integer year, String artist, Integer price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.year = year;
        this.artist = artist;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
