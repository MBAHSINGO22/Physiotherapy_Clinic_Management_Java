public class Terapis extends Karyawan {
    private String sertifikatTerapis;

    public Terapis(String NIK, String namaKaryawan, String sertifikatTerapis) {
        super(NIK, namaKaryawan);
        this.sertifikatTerapis = sertifikatTerapis;
    }

    public String getSertifikatTerapis() {
        return sertifikatTerapis;
    }
}

