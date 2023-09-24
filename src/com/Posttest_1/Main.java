package com.Posttest_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        perpustakaan peminjam1 = new perpustakaan("'Clean Code'","'Novan'",2008);
        perpustakaan peminjam2 = new perpustakaan("'Effective Java'","'Fauzan'",2008);
        perpustakaan peminjam3 = new perpustakaan("'The Pragmatic Programmer'","'Samuel'",1999);
        perpustakaan peminjam4 = new perpustakaan("'Design Pattern'","'Joy'",1994);
        perpustakaan peminjam5 = new perpustakaan("'Introducing to the Theory of Computation'","'caesa'",2005);

        ArrayList<perpustakaan> borrowers = new ArrayList<>();
        borrowers.add(peminjam1);
        borrowers.add(peminjam2);
        borrowers.add(peminjam3);
        borrowers.add(peminjam4);
        borrowers.add(peminjam5);

        for (perpustakaan dataPeminjam: borrowers) {
            System.out.println("Judul Buku : "+dataPeminjam.judulBuku+"|"+"Nama Peminjam : "+dataPeminjam.namaPeminjam+"|"+"Tahun Terbit "+dataPeminjam.tahunBuku);
        }
    }
}
