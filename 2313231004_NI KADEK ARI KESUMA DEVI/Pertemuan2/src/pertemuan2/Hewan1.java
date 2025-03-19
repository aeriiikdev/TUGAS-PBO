package pertemuan2;
interface Hewan {
    void bersuara(); // Method abstrak
}

// Kelas Serigala mengimplementasikan interface Hewan
class Serigala implements Hewan {
    @Override
    public void bersuara() {
        System.out.println("Serigalai melolong:Auuuu Auuuu!");
    }
}

// Kelas Harimau mengimplementasikan interface Hewan
class Harimau implements Hewan {
    @Override
    public void bersuara() {
        System.out.println("Harimau menggaung: Rawrrrr Rawrrrr!");
    }
}

// Main class
public class Hewan1 {
    public static void main(String[] args) {
        Hewan Serigala = new Serigala();
        Hewan Harimau = new Harimau();

        Serigala.bersuara();
        Harimau.bersuara();
    }
}
