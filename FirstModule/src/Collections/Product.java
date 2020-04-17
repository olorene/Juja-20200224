package Collections;

class Product {
    private String name;
    private Integer weight;

    public Product(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void setWeight(Integer weight) {
        if (weight < 0) {
            System.out.println("Weight less then 0");
        } else {
            this.weight = weight;
        }
    }
}
