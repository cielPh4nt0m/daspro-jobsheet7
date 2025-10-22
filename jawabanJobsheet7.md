## JOBSHEET 7 PERULANGAN 1 ##

NAMA : FADILA MAYAMASITA

NIM : 254107020012

KELA 1C_TI

### Percobaan studi kasus nilai Mahasiswa di SIAKAD - perulangan FOR 

1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program percobaann 1!

Jawaban : 

A. inisialisasi ( int i = 1 ) : kegunaannya sebagai Menetapkan nilai awal variabel penghitung i yaitu 1.

B. Kondisi ( 1 <= 10 ) : kegunannya sebagai Menentukan batas perulangan: selama i kurang dari atau sama dengan 10, perulangan akan terus berjalan.

C. Increment/Decrement ( i++ ) : kegunannya sebagai Menambah nilai i sebanyak 1 setiap kali satu iterasi selesai.

D. Variabel penghitung ( i ) : kegunannya sebagai Digunakan untuk melacak iterasi ke berapa saat ini.

E. Batas awal ( 10 (dari i <= 10) ) : kegunannya sebagai Nilai awal dari perulangan, yaitu iterasi dimulai dari mahasiswa ke-1.

F. Batas akhir ( 10 (dari i <= 10 ) ) : kegunannya sebagai Perulangan akan berhenti setelah i melebihi 10, artinya hanya 10 mahasiswa yang dimasukkan.

G. Blok perulangan {....} : kegunannya sebagai Berisi perintah yang dijalankan berulang: input nilai, cek nilai tertinggi dan terendah.

**syntax FOR**

### <img width="826" height="569" alt="Screenshot 2025-10-21 083635" src="https://github.com/user-attachments/assets/758443ea-7fa9-4ce6-abe0-52d4c18d45ca" /> ###

Hasil dari syntax FOR di atas adalah :

<img width="1482" height="385" alt="Screenshot 2025-10-21 083700" src="https://github.com/user-attachments/assets/d6d80a96-b332-4c8c-a0c4-2f8499d62b4d" />

2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialilsasi 100 ? Apa yang terjadi jika variabel tertinggi  diinisialisasi 100 dan terendah diinisialisasi 0 ?

Jawaban :

tertinggi diinisialisasi dengan 0
Karena kita ingin mencari nilai maksimum dari input.
Nilai awal tertinggi = 0 artinya kita menganggap nilai tertinggi belum ada, dan akan diperbarui jika ada nilai yang lebih besar dari 0.

terendah diinisialisasi dengan 100
Karena kita ingin mencari nilai minimum dari input.
Nilai awal terendah = 100 dianggap nilai maksimum yang mungkin (misal nilai maksimal 100), sehingga jika ada nilai lebih kecil dari 100, terendah akan diperbarui.

Yang terjadi jika nilai tertinginnya 100 dan nilai terendah 0 adalah :

A. tertinggi = 100
Karena nilai awal tertinggi sudah sangat tinggi (nilai maksimal), jika semua input nilai di bawah 100, maka kondisi if (nilai > tertinggi) tidak akan pernah terpenuhi, sehingga nilai tertinggi tetap 100 meskipun tidak ada nilai input yang sebesar itu. Jadi, output nilai tertinggi jadi tidak benar.

B. terendah = 0
Karena nilai awal terendah sudah sangat kecil, jika semua nilai input di atas 0, kondisi if (nilai < terendah) juga tidak pernah terpenuhi, sehingga nilai terendah tetap 0 meskipun nilai input sebenarnya lebih besar. Jadi, output nilai terendah juga tidak benar.

<img width="704" height="424" alt="Screenshot 2025-10-21 125408" src="https://github.com/user-attachments/assets/0c833163-c02f-4456-a791-73635283d09e" />

3. Jelaskan fungsi dan alur kerja potongan kode berikut
   
   <img width="319" height="194" alt="image" src="https://github.com/user-attachments/assets/e68d9e41-b315-438e-b265-e6115a40aa11" />

   Jawaban :

   Kode tersebut terdiri dari dua blok pernyataan if yang independen.

1. Mencari Nilai Maksimum (Tertinggi)
Kode:

    if (nilai > tertinggi) {
    tertinggi = nilai;
}

Fungsi: Membandingkan nilai (nilai baru yang sedang diproses) dengan tertinggi (nilai tertinggi yang sudah ditemukan sejauh ini).

Alur Kerja:

1.Cek kondisi: Apakah nilai lebih besar dari tertinggi?

2.Jika kondisi benar ($nilai > tertinggi$), ini berarti nilai baru adalah nilai tertinggi yang baru.

3.Eksekusi blok kode di dalamnya: Variabel tertinggi diperbarui, nilainya menjadi sama dengan nilai yang baru.

4.Jika kondisi salah ($nilai \le tertinggi$), variabel tertinggi tidak berubah.

2. Mencari Nilai Minimum (Terendah)
Kode:

    if (nilai < terendah) {
    terendah = nilai;
}

Fungsi: Membandingkan nilai (nilai baru yang sedang diproses) dengan terendah (nilai terendah yang sudah ditemukan sejauh ini).

Alur Kerja:

1.Cek kondisi: Apakah nilai lebih kecil dari terendah?

2.Jika kondisi benar ($nilai < terendah$), ini berarti nilai baru adalah nilai terendah yang baru.

3.Eksekusi blok kode di dalamnya: Variabel terendah diperbarui, nilainya menjadi sama dengan nilai yang baru.

4.Jika kondisi salah ($nilai \ge terendah$), variabel terendah tidak berubah.

4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60). Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi dan terendah.

tampilan setelah di tambahkan jumlah mahasiswa lulus dan tidak lulus

<img width="1484" height="897" alt="Screenshot 2025-10-21 153157" src="https://github.com/user-attachments/assets/dcb3df75-1dfc-4828-af18-cfa1fb3562fe" />

Terminal setelah dimasukkan jumlah lulus dan tidak lulus

<img width="1477" height="457" alt="Screenshot 2025-10-21 153624" src="https://github.com/user-attachments/assets/079363b6-bbf3-49cb-b96f-210b02a9099a" />

### Percobaan 2 Studi kasus Nilai Mahasiswa di SIAKAD - Perulangan While

1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari syntax berikut

   a. nilai < 0 || nilai > 100

   b. continue

   Jawaban :

   a. dalam perulangan while (atau perulangan apa pun) adalah untuk memvalidasi input nilai agar hanya menerima angka antara 0 hingga 100. Nilai di luar rentang tersebut dianggap tidak valid.

   b. Perintah continue digunakan untuk melewati sisa kode dalam iterasi saat ini dan langsung lanjut ke iterasi berikutnya dari perulangan.

2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE ? apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE ?

   Jawban : 


     
   
