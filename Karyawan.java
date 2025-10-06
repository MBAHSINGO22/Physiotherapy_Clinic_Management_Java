public abstract class Karyawan {
    protected String NIK;
    protected String namaKaryawan;

    public Karyawan(String NIK, String namaKaryawan) {
        this.NIK = NIK;
        this.namaKaryawan = namaKaryawan;
    }

    public String getNIK() {
        return NIK;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }
}
