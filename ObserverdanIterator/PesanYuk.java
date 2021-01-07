import java.util.*;
public class PesanYuk implements Subject {
    private ArrayList<Observer> observers;
    private String pesanan;
   

    public PesanYuk() {
        //iterator
        menu();
        observers = new ArrayList<Observer>();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(pesanan);
        }
    }

    public void pesananChanged() {
        notifyObservers();
    }

    public void setPesanan(String pesanan) {
        this.pesanan = pesanan;
        pesananChanged();
    }

    public void menu() {
        Database db = new Database();
        String data[][] = db.getMenu();

        System.out.println("-- Menu --");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Item : " + data[i][0]);
            System.out.println("Harga : " + data[i][1]);
            System.out.println();
        }
    }

}
