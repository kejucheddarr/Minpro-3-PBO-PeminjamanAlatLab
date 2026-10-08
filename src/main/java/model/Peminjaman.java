/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class Peminjaman {
    protected int idPeminjaman;
    protected String namaPetugas;
    protected String namaAlat;
    protected int jumlahPinjam;
    protected String status;
    
    //construktor
    public Peminjaman (int idPeminjaman, String namaPetugas, String namaAlat, int jumlahPinjam) {
        this.idPeminjaman = idPeminjaman;
        this.namaPetugas = namaPetugas;
        this.namaAlat = namaAlat;
        this.jumlahPinjam = jumlahPinjam;
        this.status = "Dipinjam";
    }
    
    //getter
    public int getIdPeminjaman() {
        return idPeminjaman; 
    }
    
    public String getNamaPetugas() {
        return namaPetugas;
    }
    
    public String getNamaAlat() {
        return namaAlat;
    }
    
    public int getJumlahPinjam() {
        return jumlahPinjam;
    }
    
    public String getStatus() {
        return status;
    }
    
    //setter
    public void setIdPeminjaman(int idPeminjaman) {
        if (idPeminjaman > 0){
            this.idPeminjaman = idPeminjaman;
        }else{
            System.out.println(">>ID Peminjaman harus lebih dari 0!");
        }
    }
    
    public void setNamaPetugas(String namaPetugas) {
        if (namaPetugas != null && !namaPetugas.trim().isEmpty()){
            this.namaPetugas = namaPetugas;
        }else{
            System.out.println(">> Nama petugas tidak boleh kosong!");
        }
    }
    
    public void setNamaAlat(String namaAlat) {
        if (namaAlat != null && !namaAlat.trim().isEmpty()){
            this.namaAlat = namaAlat;
        }else{
            System.out.println(">> Nama alat tidak boleh kosong!");
        }
    }
    
    public void setJumlahPinjam(int jumlahPinjam) {
        if (jumlahPinjam >0){
            this.jumlahPinjam = jumlahPinjam;
        }else{
            System.out.println(">> Jumlah pinja harus lebih dari 0!");
        }
    }
    
    public void setStatus(String status){
        this.status = status;
    }
}
