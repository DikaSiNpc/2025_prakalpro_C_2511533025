package TugasPekan5_2511533025;

public class PerulanganForBelahKetupat {

	public static void main(String[] args) {
		int totalBaris = 8;
		int lebarBingkai = 24; // Lebar total termasuk bingkai
		
		// Baris atas bingkai
		System.out.print("#");
		for (int i = 0; i < lebarBingkai - 2; i++) {
			System.out.print("=");
		}
		System.out.println("#");
		
		// Baris isi (1 sampai 8)
		for (int baris = 1; baris <= totalBaris; baris++) {
			int jumlahTitik = 0;
			if (baris == 1 || baris == 8) {
				jumlahTitik = 0;
			} else if (baris == 2 || baris == 7) {
				jumlahTitik = 4;
			} else if (baris == 3 || baris == 6) {
				jumlahTitik = 8;
			} else if (baris == 4 || baris == 5) {
				jumlahTitik = 12;
			}
			
			// Cetak garis vertikal kiri
			System.out.print("|");
			
			// Buat string pola: "<>" + (titik jika ada) + "<>"
			String pola = "<>";
			if (jumlahTitik > 0) {
				for (int i = 0; i < jumlahTitik; i++) {
					pola += ".";
				}
				pola += "<>";
			} else {
				// jika tidak ada titik, hanya cetak "<><>"
				pola = "<><>";
			}
			
			// Hitung total spasi yang dibutuhkan di sekitar pola agar di tengah
			int totalSpasi = lebarBingkai - 2 - pola.length();
			int spasiKiri = totalSpasi / 2;
			int spasiKanan = totalSpasi - spasiKiri;
			
			// Cetak spasi kiri
			for (int i = 0; i < spasiKiri; i++) {
				System.out.print(" ");
			}
			
			// Cetak pola
			System.out.print(pola);
			
			// Cetak spasi kanan
			for (int i = 0; i < spasiKanan; i++) {
				System.out.print(" ");
			}
			
			// Cetak garis vertikal kanan
			System.out.println("|");
		}
		
		// Baris bawah bingkai
		System.out.print("#");
		for (int i = 0; i < lebarBingkai - 2; i++) {
			System.out.print("=");
		}
		System.out.println("#");
	}

}
