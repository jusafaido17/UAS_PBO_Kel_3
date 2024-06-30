/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author JUSAFA IDO AR
 */
// Parent class
class Buku {
    protected String judul;
    protected String namaPengarang;
    protected String penerbit;
    protected int tahunCetak;
    protected String kategori;

    public Buku(String judul, String namaPengarang, String penerbit, int tahunCetak, String kategori) {
        this.judul = judul;
        this.namaPengarang = namaPengarang;
        this.penerbit = penerbit;
        this.tahunCetak = tahunCetak;
        this.kategori = kategori;
    }

    public void displayInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + namaPengarang);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Tahun Cetak: " + tahunCetak);
        System.out.println("Kategori: " + kategori);
    }
}

// Child class
class BukuToko extends Buku {
    public BukuToko(String judul, String namaPengarang, String penerbit, int tahunCetak, String kategori) {
        super(judul, namaPengarang, penerbit, tahunCetak, kategori);
    }
}

// Main class
public class TokoBuku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BukuToko[] koleksiBuku = new BukuToko[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data buku ke-" + (i + 1));
            System.out.print("Judul: ");
            String judul = scanner.nextLine();
            System.out.print("Nama Pengarang: ");
            String namaPengarang = scanner.nextLine();
            System.out.print("Penerbit: ");
            String penerbit = scanner.nextLine();
            System.out.print("Tahun Cetak: ");
            int tahunCetak = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.print("Kategori: ");
            String kategori = scanner.nextLine();

            koleksiBuku[i] = new BukuToko(judul, namaPengarang, penerbit, tahunCetak, kategori);
        }

        System.out.println("\nDaftar Buku dalam Toko:");
        for (BukuToko buku : koleksiBuku) {
            buku.displayInfo();
            System.out.println();
        }

        scanner.close();
    }
}