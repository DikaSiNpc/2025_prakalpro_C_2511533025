package TugasPekan2;

public class HitungPertalite {

	public static void main(String[] args) {
		// Deklarasi variabel dengan 4 tipe data
        int jarakTotal = 600;           // Jarak dalam kilometer (tipe int)
        float efisiensi = 30.0f;        // Kilometer per liter (tipe float)
        char satuan = 'L';              // Satuan liter (tipe char)
        boolean cukupEfisien = true;    // Apakah efisiensi dianggap baik? (tipe boolean)

        // Hitung kebutuhan bahan bakar
        float literDibutuhkan = jarakTotal / efisiensi;

        // Tampilkan hasil dengan format rapi
        System.out.println("========================================");
        System.out.println("     PERHITUNGAN KEBUTUHAN PERTALITE");
        System.out.println("========================================");
        System.out.println("Jarak yang akan ditempuh    : " + jarakTotal + " km");
        System.out.println("Efisiensi kendaraan         : " + efisiensi + " km/L");
        System.out.println("Satuan bahan bakar          : " + satuan);
        System.out.println("Apakah efisiensi cukup baik? : " + cukupEfisien);
        System.out.println("----------------------------------------");
        System.out.printf("Bahan bakar yang dibutuhkan : %.2f %c\n", literDibutuhkan, satuan);
        System.out.println("========================================");
    }
}
