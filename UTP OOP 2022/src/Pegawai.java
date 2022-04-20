public class Pegawai {
    private String nama;
    private String nomorPegawai;

    public Pegawai(String nama, String nomorPegawai) {
        this.nama = nama;
        this.nomorPegawai = nomorPegawai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorPegawai() {
        return nomorPegawai;
    }

    public void setNomorPegawai(String nomorPegawai) {
        this.nomorPegawai = nomorPegawai;
    }

    public void tampilkanInfoPegawai() {
        System.out.println("Nama\t\t\t: " + nama +
                "\nNomor Pegawai\t: " + nomorPegawai);
    }

    public void menambahPelanggan(String nama, String nomorPelanggan) {
        for (int i = 0; i < Perpustakaan.listPelanggan.length; i++) {
            Pelanggan temp = Perpustakaan.listPelanggan[i];
            if (temp == null) {
                Perpustakaan.listPelanggan[i] = new Pelanggan(nama, nomorPelanggan);
                return;
            }
            else if (temp.getNama().equalsIgnoreCase(nama)) {
                //System.out.println("Mohon maaf, " + nama + " sudah terdaftar.");
                return;
            }
        }
        //System.out.println("Pelanggan dalam sistem sudah penuh!");
    }

    public void menambahBuku(String judul, String penulis, int jumlah) {
        for (int i = 0; i < Perpustakaan.listBuku.length; i++) {
            Buku temp = Perpustakaan.listBuku[i];
            if (temp == null) {
                Perpustakaan.listBuku[i] = new Buku(judul, penulis, jumlah);
                return;
            }
            else if (temp.getJudul().equalsIgnoreCase(judul)) {
                Perpustakaan.listBuku[i].setJumlah(Perpustakaan.listBuku[i].getJumlah() + jumlah);
                return;
            }
        }
        //System.out.println("Buku dalam sistem sudah penuh!");
    }
}
