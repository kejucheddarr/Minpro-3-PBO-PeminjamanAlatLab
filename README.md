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
### 1. Tampilkan Alat
<p>Petugas dapat melihat daftar alat yang tersedia di laboratorium melalui pilihan menu 1. Alat yang ditampilkan dikelompokkan berdasarkan kategorinya, yaitu alat lab, alat bedah, dan alat ukur. Setelah daftar alat ditampilkan, program akan otomatis kembali ke menu utama.</p>

<img width="517" height="820" alt="image" src="https://github.com/user-attachments/assets/f4f8fa43-78ed-472f-a62d-b99a45bb0941" />
<img width="502" height="826" alt="image" src="https://github.com/user-attachments/assets/bc4bfd54-2cf3-4e35-9251-e922ae33477a" />

---
### 2. Tambah Peminjaman
<p>Saat petugas ingin meminjam alat, mereka dapat memilih menu 2. Mereka lalu harus mengisi detail-detail seperti ID peminjaman, nama petugas, nama alat, dan jumlah yang dipinjam. Setelah data tersebut berhasil di input, sistem akan menampilkan pesan “Peminjaman berhasil ditambahkan” beserta sisa stok alatnya, lalu balik ke menu awal.</p>

<img width="549" height="696" alt="image" src="https://github.com/user-attachments/assets/add97031-f8e7-4fd3-9c3f-4b9c6da1a9b9" />

<p>Setiap peminjaman alat akan memengaruhi stok. Dapat dilihat sebagai contoh, setelah petugas meminjam 7 labu erlenmeyer, stoknya berubah dari 10 menjadi 3.</p>
<img width="335" height="150" alt="image" src="https://github.com/user-attachments/assets/6f451009-bd27-45cd-a779-e3e52952ae46" />
<img width="340" height="154" alt="image" src="https://github.com/user-attachments/assets/c6faf661-97f9-4cf6-84c6-3b7d8e029979" />

<p>Program ini memiliki pembatasan dalam proses peminjaman alat. Jika petugas memasukkan jumlah peminjaman yang melebihi stok yang tersedia, sistem akan menampilkan peringatan bahwa stok alat tidak mencukupi dan menunjukkan jumlah stok yang tersedia.</p>
<img width="477" height="454" alt="image" src="https://github.com/user-attachments/assets/1fb3f79c-ba6f-423c-bbe2-b34216ae28de" />

<p>Selain itu juga, jika petugas mencoba meminjam alat yang tidak ada dalam daftar alat pada menu 1, sistem akan menampilkan pemberitahuan bahwa alat tersebut tidak tersedia.</p>
<img width="468" height="431" alt="image" src="https://github.com/user-attachments/assets/0368ed8d-1924-45da-8e04-40fb291e803b" />




---

## Penjelasan penerapan encapsulation dan Inheritance
## Penjelasan penerapan polymorphism dan abstraction
