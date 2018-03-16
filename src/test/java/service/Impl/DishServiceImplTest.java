package service.Impl;


import com.google.inject.Inject;
import domain.Dish;
import domain.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import service.DishService;

import java.util.HashMap;
import java.util.Map;

@RunWith(GuiceJUnitRunner.class)
@GuiceJUnitRunner.GuiceModules({DishServiceImpl.class})
public class DishServiceImplTest {

    DishService service;

    //    @SetUp
//    public setUp()
//    {
//
//    }
    @Inject
    public void setService(DishService service) {
        this.service = service;
    }


    @Test
    public void givenProductsWithCaloriesShouldCalculateCaloriesInDish() {

        //Arrange
        Product eggs = Product.newBuilder().setName("eggs").setCarbs(0.6).setFat(8.4).setProteins(11.1).setCalories(63).build();
        Product rice = Product.newBuilder().setName("rice").setCarbs(16.9).setFat(3.4).setProteins(1.7).setCalories(53).build(); //in 100g
        Map<Product, Double> products = new HashMap<Product, Double>();
        products.put(eggs, 1d);
        products.put(rice, 100d);
        Dish dinner = Dish.newBuilder().setId(1).setName("dinner").setProductList(products).build();

        //Act

        int result = service.calculateCalories(dinner);
        //Assert
        Assert.assertEquals(116, result);


    }

//    @Test
//    void calculateFat() {
//    }
//
//    @Test
//    void calculateCarbs() {
//    }
//
//    @Test
//    void calculateProteins() {
//    }
}