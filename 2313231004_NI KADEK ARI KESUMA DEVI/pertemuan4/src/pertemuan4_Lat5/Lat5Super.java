class Hewan {
    String nama;

    Hewan(String nama) {
        this.nama = nama;
    }

    void info() {
        System.out.println("Nama: " + nama);
    }
}

class Kucing extends Hewan {
    Kucing(String nama) {
        super(nama); // Memanggil konstruktor superclass
    }
}

// Main class
public class Lat5Super {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Tom");
        kucing1.info();
    }
}
