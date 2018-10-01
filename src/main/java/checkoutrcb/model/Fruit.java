package checkoutrcb.model;

public enum Fruit {
    APPLE("Apple",.25),
    ORANGE("Orange",.33),
    PEAR("Pear",.40),
    LEMON("Lemon",.20),
    BANANA("Banana",.28);

    private String name = null;
    private double price = 0.0d;

    Fruit(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }

}

