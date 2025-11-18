package TugasPekan7_2511533025;
import java.util.Scanner;

import UjiCobaTugasPekan7.Akun;
public class Registrasi_2511533025 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("===== REGISTRASI AKUN BARU =====");
		// Input data dari pengguna
		System.out.print("Masukan Username     : ");
		String inputUsername = scanner.nextLine();
		System.out.print("Masukan Password     : ");
		String inputPassword = scanner.nextLine();
		System.out.print("Masukan Email        : ");
		String inputEmail = scanner.nextLine();
		System.out.print("Masukan PIN (6 digit): ");
		int inputPin = scanner.nextInt();
		
		// Membuat objek Akun
		Akun akunBaru = new Akun();
		
		// Menggunakan setter untuk menyimpan data ke dalam objek
		akunBaru.setUsername(inputUsername);
		akunBaru.setPassword(inputPassword);
		akunBaru.setEmail(inputEmail);
		akunBaru.setPinAngka(inputPin);
		
		// Validasi menggunakan method dari objek Akun
		if (!akunBaru.isPasswordValid()) {
			System.out.println("\n--- REGISTRASI GAGAL ---");
			System.out.println("Password Anda \"" + akunBaru.getPassword() + "\" tidak valid (harus minimal 8 karakter).");
			System.out.println("Silahkan coba lagi.");
			scanner.close();
			return; // Keluar jika password tidak valid
		}
		if (!akunBaru.isEmailValid()) {
			System.out.println("\n--- REGISTRASI GAGAL ---");
			System.out.println("Email Anda \"" + akunBaru.getEmail() + "\" tidak valid (harus mengandung '@' dan '.').");
			System.out.println("Silahkan coba lagi.");
			scanner.close();
			return; // Keluar jika email tidak valid
		}
		// Jika validasi berhasil
		System.out.println("\n--- REGISTRASI BERHASIL ---");
		System.out.println("Akun untuk \"" + akunBaru.getUsername() + "\" telah berhasil dibuat.\n");
		
		// Menampilkan detail akun sesuai format
		System.out.println("--- Detail Akun ---");
		System.out.println("Username (Lowercase)  : " + akunBaru.getUsername().toLowerCase());
		System.out.println("Email (Uppercase)     : " + akunBaru.getEmail().toUpperCase());
		System.out.println("ID Pengguna (Gabungan): " + akunBaru.getUsername() + akunBaru.getPinAngka());
		System.out.println("\n--- Uji Tipe Data (PIN Anda: " + akunBaru.getPinAngka() + ") ---");
		int pinInt = akunBaru.getPinAngka();
		String pinString = String.valueOf(pinInt); // Konversi int ke String
		System.out.println("PIN (int) + 10      = " + (pinInt + 10));
		System.out.println("PIN (String) + \"10\" = " + pinString + "10");
		scanner.close();

	}

}