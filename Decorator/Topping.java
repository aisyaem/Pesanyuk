public class Topping {
private String name;
private double price = 10000;
private String topping;

    public String getName(){
        return this.name;

    }
    public double getPrice(){
        return this.price;
    }
    public void addTopping(String topping){
        this.topping = topping;
    }
    
}
