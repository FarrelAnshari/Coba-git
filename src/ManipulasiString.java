import java.util.Scanner;

public class ManipulasiString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Input kalimat dari user
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = input.nextLine();

        // 2. Ambil kata kedua
        String[] kata = kalimat.split(" ");
        if (kata.length >= 2) {
            System.out.println("Kata kedua: " + kata[1]);
        } else {
            System.out.println("Kalimat tidak memiliki kata kedua.");
        }

        // 3. Ubah ke huruf kapital
        String hurufKapital = kalimat.toUpperCase();
        System.out.println("Huruf Kapital: " + hurufKapital);

        // 4. Cek apakah mengandung kata "java"
        boolean mengandungJava = kalimat.toLowerCase().contains("java");
        System.out.println("Apakah mengandung kata 'java'? : " + mengandungJava);

        // 5. Tambahkan kata baru di akhir kalimat
        System.out.print("Masukkan kata/kalimat untuk ditambah di akhir: ");
        String tambahan = input.nextLine();
        String kalimatBaru = kalimat + " " ;


        // 6. Membalik kalimat menggunakan StringBuilder
        StringBuilder sb = new StringBuilder(kalimatBaru);
        System.out.println("Kalimat terbalik: " + sb.reverse());

        input.close();
    }


}
