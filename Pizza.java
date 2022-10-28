public class Pizza {
    protected String description;
    protected double price;

    public Pizza(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}

    public void printPizza() {
        System.out.printf("Description: %s\nPrice: %f\n\n", description, price);
    }
}
