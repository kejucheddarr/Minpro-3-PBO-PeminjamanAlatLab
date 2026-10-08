/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class AlatGelas extends AlatLab {
    protected String kapasitas;
    
    //konstruktor
    public AlatGelas(int idAlat, String namaAlat, String kondisiAlat, int stok, String kapasitas) {
        super(idAlat, namaAlat, kondisiAlat, stok);
        this.kapasitas = kapasitas;
    }
    
    //getter
    public String getKapasitas() {
        return kapasitas;
    }
    
    //setter
    public void setKapasitas(String kapasitas) {
        if (kapasitas != null && !kapasitas.trim().isEmpty()){
            this.kapasitas = kapasitas;
        }else{
            System.out.println(">> Kapasitas tidak boleh kosong!");
        }
    }
    
    //method
    @Override
    public void tampilkanInfo() {
        System.out.println("ID Alat: " + idAlat);
        System.out.println("Nama Alat: " + namaAlat);
        System.out.println("Kondisi Alat: " + kondisiAlat);
        System.out.println("Stok Alat: " + stok);
        System.out.println("Kapasitas: " + kapasitas);
    }
}
