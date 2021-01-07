

public class Pesanyuk {

    public static void main(String[] args) {
         Pizza abc = new Pizza(true);
           abc = new ToppingDecorator();
         
         abc = new CheseeTopping(abc);

        //System.out.println(abc.getPrice());
        System.out.println(abc.getName() +
                " seharga Rp " + (abc.getPrice() + 50000));
    }
}
