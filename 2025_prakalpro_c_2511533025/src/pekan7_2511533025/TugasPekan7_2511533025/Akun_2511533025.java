package TugasPekan7_2511533025;

public class Akun_2511533025 {
	// Atribut privat
	private String username;
	private String password;
	private String email;
	private int pinAngka;
	
	// Kontruktor default
	public Akun_2511533025() {
		this.username = "";
		this.password = "";
		this.email = "";
		this.pinAngka = 0;
	}
	// Setter untuk username
	public void setUsername(String username) {
		this.username = username;
	}
	// Getter untuk username
	public String getUsername() {
		return username;
	}
	// Setter untuk password
	public void setPassword(String password) {
		this.password = password;
	}
	// Getter untuk password
	public String getPassword() {
		return password;
	}
	// Setter untuk email
	public void setEmail(String email) {
		this.email = email;
	}
	// Getter untuk email
	public String getEmail() {
		return email;
	}
	// Setter untuk pinAngka
	public void setPinAngka(int pinAngka) {
		this.pinAngka = pinAngka;
	}
	// Getter pin angka
	public int getPinAngka() {
		return pinAngka;
	}
	// Helper method: Validasi password (minimal 8 karakter)
	public boolean isPasswordValid() {
		return password.length() >= 8;
	}
	// Helper method: Validasi email (harus mengandung '@' dan '.')
	public boolean isEmailValid() {
		return email.contains("@") && email.contains(".");
	}
	
}
