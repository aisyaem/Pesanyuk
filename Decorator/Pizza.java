

public class Pizza {
private boolean toppingname;
private String name = "pizza";
Pizza pizza;

   
    public Pizza(boolean topping) {
    
	}

	public double getPrice(){
        return 50000;
    }

    public boolean ishaveNewTopping(){
        if(toppingname){
            return true;   
        }
        return false;
    }
    public String getName(){
        return " Pizza";
    }
}
