package services;

import entities.CD;

import java.util.List;

public interface CDServiceImplementation {
    CD findById(Integer id);
    List<CD> findAll();
    CD create(CD cd);
    CD update(CD cd);
    void delete(Integer id);
}
