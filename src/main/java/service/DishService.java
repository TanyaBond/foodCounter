package service;

import com.google.inject.Module;
import domain.Dish;

public interface DishService extends Module {

    Integer calculateCalories(Dish dish);

    Double calculateFat(Dish dish);

    Double calculateCarbs(Dish dish);

    Double calculateProteins(Dish dish);



}
