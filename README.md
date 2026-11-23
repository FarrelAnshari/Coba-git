# Manipulasi String (Java Console)

Program latihan konsol **Java** sederhana (`src/ManipulasiString.java`) yang mendemonstrasikan berbagai operasi dasar manipulasi `String` pada masukan pengguna menggunakan `Scanner` dan `StringBuilder`.

---

## Fitur / Langkah Program (`ManipulasiString.java`)

1. **Input Kalimat**: Membaca satu baris kalimat dari pengguna melalui `Scanner` (`input.nextLine()`).
2. **Pengambilan Kata Kedua**: Memecah kalimat berdasarkan spasi (`split(" ")`) dan menampilkan kata kedua (`kata[1]`), atau pesan `"Kalimat tidak memiliki kata kedua."` apabila jumlah kata kurang dari dua.
3. **Transformasi Huruf Kapital**: Mengubah seluruh huruf dalam kalimat menjadi huruf besar menggunakan `toUpperCase()`.
4. **Pemeriksaan Kata `"java"`**: Mengecek apakah kalimat mengandung kata `"java"` secara case-insensitive (`toLowerCase().contains("java")`).
5. **Input Teks Tambahan**: Meminta pengguna memasukkan kata/kalimat tambahan untuk ditambahkan di akhir kalimat.
6. **Pembalikan Kalimat**: Membalik urutan karakter kalimat menggunakan `StringBuilder.reverse()` dan mencetak hasilnya.

---

## Struktur Direktori

```text
Coba-git/
├── .gitignore
├── README.md
└── src/
    └── ManipulasiString.java
```

---

## Persyaratan

- **Java Development Kit (JDK)** versi 8 atau lebih baru (`javac` dan `java` tersedia di terminal/PATH).

---

## Cara Kompilasi dan Menjalankan

1. **Kompilasi ke folder `out`:**

   ```bash
   javac -d out src/ManipulasiString.java
   ```

2. **Jalankan program:**

   ```bash
   java -cp out ManipulasiString
   ```
