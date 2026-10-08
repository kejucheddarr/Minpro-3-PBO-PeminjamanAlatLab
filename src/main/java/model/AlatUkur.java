/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class AlatUkur extends AlatLab {
    protected String besaranDiukur;
    
    //konstruktor
    public AlatUkur(int idAlat, String namaAlat, String kondisiAlat, int stok, String besaranDiukur) {
        super(idAlat, namaAlat, kondisiAlat, stok);
        this.besaranDiukur = besaranDiukur;
    }
    
    //getter
    public String getBesaranDiukur() {
        return besaranDiukur;
    }
    
    //setter
    public void setBesaranDiukur(String besaranDiukur) {
        if (besaranDiukur != null && !besaranDiukur.trim().isEmpty()){
            this.besaranDiukur = besaranDiukur;
        }else{
            System.out.println(">> Besaran ukur tidak boleh kosong!");
        }
    }
    
    //method
    @Override
    public void tampilkanInfo() {
        System.out.println("ID Alat: " + idAlat);
        System.out.println("Nama Alat: " + namaAlat);
        System.out.println("Kondisi Alat: " + kondisiAlat);
        System.out.println("Stok Alat: " + stok);
        System.out.println("Besaran: " + besaranDiukur);
    }
}
