public class Pelanggan {
    private String nama;
    private String nomorPelanggan;
    private Buku[] bukuPinjaman = new Buku[3];
    private int jumlahBukuPinjaman = 0;

    Pelanggan(String nama, String nomorPelanggan) {
        this.nama = nama;
        this.nomorPelanggan = nomorPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorPelanggan() {
        return nomorPelanggan;
    }

    public void setNomorPelanggan(String nomorPelanggan) {
        this.nomorPelanggan = nomorPelanggan;
    }

    public int getJumlahBukuPinjaman() {
        return jumlahBukuPinjaman;
    }

    void tambahBuku(Buku bukuPinjam) {
        if (jumlahBukuPinjaman != 3) {
            bukuPinjaman[jumlahBukuPinjaman++] = bukuPinjam;
        }
        /*else {
            System.out.println("Mohon maaf " + nama + ", Anda sudah meminjam 3 buku.");
        }*/
    }

    void tampilkanInfoPelanggan() {
        System.out.print("Nama\t\t\t\t: " + nama +
                "\nNomor Pelanggan\t\t: " + nomorPelanggan +
                "\nBuku Yang Dipinjam\t: ");
        if (jumlahBukuPinjaman == 0)
            System.out.println("Tidak Ada");
        else {
            System.out.println();
            for (int i = 0; i < jumlahBukuPinjaman; i++) {
                System.out.println((i + 1) + ". " + bukuPinjaman[i].getJudul());
            }
        }
    }
}
