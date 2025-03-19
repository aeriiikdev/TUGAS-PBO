package pertemuan3;

interface Hewan {
    void bersuara(); // Method abstrak
}

// Kelas Serigala mengimplementasikan interface Hewan
class Serigala implements Hewan {
    @Override
    public void bersuara() {
        System.out.println("Serigala melolong: Auuuu Auuu!");
    }
}

// Kelas Harimau mengimplementasikan interface Hewan
class Harimau implements Hewan {
    @Override
    public void bersuara() {
        System.out.println("Harimau menggaung : Rwarrr Rwarrr!!!");
    }
}

// Main class
public class C2Interface {
    public static void main(String[] args) {
        Hewan Serigala = new Serigala();
        Hewan Harimau = new Harimau();

        Serigala.bersuara();
        Harimau.bersuara();
    }
}
