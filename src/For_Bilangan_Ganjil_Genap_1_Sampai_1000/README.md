# Bilangan Ganjil dan Genap dengan For Loop

<div align="center">

![Java Version](https://img.shields.io/badge/java-8%2B-orange)
![License](https://img.shields.io/badge/license-MIT-green)
![Loop Type](https://img.shields.io/badge/loop-for--loop-blue)

**Program Java untuk menampilkan bilangan ganjil dan genap 1-1000 menggunakan perulangan for**

[Fitur](#-fitur) • [Cara Kerja](#-cara-kerja) • [Penggunaan](#-penggunaan)

</div>

## 📋 Daftar Isi

- [Gambaran Umum](#-gambaran-umum)
- [Fitur](#-fitur)
- [Cara Kerja](#-cara-kerja)
- [Penggunaan](#-penggunaan)
- [Output](#-output)
- [Kelebihan](#-kelebihan)

## 🚀 Gambaran Umum

Program ini menampilkan deretan bilangan ganjil dan genap dalam rentang 1 sampai 1000 menggunakan perulangan `for`. Program ini efektif untuk pembelajaran dasar pemrograman Java dan konsep perulangan.

### ✨ Highlights

- 🔢 **Menampilkan bilangan ganjil 1-1000**
- 🔢 **Menampilkan bilangan genap 2-1000**
- ⚡ **Efisien dengan increment 2**
- 🎯 **Output terstruktur dan rapi**

## 🌟 Fitur

### 🔧 Core Features
- **Perulangan For** - Menggunakan struktur for loop yang optimal
- **Increment 2** - Langsung melompati bilangan berikutnya
- **Output Terpisah** - Bilangan ganjil dan genap ditampilkan terpisah
- **Format Rapi** - Pengelompokan output yang mudah dibaca

### 📊 Output Features
- **Header Clear** - Judul jelas untuk setiap bagian
- **Space Separated** - Bilangan dipisahkan spasi
- **New Line** - Pemisah antara ganjil dan genap

## 🔍 Cara Kerja

### Flowchart Program

```
graph TD
    A[Start] --> B[Tampilkan &quot;Bilangan ganjil antara 1-1000&quot;]
    B --> C[For loop: i=1; i&lt;=1000; i+=2]
    C --> D[Tampilkan i + spasi]
    D --> E{Tidak}
    E --> C
    E --> F[Tampilkan new line]
    F --> G[Tampilkan &quot;Bilangan genap antara 1-1000&quot;]
    G --> H[For loop: i=2; i&lt;=1000; i+=2]
    H --> I[Tampilkan i + spasi]
    I --> J{Tidak}
    J --> H
    J --> K[End]
    
    C --> E{i <= 1000?}
    H --> J{i <= 1000?}
```

### Logic Explanation
1. **Bilangan Ganjil**: Dimulai dari 1, increment 2 (1, 3, 5, ..., 999)
2. **Bilangan Genap**: Dimulai dari 2, increment 2 (2, 4, 6, ..., 1000)

## 🎮 Penggunaan

### Kompilasi Program
```bash
javac GanjilGenapFor.java
```

### Menjalankan Program
```bash
java For_Bilangan_Ganjil_Genap_1_Sampai_1000.GanjilGenapFor
```

### Step-by-Step Execution
1. **Compile** kode Java menjadi bytecode
2. **Run** program menggunakan JVM
3. **Output** akan ditampilkan di console

## 📊 Output

### Contoh Output
```
Bilangan ganjil antara 1-1000 : 
1 3 5 7 9 11 ... 997 999 

Bilangan genap antara 1-1000 : 
2 4 6 8 10 12 ... 998 1000 
```

### Karakteristik Output
- **Ganjil**: 500 bilangan (1-999)
- **Genap**: 500 bilangan (2-1000)
- **Total**: 1000 bilangan terproses

## 💪 Kelebihan

### ✅ Efficiency
- **Time Complexity**: O(n/2) untuk setiap loop
- **Space Complexity**: O(1) - hanya menggunakan variabel sederhana
- **Optimized**: Increment 2 mengurangi iterasi separuh

### ✅ Readability
- **Kode Jelas**: Struktur for loop mudah dipahami
- **Komentar Implisit**: Nama variabel deskriptif
- **Organized**: Pemisahan logika yang baik

### ✅ Maintainability
- **Modular**: Mudah dimodifikasi range bilangan
- **Extensible**: Bisa dikembangkan dengan fitur tambahan
- **Reusable**: Kode dapat digunakan ulang

---

<div align="center">

**⭐ Program edukatif untuk pembelajaran Java dasar ⭐**

</div>