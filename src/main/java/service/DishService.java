package service;

import domain.Dish;

public interface DishService {
    //ToDo: transaction here

    void create();

    boolean update();

    boolean delete();

    Dish read();
}
