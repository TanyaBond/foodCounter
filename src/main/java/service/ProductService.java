package service;

import domain.Product;

public interface ProductService {
    //ToDo: transaction here

    void create();

    boolean update();

    boolean delete();

    Product read();
}

