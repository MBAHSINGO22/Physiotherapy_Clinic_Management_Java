import java.util.ArrayList;
import java.util.List;

public class Perawatan {
    private String idPerawatan;
    private Pasien pasien;
    private Administrasi kasir;
    private List<jasaTerapi> daftarTerapi;
    private int jumlahTerapi;
    private double totalBiaya;

    public Perawatan(String idPerawatan, Pasien pasien, Administrasi kasir, int jumlahTerapi) {
        this.idPerawatan = idPerawatan;
        this.pasien = pasien;
        this.kasir = kasir;
        this.daftarTerapi = new ArrayList<>();
        this.jumlahTerapi = jumlahTerapi;
    }

    public void addTerapi(jasaTerapi terapi) {
        if (daftarTerapi.size() < jumlahTerapi) {
            daftarTerapi.add(terapi);
        }
    }

    public void hitungBiaya() {
        totalBiaya = 0;
        for (jasaTerapi terapi : daftarTerapi) {
            totalBiaya += terapi.getTarif();
        }
    }

    public void tampilkanDataPerawatan() {
        System.out.println("Klinik Fisioterapi \"Eugenius Kriswinar Adi Cahya & 235314099\"");
        System.out.println();
        System.out.println("idPerawatan: " + idPerawatan);
        System.out.println("Pelanggan: Bp/Ibu/Sdr " + pasien.getNamaPasien() + " - No.Member: " + pasien.getIdPasien());
        System.out.println("Kasir: " + kasir.getNamaKaryawan());
        System.out.println();
        System.out.println("[Biaya Perawatan Fisioterapi]");
        for (jasaTerapi terapi : daftarTerapi) {
            System.out.println(terapi.getJenisTerapi() + ": Rp " + terapi.getTarif() + " Terapis: " + terapi.getTerapis().getNamaKaryawan());
        }
        System.out.println("----------------------------------------");
        System.out.println("Total Biaya: Rp " + totalBiaya);
    }
}
