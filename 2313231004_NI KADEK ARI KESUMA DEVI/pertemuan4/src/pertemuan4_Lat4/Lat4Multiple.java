package pertemuan4_Lat4;

// Interface Hewan
interface Hewan {
    void makan();
}

// Interface Mamalia
interface Mamalia {
    void menyusui();
}

// Kelas Kucing mengimplementasikan dua interface
class Kucing implements Hewan, Mamalia {
    @Override
    public void makan() {
        System.out.println("Kucing makan ikan.");
    }
    
    @Override
    public void menyusui() {
        System.out.println("Kucing menyusui anaknya.");
    }
}

// Main class
public class Lat4Multiple {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing();  // Pastikan tidak ada typo dalam nama kelas
        kucing1.makan();
        kucing1.menyusui();
    }
}
