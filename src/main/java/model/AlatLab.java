/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public abstract class AlatLab {
    protected int idAlat;
    protected String namaAlat;
    protected String kondisiAlat;
    protected int stok;
    
    //construktorr
    public AlatLab (int idAlat, String namaAlat, String kondisiAlat, int stok){
        this.idAlat = idAlat;
        this.namaAlat = namaAlat;
        this.kondisiAlat = kondisiAlat;
        this.stok = stok;
    }
    
    //getter
    public int getIdAlat() {
        return idAlat;
    }
    
    public String getNamaAlat() {
        return namaAlat;
    }
    
    public String getKondisiAlat() {
        return kondisiAlat;
    }
    
    public int getStok() {
        return stok;
    }
    
    //setter 
    public void setIdAlat(int idAlat) {
        if (idAlat > 0) {
            this.idAlat = idAlat;
        }else{
            System.out.println(">> ID Alat harus lebih dari 0!");
        }
    }
    
    public void setNamaAlat(String namaAlat) {
        if(namaAlat != null && !namaAlat.trim().isEmpty()){
            this.namaAlat = namaAlat;
        }else{
            System.out.println(">> Nama alat tidak boleh kosong!");
        }
    }
    
    public void setKondisiAlat(String kondisiAlat) {
        if (kondisiAlat != null && !kondisiAlat.trim().isEmpty()){
            this.kondisiAlat = kondisiAlat;
        }else{
            System.out.println(">> Kondisi alat tidak boleh kosong!");
        }
    }
    
    public void setStok(int stok) {
        if (stok >= 0){
            this.stok = stok;
        }else{
            System.out.println(">> Stok tidak boleh kurang dari 0!");
        }
    }
    
    //method perilaku objek
    public abstract void tampilkanInfo();
}
