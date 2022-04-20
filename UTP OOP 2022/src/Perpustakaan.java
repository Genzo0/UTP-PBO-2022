public class Perpustakaan {
    static Buku[] listBuku = new Buku[100];
    public Pegawai pegawaiPerpus;
    static Pelanggan[] listPelanggan = new Pelanggan[20];

    Perpustakaan(Pegawai pegawaiPerpus) {
        this.pegawaiPerpus = pegawaiPerpus;
    }

    void pinjam(String namaPelanggan, String judulBuku) {
        Buku buku = cariBuku(judulBuku);
        if (buku == null || buku.getJumlah() == 0) {
            //System.out.println("Mohon maaf " + namaPelanggan + ", buku " + judulBuku + " tidak tersedia.");
            return;
        }
        else {
            for (int i = 0; i < listPelanggan.length; i++) {
                if (listPelanggan[i] == null) {
                    //System.out.println("Mohon maaf " + namaPelanggan + ", Anda tidak terdaftar dalam sistem.");
                    return;
                }
                else {
                    if (listPelanggan[i].getNama().equalsIgnoreCase(namaPelanggan)) {
                        if (listPelanggan[i].getJumlahBukuPinjaman() != 3) {
                            listPelanggan[i].tambahBuku(buku);
                            buku.setJumlah(buku.getJumlah() - 1);
                            return;
                        }
                        /*else
                            System.out.println("Mohon maaf " + listPelanggan[i].getNama() + ", Anda sudah meminjam 3 buku.");*/
                    }
                }
            }
        }
    }

    Buku cariBuku(String judulBuku) {
        for (int i = 0; i < listBuku.length; i++) {
            Buku temp = listBuku[i];
            if (temp == null)
                break;
            else {
                if (temp.getJudul().equalsIgnoreCase(judulBuku))
                    return temp;
            }
        }
        return null;
    }

    void tampilkanInfoPerpustakaan() {
        System.out.println("====================================\n");
        System.out.println("Informasi Pegawai di Perpustakaan : ");
        pegawaiPerpus.tampilkanInfoPegawai();
        System.out.println("\n====================================");

        System.out.println("\nDaftar Pelanggan di Perpustakaan : \n");
        for (int i = 0; i < listPelanggan.length; i++) {
            if (listPelanggan[i] == null)
                break;
            else {
                listPelanggan[i].tampilkanInfoPelanggan();
                System.out.println();
            }
        }

        System.out.println("\n====================================");

        System.out.println("\nDaftar Buku di Perpustakaan : \n");
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i] == null)
                break;
            else {
                listBuku[i].tampilkanInfoBuku();
                System.out.println();
            }
        }

        System.out.println("====================================");
    }
}
