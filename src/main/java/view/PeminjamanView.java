/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package view;

import java.util.Scanner;
import model.Peminjaman;

/**
 *
 * @author HP
 */
public interface PeminjamanView {
    void tampilkanMenu();
    void tampilkanDaftarAlat();
    Peminjaman inputPeminjaman(Scanner scanner);
    int inputIdPeminjaman(Scanner scanner);
    void tampilkanPeminjaman(Peminjaman peminjaman);
}
