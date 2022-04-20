public class Skenario2 {
    public static void main(String[] args) {
        Pegawai pegawaiPerpus = new Pegawai("Noverdi Anugrah Ramadhan", "205150200111059");

        Perpustakaan perpus = new Perpustakaan(pegawaiPerpus);

        pegawaiPerpus.menambahBuku("Java", "Graita", 5);
        pegawaiPerpus.menambahBuku("Phyton", "Safir", 20);
        pegawaiPerpus.menambahBuku("Javascript", "Machsun", 2);
        pegawaiPerpus.menambahBuku("Javascript", "Machsun", 5);
        pegawaiPerpus.menambahBuku("Cara menjadi kaya 7 turunan", "Nabila Kol", 10);
        pegawaiPerpus.menambahBuku("Seni Berkayu", "Hashiram Senju", 10);
        pegawaiPerpus.menambahBuku("Attack On Titan 139", "Eren Iyega", 10);
        pegawaiPerpus.menambahBuku("Panduan Bermain Genshin Impact", "Cantika", 3);
        pegawaiPerpus.menambahBuku("Cara membuat toko online", "Pak Kalapak", 5);
        pegawaiPerpus.menambahBuku("Golang", "Cantika", 2);

        pegawaiPerpus.menambahPelanggan("Dilluc", "1");
        pegawaiPerpus.menambahPelanggan("Armin", "2");
        pegawaiPerpus.menambahPelanggan("Pak Steve", "3");

        perpus.pinjam("Dilluc", "Golang");
        perpus.pinjam("Dilluc", "Golang");
        perpus.pinjam("Pak Steve", "Panduan Bermain Genshin Impact");
        perpus.pinjam("Pak Steve", "Phyton");
        perpus.pinjam("Armin", "Panduan Bermain Genshin Impact");
        perpus.pinjam("Armin", "Javascript");
        perpus.pinjam("Armin", "Golang");
        perpus.pinjam("Dilluc", "Panduan Bermain Genshin Impact");
        perpus.pinjam("Armin", "Golang");
        perpus.pinjam("Pak Steve", "Golang");
        perpus.pinjam("Pak Steve", "Cara membuat toko online");

        perpus.tampilkanInfoPerpustakaan();
    }
}