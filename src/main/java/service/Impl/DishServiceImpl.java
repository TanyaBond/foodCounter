package service.Impl;


import com.google.inject.Binder;
import domain.Dish;
import service.DishService;

public class DishServiceImpl implements DishService {


    public Integer calculateCalories(Dish dish) {
        return dish.getProductList().keySet().stream().mapToInt(i -> i.getCalories()).sum();

    }

    public Double calculateFat(Dish dish) {
        return dish.getProductList().keySet().stream().mapToDouble(i -> i.getFat()).sum();
    }

    public Double calculateCarbs(Dish dish) {
        return dish.getProductList().keySet().stream().mapToDouble(i -> i.getCarbs()).sum();
    }

    public Double calculateProteins(Dish dish) {
        return dish.getProductList().keySet().stream().mapToDouble(i -> i.getProteins()).sum();
    }


    @Override
    public void configure(Binder binder) {
        binder.bind(DishService.class).to(DishServiceImpl.class);
    }
}
