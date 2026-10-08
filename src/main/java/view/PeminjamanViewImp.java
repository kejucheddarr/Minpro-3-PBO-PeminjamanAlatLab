/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.AlatBedah;
import model.AlatUkur;
import model.AlatGelas;
import model.Peminjaman;

/**
 *
 * @author HP
 */
public class PeminjamanViewImp implements PeminjamanView {
    
    private final ArrayList<AlatGelas> rakGelas;
    private final ArrayList<AlatBedah> rakBedah;
    private final ArrayList<AlatUkur> rakUkur;
    
    public PeminjamanViewImp(ArrayList<AlatGelas> rakGelas, ArrayList<AlatBedah> rakBedah, ArrayList<AlatUkur> rakUkur){
        this.rakGelas = rakGelas;
        this.rakBedah = rakBedah;
        this.rakUkur = rakUkur;
    }
    
    @Override
    public void tampilkanMenu() {
        System.out.println("\n==============================================");
        System.out.println("SISTEM MANAJEMEN PEMINJAMAN ALAT LABORATORIUM");
        System.out.println("==============================================");
        System.out.println("1. Tampilkan Alat");
        System.out.println("2. Tambah Peminjaman");
        System.out.println("3. Tampilkan Riwayat Peminjaman");
        System.out.println("4. Kembalikan Alat");
        System.out.println("5. Hapus Peminjaman");
        System.out.println("6. Keluar");
        System.out.println("Pilih Menu (1-6): ");
    }
    
    @Override
    public void tampilkanDaftarAlat(){
        System.out.println("\n=== Daftar Alat Laboratorium ===");
        System.out.println("\n---------- Alat Gelas ----------");
        for (AlatGelas a : rakGelas) {
            a.tampilkanInfo();
            System.out.println("--------------------------------");
        }
        System.out.println("\n---------- Alat Bedah ----------");
        for (AlatBedah a : rakBedah) {
            a.tampilkanInfo();
            System.out.println("--------------------------------");
        }
        System.out.println("\n---------- Alat Ukur -----------");
        for (AlatUkur a : rakUkur) {
            a.tampilkanInfo();
            System.out.println("--------------------------------");
        }
    }
    
    @Override
    public Peminjaman inputPeminjaman(Scanner scanner) {
        int idPeminjaman = 0;
        int jumlahPinjam = 0;
        String namaPetugas = "";
        String namaAlat = "";
        
        //ID Peminjaman
        while (idPeminjaman <= 0){
            System.out.println("ID Peminjaman: ");
            try {
                idPeminjaman = scanner.nextInt();
                scanner.nextLine();
                
                if(idPeminjaman <=0) {
                    System.out.println(">> ID Peminjaman harus lebih dari 0.");
                }
            } catch(java.util.InputMismatchException e) {
                System.out.println(">> Input harus berupa angka!");
                scanner.nextLine();
            }
        }
        //Nama Petugasssssssssss
        while (namaPetugas.isEmpty()){
            System.out.println("Nama Petugas: ");
            namaPetugas = scanner.nextLine().trim();
            
            if (namaPetugas.isEmpty()){
                System.out.println(">> Nama petugas tidak boleh kosong.");
            }
        }
        //Nama Alat
        while (namaAlat.isEmpty()){
            System.out.println("Nama Alat: ");
            namaAlat = scanner.nextLine().trim();
            
            if(namaAlat.isEmpty()){
                System.out.println(">> Nama alat tidak boleh kosong.");
            }
        }
        //Jumlah Pinjam
        while (jumlahPinjam <=0){
            System.out.println("Jumlah Pinjam: ");
            try{
                jumlahPinjam = scanner.nextInt();
                scanner.nextLine();
                if (jumlahPinjam <=0){
                    System.out.println(">> Jumlah pinjam harus lebih dari 0.");
                }
            }catch (java.util.InputMismatchException e) {
                System.out.println(">> Input harus berupa angka!");
                scanner.nextLine();
            }
        }
        return new Peminjaman(idPeminjaman, namaPetugas, namaAlat, jumlahPinjam);
    }
    @Override
    public int inputIdPeminjaman(Scanner scanner) {
        int idTarget = 0;
        
        while (idTarget <=0){
            try{
                idTarget = scanner.nextInt();
                scanner.nextLine();
                
                if(idTarget <=0){
                    System.out.println(">> ID harus lebih dari 0.");
                }
            }catch (java.util.InputMismatchException e){
                System.out.println(">> Input harus berupa angka!");
                scanner.nextLine();
            }
        }
        return idTarget;
    }
    @Override
    public void tampilkanPeminjaman(Peminjaman p){
        System.out.println("\n---------- Riwayat Peminjaman ----------");
        System.out.println("ID Peminjaman :" + p.getIdPeminjaman());
        System.out.println("Nama Petugas: " + p.getNamaPetugas());
        System.out.println("Nama Alat: " + p.getNamaAlat());
        System.out.println("Jumlah Pinjam: " + p.getJumlahPinjam());
        System.out.println("Status: " + p.getStatus());
    }
}
