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

<p>Program ini memiliki pembatasan dalam proses peminjaman alat. Jika petugas mencoba meminjam alat yang tidak ada dalam daftar alat pada menu 1, sistem akan menampilkan pemberitahuan bahwa alat tersebut tidak ditemukan.</p>

<img width="542" height="435" alt="image" src="https://github.com/user-attachments/assets/d80fff75-282f-44b4-8819-5b53a74eb997" />


<p>Selain itu juga, jika petugas memasukkan jumlah peminjaman yang melebihi stok yang tersedia, sistem akan menampilkan peringatan bahwa stok alat tidak mencukupi dan menunjukkan jumlah stok yang tersedia.</p>

<img width="451" height="452" alt="image" src="https://github.com/user-attachments/assets/247e7cb3-5a3c-448a-8c04-e81e1e1e7fcf" />


---

### 3. Tampilkan Riwayat Peminjaman
<p>Petugas dapat melihat riwayat peminjaman alat di laboratorium pada menu 3. Menu ini akan menampilkan ID peminjaman, nama petugas, nama alat, dan jumlah alat yang telah dipinjam, serta status "Dipinjam" yang secara otomatis diberikan oleh sistem. Setelah menampilkan riwayat, program akan balik ke menu awal.</p>

<img width="485" height="777" alt="image" src="https://github.com/user-attachments/assets/e725918e-be73-4e7d-a9eb-7386143ebb7e" />

---

### 4. Kembalikan Alat
<p>Setelah mengembalikan alat yang dipinjam, petugas dapat memilih menu 4 untuk mencatat pengembaliannya. Setelah memasukkan ID peminjaman, sistem akan mencatat bahwa alat telah dikembalikan, dan balik ke menu awal.</p>

<img width="510" height="547" alt="image" src="https://github.com/user-attachments/assets/c2f866d2-e9ea-497c-8580-ff09a1764898" />

<p>Habis melakukan pengembalian, status peminjaman alat dapat dilihat kembali melalui menu riwayat, dengan status yang otomatis diperbarui menjadi “Dikembalikan”.</p>

<img width="453" height="534" alt="image" src="https://github.com/user-attachments/assets/ebb48c5c-4fec-443b-9f8d-2b7c6e870be5" />

---

### 5. Hapus Peminjaman
<p>Pada menu 5, riwayat peminjaman yang sudah lama dapat dihapus agar data yang tersimpan dalam program tidak terlalu banyak. Penghapusan dilakukan dengan memasukkan ID peminjaman, kemudian sistem akan menghapus data tersebut secara otomatis.</p>

<img width="525" height="544" alt="image" src="https://github.com/user-attachments/assets/e94ab68e-238e-4702-bcef-3301abe5e38d" />

<p>Data yang sudah dihapus tidak akan ditampilkan lagi pada menu riwayat.</p>

<img width="489" height="402" alt="image" src="https://github.com/user-attachments/assets/251245dd-829e-4546-b337-258eecb7032c" />

---

### 6. Keluar
<p>Jika petugas ingin keluar dari program, mereka dapat memilih menu 6, dan pengulangan menu akan berhenti.</p>

<img width="724" height="433" alt="image" src="https://github.com/user-attachments/assets/c39eec24-79d2-4412-9525-f43c654c506f" />

---

## Penjelasan penerapan Encapsulation dan Inheritance
### Encapsulation (Enkapsulasi)
<p>Enkapsulasi diterapkan pada java class pada package model, menggunakan access modifier protected pada atribut di class untuk membatasi akses langsung terhadap data dari luar class. Data tersebut kemudian hanya dapat diakses melalui method getter dan setter.</p>

<img width="391" height="136" alt="image" src="https://github.com/user-attachments/assets/72260edd-0e3b-48f2-bba1-62c5d900a222" />
<img width="712" height="664" alt="image" src="https://github.com/user-attachments/assets/f45dcdda-2076-4c26-a2f6-e5d527bd6263" />

---

### Inheritance
<p>Inheritance diimplementasikan pada java class AlatLab sebagai induk/superclass, dengan AlatBedah, AlatUkur, dan Alat Gelas sebagai subclass yang mewarisi atribut dan method dari AlatLab.</p>

<img width="824" height="291" alt="image" src="https://github.com/user-attachments/assets/e608d54a-e1e3-45c5-8b45-afa0945dfb06" />
<img width="1014" height="186" alt="image" src="https://github.com/user-attachments/assets/10b03cea-4052-490e-b809-ed20be451977" />
<img width="1044" height="190" alt="image" src="https://github.com/user-attachments/assets/c83174be-a3c6-4ee9-bc90-b62a3d96af56" />
<img width="1021" height="188" alt="image" src="https://github.com/user-attachments/assets/ea8fb45e-76d0-464c-a165-b3f6db2cb626" />

---

## Penjelasan penerapan Polymorphism dan Abstraction
### Polymorphism
<p>Polymorphism diterapkan dengan method overriding, yang diimplementasikan pada method tampilkanInfo() dari class AlatLab dan dioverride oleh class AlatBedah, AlatUkur, dan Alat Gelas.</p>

<img width="622" height="183" alt="image" src="https://github.com/user-attachments/assets/86985075-b67a-4e7d-8e1e-a53fe59e83e2" />
<img width="585" height="190" alt="image" src="https://github.com/user-attachments/assets/e7ad0725-e588-49fa-8514-708e76fd7cb1" />
<img width="580" height="198" alt="image" src="https://github.com/user-attachments/assets/6181b3b6-17ac-4cb2-9ac4-53583266b6f9" />

<p>Polymorphism juga diterapkan melalui interface PeminjamanView yang diimplementasikan oleh class PeminjamanViewImp.</p>

<img width="777" height="753" alt="image" src="https://github.com/user-attachments/assets/a2b8bd87-80eb-4aa3-841d-cc9c06dfccf5" />
<img width="779" height="506" alt="image" src="https://github.com/user-attachments/assets/b26789ef-b6e4-411b-918f-db7fa0311f43" />
<img width="764" height="631" alt="image" src="https://github.com/user-attachments/assets/8c4c3071-57cd-4335-be5b-ec26d79fdd78" />

---

### Abstraction
<p>Abstraction adalah teknik menyederhanakan suatu objek dengan cara menonjolkan atribut yang penting dan menyembunyikan detail implementasinya. Dalam project ini, abstraction diterapkan melalui abstract class AlatLab. Class ini berfungsi sebagai templat utama yang mendefinisikan atribut dan metode dasar untuk seluruh jenis peralatan laboratorium.</p>

<img width="381" height="121" alt="image" src="https://github.com/user-attachments/assets/6f08548f-0c9f-4cca-9709-b0f8098683c9" />

<p>Metode tampilkanInfo() dideklarasikan sebagai abstract method, agar setiap subclass (AlatGelas, AlatBedah, dan AlatUkur) wajib mengimplementasikannya sesuai dengan karakteristik masing-masing alat.</p>
<img width="417" height="49" alt="image" src="https://github.com/user-attachments/assets/48f54bb1-d01e-4f5b-a784-2ae7d2075771" />

---

## Penerapan Nilai Tambah
### Interface
<p>Interface adalah sekumpulan definisi metode yang wajib diimplementasikan oleh sebuah class. Interface diimplementasikan melalui PeminjamanView, untuk mendefinisikan method yang digunakan dalam proses tampilan dan input program. Selanjutnya, kontrak tersebut diwujudkan secara nyata oleh class PeminjamanViewImp menggunakan kata kunci implements. Interface tersebut kemudian diimplementasikan oleh PeminjamanViewImp menggunakan keyword implements.</p>

<img width="654" height="364" alt="image" src="https://github.com/user-attachments/assets/8982afca-d209-4804-94b6-49fd860d6c2e" />
<img width="1231" height="245" alt="image" src="https://github.com/user-attachments/assets/a3065c81-d4ec-4d12-bce6-830cfaeeda4f" />
