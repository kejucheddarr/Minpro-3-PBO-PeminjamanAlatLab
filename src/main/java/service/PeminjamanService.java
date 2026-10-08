/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Peminjaman;
import model.AlatLab;
import model.AlatBedah;
import model.AlatUkur;
import model.AlatGelas;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class PeminjamanService {
    protected final ArrayList<Peminjaman> daftarPeminjaman = new ArrayList<>();
    
    public ArrayList<Peminjaman> getDaftarPeminjaman() {
        return daftarPeminjaman;
    }
    
    public void tambahPeminjaman(Peminjaman peminjaman, ArrayList<AlatGelas> rakGelas, ArrayList<AlatBedah> rakBedah, ArrayList<AlatUkur> rakUkur) {
        if (peminjaman == null) {
            System.out.println(">> Data peminjaman tidak boleh kosong.");
            return;
        }
        if (peminjaman.getJumlahPinjam() <= 0) {
            System.out.println(">> Jumlah pinjam harus lebih dari 0.");
            return;
        }
        
        AlatLab alat = cariAlat(peminjaman.getNamaAlat(), rakGelas, rakBedah, rakUkur);
        
        if (alat == null) {
            System.out.println(">> Alat tidak ditemukan.");
            return;
        }
        if (peminjaman.getJumlahPinjam() > alat.getStok()) {
            System.out.println(">> Stok alat tidak mencukupi.");
            System.out.println(">> Stok tersedia: " + alat.getStok());
            return;
        }
        
        int stokSebelum = alat.getStok();
        int jumlahPinjam = peminjaman.getJumlahPinjam();
        int stokSesudah = stokSebelum - jumlahPinjam;
        
        alat.setStok(stokSesudah);
        
        daftarPeminjaman.add(peminjaman);
        
        System.out.println(">> Peminjaman berhasil ditambahkan!");
        System.out.println(">> Sisa stok " + alat.getNamaAlat() + ": " + alat.getStok());
    }
    
    public void tampilkanPeminjaman() {
        if (daftarPeminjaman.isEmpty()) {
            System.out.println(">> Belum ada data peminjaman.");
            return;
        }
        for (Peminjaman p : daftarPeminjaman) {
            System.out.println("\n---------- Riwayat Peminjaman ----------");
            System.out.println("ID Peminjaman: " + p.getIdPeminjaman());
            System.out.println("Nama Petugas: " + p.getNamaPetugas());
            System.out.println("Nama Alat: " + p.getNamaAlat());
            System.out.println("Jumlah Pinjam: " + p.getJumlahPinjam());
            System.out.println("Status: " + p.getStatus());
        }
    }
    
    public void kembalikanAlat(int idTarget, ArrayList<AlatGelas> rakGelas, ArrayList<AlatBedah> rakBedah, ArrayList<AlatUkur> rakUkur) {
        for (Peminjaman p : daftarPeminjaman) {
            if (p.getIdPeminjaman() == idTarget) {
                if (p.getStatus().equals("Dikembalikan")) {
                    System.out.println(">> Alat sudah dikembalikan.");
                    return;
                }
                
                AlatLab alat = cariAlat (p.getNamaAlat(), rakGelas, rakBedah, rakUkur);
                
                if (alat != null) {
                    alat.setStok(alat.getStok() + p.getJumlahPinjam());
                }
                p.setStatus("Dikembalikan");
                
                System.out.println(">> Alat berhasil dikembalikan!");
                return;
            }
        }
        System.out.println(">> ID peminjaman tidak ditemukan.");
    }
    
    public void hapusPeminjaman(int idTarget) {
        for (Peminjaman p : daftarPeminjaman) {
            if (p.getIdPeminjaman() == idTarget) {
                if (p.getStatus().equals("Dipinjam")) {
                    System.out.println(">> Peminjaman masih aktif, alat harus dikembalikan terlebih dahulu.");
                    return;
                }
                daftarPeminjaman.remove(p);
                
                System.out.println(">> Data peminjaman berhasil dihapus!");
                return;
            }
        }
        System.out.println(">> ID peminjaman tidak ditemukan.");
    }
    
    protected AlatLab cariAlat(String namaAlat, ArrayList<AlatGelas> rakGelas, ArrayList<AlatBedah> rakBedah, ArrayList<AlatUkur> rakUkur) {
        if (namaAlat == null || namaAlat.trim().isEmpty()){
            return null;
        }
        for (AlatGelas alat : rakGelas) {
            if (alat.getNamaAlat().equalsIgnoreCase(namaAlat)) {
                return alat;
            }
        }
        for (AlatBedah alat : rakBedah) {
            if (alat.getNamaAlat().equalsIgnoreCase(namaAlat)) {
                return alat;
            }
        }
        for (AlatUkur alat : rakUkur) {
            if (alat.getNamaAlat().equalsIgnoreCase(namaAlat)) {
                return alat;
            }
        }
        return null;
    }
}