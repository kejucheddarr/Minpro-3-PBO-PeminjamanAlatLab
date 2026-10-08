/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.AlatLab;
import model.AlatBedah;
import model.AlatUkur;
import model.AlatGelas;
import model.Peminjaman;
import service.PeminjamanService;
import view.PeminjamanView;

/**
 *
 * @author HP
 */
public class PeminjamanController {
    private final PeminjamanService service;
    private final PeminjamanView view;
    
    private final ArrayList<AlatGelas> rakGelas;
    private final ArrayList<AlatBedah> rakBedah;
    private final ArrayList<AlatUkur> rakUkur;
    
    public PeminjamanController(PeminjamanService service, PeminjamanView view, ArrayList<AlatGelas> rakGelas, ArrayList<AlatBedah> rakBedah, ArrayList<AlatUkur> rakUkur) {
        this.service = service;
        this.view = view;
        this.rakGelas = rakGelas;
        this.rakBedah = rakBedah;
        this.rakUkur = rakUkur;
    }
    
    public void tampilkanAlat() {
        view.tampilkanDaftarAlat();
    }
    
    public void tambahPeminjaman(Peminjaman peminjaman) {
        service.tambahPeminjaman(peminjaman, rakGelas, rakBedah, rakUkur);
    }
    
    public void tampilkanPeminjaman() {
        if(service.getDaftarPeminjaman().isEmpty()){
            System.out.println(">> Belum ada data peminjaman.");
            return;
        }
        for (Peminjaman p : service.getDaftarPeminjaman()) {
            view.tampilkanPeminjaman(p);
        }
    }
    
    public void kembalikanAlat(int idTarget) {
        service.kembalikanAlat(idTarget, rakGelas, rakBedah, rakUkur);
    }
    
    public void hapusPeminjaman(int idTarget) {
        service.hapusPeminjaman(idTarget);
    }
}
