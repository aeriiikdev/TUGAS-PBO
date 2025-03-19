package pertemuan3;
abstract class Kendaraan {
    String nama;
    int jumlahRoda;

    // Constructor
    public Kendaraan(String nama, int jumlahRoda) {
        this.nama = nama;
        this.jumlahRoda = jumlahRoda;
    }

    // Method abstrak
    abstract void bergerak();

    // Method untuk menampilkan informasi kendaraan
    public void info() {
        System.out.println(nama + " memiliki " + jumlahRoda + " roda.");
    }
}

// Subclass Mobil
class Mobil extends Kendaraan {
    public Mobil(String nama) {
        super(nama, 4);
    }

    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan mesin bensin.");
    }
}

// Subclass SepedaMotor
class SepedaMotor extends Kendaraan {
    public SepedaMotor(String nama) {
        super(nama, 2);
    }

    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan mesin bensin.");
    }
}

// Interface KendaraanListrik
interface KendaraanListrik {
    void isiDaya();
}

// Kelas MobilListrik, subclass dari Mobil dan implementasi KendaraanListrik
class MobilListrik extends Mobil implements KendaraanListrik {
    public MobilListrik(String nama) {
        super(nama);
    }

    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan motor listrik.");
    }

    @Override
    public void isiDaya() {
        System.out.println(nama + " sedang diisi daya.");
    }
}

// Main class
public class Lat1kendaraan {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil("Toyota");
        Kendaraan sepeda = new SepedaMotor("Honda");
        MobilListrik mobilListrik = new MobilListrik("Tesla Model 3");

        // Output untuk abstract class
        mobil.info();
        mobil.bergerak();
        
        sepeda.info();
        sepeda.bergerak();

        // Output untuk interface
        mobilListrik.info();
        mobilListrik.bergerak();
        mobilListrik.isiDaya();
    }
}
