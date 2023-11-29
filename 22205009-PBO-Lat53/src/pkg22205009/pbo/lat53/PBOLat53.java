package pkg22205009.pbo.lat53;

/**
 * Nama         : Asmalik Hudri
 * Prodi        : Teknik Informatika
 * Semester     : 3
 * Matakuliah   : Pemrograman Berorientasi Objek (PBO)
 */

// Kelas dasar yang merepresentasikan hewan
class Animal {

    protected boolean vegetarian;   //Variabel untuk menyimpan apakah kelinci tersebut veg atau tidak
    protected String eats;          //Variabel untuk menyimpan makanan yang dimakan kelinci
    protected int noOfLegs;         //Variabel untuk menyimpan jumlah kaki dari keliinci

    // Konstruktor untuk membuat objek Animal dengan menginisialisasi propertinya
    public Animal(boolean vegatarian, String food, int legs) {
        this.vegetarian = vegetarian;
        this.eats = food;
        this.noOfLegs = legs;
    }

    // Getter untuk mendapatkan jenis makanan yang dimakan oleh hewan
    public String getEats() {
        return eats;
    }

    // Getter untuk mendapatkan jumlah kaki yang dimiliki oleh hewan
    public int getNoOfLegs() {
        return noOfLegs;
    }

}

// Kelas Rabbit adalah turunan dari kelas Animal, menambahkan properti color dan name
class Rabbit extends Animal {

    private String color;   //Variabel untuk menyimpan warna dari kelinci
    private String name;    //Variabel untuk menyimpan nama dari kelinci

    // Konstruktor untuk membuat objek Rabbit dengan menginisialisasi propertinya
    public Rabbit(String name, boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.name = name;
        this.color = color;
    }

    // Getter untuk mendapatkan warna kelinci
    public String getColor() {
        return color;
    }

    // Getter untuk mendapatkan nama kelinci
    public String geName() {
        return name;
    }

}

// kelas utama yang berisi method main untuk menjalankan progra
public class PBOLat53 {

    public static void main(String[] args) {
        // Membuat objek Rabbit
        Rabbit kelinci = new Rabbit("Peter", false, "grass", 4, "grey");
        System.out.println("Hello, His name is " + kelinci.geName());
        System.out.println(kelinci.geName() + " is Vegetarian? " + kelinci.vegetarian);
        System.out.println(kelinci.geName() + " eats " + kelinci.getEats());
        System.out.println(kelinci.geName() + " has " + kelinci.getNoOfLegs() + " legs.");
        System.out.println(kelinci.geName() + " color is " + kelinci.getColor());
    }

}
