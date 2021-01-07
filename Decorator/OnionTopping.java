public class OnionTopping extends ToppingDecorator {
    Pizza pizza;
    private String name;
    
    
    public OnionTopping(Pizza pizza){
        this.pizza = pizza;
    }
    
    
        public String getName(){
            return pizza.getName() + ",onion";
    
        }
        public double getPrice(){
            return 4000 + pizza.getPrice() ;
        }
       
}
