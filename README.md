# Minpro-3-PBO-PeminjamanAlatLab
## Deskripsi singkat program
<p>PeminjamanAlatLab adalah program sistem sederhana berbasis Java untuk mengelola peminjaman alat pada laboratorium biologi. Program ini menyediakan fitur untuk menambah peminjaman, menampilkan riwayat peminjaman, dan mengembalikan alat melalui menunya.</p>

## Penjelasan Struktur Package
Project ini menggunakan struktur **Model → View → Controller → Service → Main** untuk memisahkan fungsi setiap bagian program.
- **model**: Berisi class yang merepresentasikan entitas data dan objek dalam sistem, seperti AlatLab, AlatGelas, AlatBedah, AlatUkur, dan Peminjaman.
- **view**: Bertanggung jawab atas antarmuka pengguna (user interface) dan penanganan input dari pengguna, diimplementasikan melalui PeminjamanView serta PeminjamanViewImp.
- **controller**: Berisi PeminjamanController yang bertindak sebagai perantara untuk menghubungkan View dengan Service, sekaligus mengatur alur logika berdasarkan input pengguna.
- **service**: Berisi PeminjamanService yang menangani seluruh proses bisnis utama, seperti validasi ketersediaan stok, pemrosesan peminjaman, pengembalian barang, serta pengelolaan data peminjaman.
- **main**: Berisi class Laboratorium sebagai titik awal program untuk membuat data awal, menghubungkan setiap bagian program, dan menjalankan sistem.


<img width="422" height="388" alt="image" src="https://github.com/user-attachments/assets/ffdd58f8-4885-42c9-b72b-dc3f15f72ca1" />

---

## Penjelasan Alur Program
Saat program pertama kali di run, sistem akan memberikan output menu utama yang terdiri dari empat pilihan:
1. Tampilkan Alat
2. Tambah Peminjaman
3. Tampilkan Riwayat Peminjaman
4. Kembalikan Alat
5. Hapus Peminjaman
6. Keluar

## Penjelasan penerapan encapsulation dan Inheritance
## Penjelasan penerapan polymorphism dan abstraction
