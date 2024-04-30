import java.io.*;
public class Karyawan {
	String nip, nama;
	int sts_pegawai;
	
	void inputKar() throws IOException {
		BufferedReader keyboard = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Data Karyawan");
		System.out.print("NIP : ");
		nip = keyboard.readLine();
		System.out.print("Nama : ");
		nama = keyboard.readLine();
		System.out.print("Status Pegawai : ");
		sts_pegawai = Integer.parseInt(keyboard.readLine());
	}
}