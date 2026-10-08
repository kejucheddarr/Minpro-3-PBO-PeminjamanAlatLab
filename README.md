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

<img width="546" height="560" alt="image" src="https://github.com/user-attachments/assets/9e14e58f-550b-4946-80cc-f0d9e3ba7ccd" />

---

<p>Petugas dapat melihat daftar alat yang tersedia di laboratorium melalui pilihan menu 1. Alat yang ditampilkan dikelompokkan berdasarkan kategorinya, yaitu alat lab, alat bedah, dan alat ukur. Setelah daftar alat ditampilkan, program akan otomatis kembali ke menu utama.</p>

<img width="517" height="820" alt="image" src="https://github.com/user-attachments/assets/f4f8fa43-78ed-472f-a62d-b99a45bb0941" />
<img width="502" height="826" alt="image" src="https://github.com/user-attachments/assets/bc4bfd54-2cf3-4e35-9251-e922ae33477a" />

---


## Penjelasan penerapan encapsulation dan Inheritance
## Penjelasan penerapan polymorphism dan abstraction
