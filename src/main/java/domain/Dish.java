package domain;


import java.util.Map;

public class Dish {
    private Integer id;
    private String name;
    //product, count in gram
    private Map<Product, Double> productList;


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<Product, Double> getProductList() {
        return productList;
    }

    public static Dish.Builder newBuilder() {
        return new Dish().new Builder();
    }

    public class Builder {

        private Builder() {
            // private constructor
        }

        public Builder setId(Integer id) {
            Dish.this.id = id;
            return this;
        }

        public Builder setName(String name) {
            Dish.this.name = name;
            return this;
        }

        public Builder setProductList(Map<Product, Double> productList) {
            Dish.this.productList = productList;
            return this;
        }

        public Dish build() {
            return Dish.this;

        }

    }
}
