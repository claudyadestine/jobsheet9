import java.util.Scanner;

public class HitungGaji08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Deklarasi array untuk menyimpan data karyawan
        String[] namaKaryawan = new String[3];
        int[] gajiPokok = new int[100];
        int[] jamLembur = new int[100];
        int[] totalGaji = new int[100];

        // Input data karyawan
        System.out.println("Input data karyawan:");
        for (int i = 0; i < namaKaryawan.length; i++) {
            System.out.print("Nama karyawan: ");
            namaKaryawan[i] = sc.nextLine();

            System.out.print("Gaji pokok: ");
            gajiPokok[i] = sc.nextInt();

            System.out.print("Jam lembur: ");
            jamLembur[i] = sc.nextInt();

            sc.nextLine();
        }

        // Hitung total gaji
        for (int i = 0; i < namaKaryawan.length; i++) {
            totalGaji[i] = gajiPokok[i] + (jamLembur[i] * 20000);
        }

        // Tampilkan data gaji karyawan
        System.out.println("Data gaji karyawan:");
        System.out.println("+---------------------------+");
        System.out.println("| Nama Karyawan | Total Gaji |");
        System.out.println("+---------------------------+");

        for (int i = 0; i < namaKaryawan.length; i++) {
            System.out.printf("| %s | %d |\n", namaKaryawan[i], totalGaji[i]);
        }

        System.out.println("+---------------------------+");

    }
}