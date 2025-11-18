package TugasPekan6_2511533025;

import java.util.Scanner;
import java.util.Random;

public class LemparDadu_2511533025 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int percobaan = 0;
		boolean menang = false;
		System.out.println("Permainan Dadu: Lempar dadu hingga mendapatkan total 7!");
		
		// Perulangan while akan berhenti saat menang (jumlah = 7)
		while (!menang) {
			System.out.print("Apakah mau lempar dadu (ya / tidak?)");
			String jawaban = scanner.nextLine().trim().toLowerCase();
			
			// jika pengguna tidak ingin melanjutkan, keluar dari loop
			if (!jawaban.equals("ya")) {
				System.out.println("Permainan dihentikan.");
				break;
			}
			// Simulasi lemparan dua dadu
			int dadu1 = random.nextInt(6) + 1; // Nilai 1-6
			int dadu2 = random.nextInt(6) + 1; // Nilai 1-6
			int total = dadu1 + dadu2;
			
			// Tampilkan hasil lemparan
			System.out.println(dadu1 + " + " + dadu2 + " = " + total);
			
			// Periksa apakah menang
			if (total == 7) {
				menang = true;
				System.out.println("Tebakan Anda Benar");
				System.out.println("Anda menang setelah " + (percobaan + 1) + " percobaan!");
			} else {
				System.out.println("Tebakan Anda Salah");
			}
			// Tambahkan jumlah percobaan
			percobaan++;
		}
		scanner.close();

	}

}
