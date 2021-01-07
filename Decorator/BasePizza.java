    

public class BasePizza extends Pizza{
    private String name;
    private double price;
    private String topping;

    public BasePizza(){
        super(false);
    }
    
    
        public String getName(){
            return this.name;
    
        }
        public double getPrice(){
            return this.price;
        }
        public void addTopping(String topping){
          
        }
}
