package pertemuan4_Lat7;
// Superclass
class Hewan {
    void bersuara() {
        System.out.println("Hewan bersuara...");
    }
}

// Subclass
class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Meow! Meow!");
    }
}

// Subclass lain
class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Guk! Guk!");
    }
}

// Main class
public class Lat7RPolymorphism {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing(); // Polimorfisme
        Hewan hewan2 = new Anjing(); // Polimorfisme
        hewan1.bersuara(); // Memanggil metode dari Kucing
        hewan2.bersuara(); // Memanggil metode dari Anjing
    }
}
