package services;

import entities.Artist;

import java.util.List;

public interface ArtistServiceImplementation {
    Artist findById(Integer id);
    List<Artist> findAll();
    Artist create(Artist artist);
    Artist update(Artist artist);
    void delete(Integer id);
}
