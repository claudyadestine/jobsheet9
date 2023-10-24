import java.util.Scanner;

public class InputDataKryawan08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Deklarasi array untuk menyimpan data karyawan
        String[] namaKaryawan = new String[3];
        int[] umur = new int[100];
        String[] alamat = new String[100];
        String[] Jabatan = new String[100];

        // Input data karyawan
        System.out.println("Input data karyawan");
        for (int i = 0; i < namaKaryawan.length; i++) {
            System.out.print("Nama karyawan: ");
            namaKaryawan[i] = sc.nextLine();

            System.out.print("Umur: ");
            umur[i] = sc.nextInt();

            System.out.print("Alamat: ");
            sc.nextLine();
            alamat[i] = sc.nextLine();

            System.out.print("Jabatan: ");
            Jabatan[i] = sc.nextLine();

        }

        // Tampilkan data gaji karyawan
        for (int i = 0; i < namaKaryawan.length; i++) {
            System.out.println("Nama karyawan: " + namaKaryawan[i] + ", Umur: " + umur[i] + ", Alamat: " +alamat[i] + ", Jabatan: " + Jabatan[i]);
        }

    }
}