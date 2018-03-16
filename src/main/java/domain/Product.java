package domain;

public class Product {
    private String name;
    private Integer id;
    private Double carbs;
    private Double fat;
    private Double proteins;
    private Integer calories;

    public Integer getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Double getCarbs() {
        return carbs;
    }

    public Double getFat() {
        return fat;
    }

    public Double getProteins() {
        return proteins;
    }

    private Product() {
    }

    public static Builder newBuilder() {
        return new Product().new Builder();
    }

    public class Builder {

        private Builder() {
            // private constructor
        }


        public Builder setName(String Name) {
            Product.this.name = Name;
            return this;
        }


        public Builder setId(Integer id) {
            Product.this.id = id;
            return this;
        }

        public Builder setCarbs(Double carbs) {
            Product.this.carbs = carbs;
            return this;
        }

        public Builder setFat(Double fat) {
            Product.this.fat = fat;
            return this;
        }

        public Builder setProteins(Double proteins) {
            Product.this.proteins = proteins;
            return this;
        }

        public Builder setCalories(Integer calories) {
            Product.this.calories = calories;
            return this;
        }

        public Product build() {
            return Product.this;
        }


    }
}
