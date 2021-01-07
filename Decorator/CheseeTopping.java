public class CheseeTopping extends ToppingDecorator{
    Pizza pizza;
    private String name;
    
    
    public CheseeTopping(Pizza pizza){
        this.pizza = pizza;
    }
    
    
        public String getName(){
            return pizza.getName() + ",chesee";
    
        }
        public double getPrice(){
            return 5000 + pizza.getPrice() ;
        }
       
}
