public class CurrentPesanan  implements Observer, DisplayElement {
    private String pesanan;
    private int totalHarga;
    private Subject subject;

    public CurrentPesanan(Subject subject) {
        this.subject = subject;
        this.totalHarga = 0;
        subject.addObserver(this);
    }

    public void update(String pesanan) {
        this.pesanan = pesanan;
        display(pesanan);
    }

    public void display(String pesanan) {
        Database db = new Database();
        String data[][] = db.getMenu();
        //iterator
        for (int i = 0; i < data.length; i++) {
            if(pesanan == data[i][0] ){
                System.out.println("" + data[i][0]);
                this.totalHarga += Integer.parseInt(data[i][1]);
            }
        }
    }

    public int getTotalHarga(){
        return this.totalHarga;
    }
}




