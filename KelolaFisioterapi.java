import java.util.Scanner;

public class KelolaFisioterapi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ID Pasien: ");
        String idPasien = scanner.nextLine();
        System.out.print("Masukkan Nama Pasien: ");
        String namaPasien = scanner.nextLine();
        Pasien p1 = new Pasien(idPasien, namaPasien);

        System.out.print("Masukkan NIK Terapis 1: ");
        String nikT1 = scanner.nextLine();
        System.out.print("Masukkan Nama Terapis 1: ");
        String namaT1 = scanner.nextLine();
        System.out.print("Masukkan Sertifikat Terapis 1: ");
        String sertifikatT1 = scanner.nextLine();
        Terapis t1 = new Terapis(nikT1, namaT1, sertifikatT1);

        System.out.print("Masukkan NIK Terapis 2: ");
        String nikT2 = scanner.nextLine();
        System.out.print("Masukkan Nama Terapis 2: ");
        String namaT2 = scanner.nextLine();
        System.out.print("Masukkan Sertifikat Terapis 2: ");
        String sertifikatT2 = scanner.nextLine();
        Terapis t2 = new Terapis(nikT2, namaT2, sertifikatT2);

        System.out.print("Masukkan NIK Administrasi: ");
        String nikA = scanner.nextLine();
        System.out.print("Masukkan Nama Administrasi: ");
        String namaA = scanner.nextLine();
        System.out.print("Masukkan Sertifikat Komputer: ");
        String sertifikatA = scanner.nextLine();
        Administrasi ad1 = new Administrasi(nikA, namaA, sertifikatA);

        jasaTerapi jt1 = new jasaTerapi("Saraf", 300000, t1);
        jasaTerapi jt2 = new jasaTerapi("Ortopedi", 200000, t2);
        jasaTerapi jt3 = new jasaTerapi("Geriatri", 75000, t2);

        System.out.print("Masukkan ID Perawatan: ");
        String idPerawatan = scanner.nextLine();
        Perawatan pr1 = new Perawatan(idPerawatan, p1, ad1, 3);
        
        pr1.addTerapi(jt1);
        pr1.addTerapi(jt2);
        pr1.addTerapi(jt3);

        pr1.hitungBiaya();

        pr1.tampilkanDataPerawatan();

    }
}
