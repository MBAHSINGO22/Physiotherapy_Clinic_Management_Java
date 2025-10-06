public class Administrasi extends Karyawan {
    private String sertifikatKomputer;

    public Administrasi(String NIK, String namaKaryawan, String sertifikatKomputer) {
        super(NIK, namaKaryawan);
        this.sertifikatKomputer = sertifikatKomputer;
    }

    public String getSertifikatKomputer() {
        return sertifikatKomputer;
    }
}

