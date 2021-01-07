public class ToppingDecorator extends Pizza {
    private String name;
    private double price;
    private String topping;
    Pizza pizza;

    public ToppingDecorator(){
        super(true);
    }
    
    
        public String getName(){
            return "topping";
    
        }
        
        public double getPrice(){
           
            return 0;
        }
        public void addTopping(String topping){
          
        }
}

    
