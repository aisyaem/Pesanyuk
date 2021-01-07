import java.util.Scanner;
 
 public class Main {
    public static void main(String[] args) {
        PesanYuk pembeli = new PesanYuk();
        CurrentPesanan pesanan = new CurrentPesanan(pembeli);
        
        System.out.println("-- Pesanan --");

        // Scanner scanner = new Scanner(System.in);
        // scanner.nextLine();

        pembeli.setPesanan("cheseePizza");
        

        int totalHarga = pesanan.getTotalHarga();

        System.out.println("============");
        System.out.println("Total Harga : " + totalHarga);
    }
}
