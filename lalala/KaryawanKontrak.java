import java.io.*;
public class KaryawanKontrak extends Karyawan
{
	double upah_harian;
	int jml_anak,hari_masuk;
 void inputKontrak() throws IOException
	{
		BufferedReader keyboard= new BufferedReader
		(new InputStreamReader(System.in));
		
		System.out.println("--Karyawan Kontrak--");
		System.out.print("Upah Harian	: ");
		upah_harian=Double.parseDouble(keyboard.readLine());
		System.out.print("Jumlah Masuk	: ");
		hari_masuk=Integer.parseInt(keyboard.readLine());
		System.out.print("Jumlah Anak	: ");
		jml_anak=Integer.parseInt(keyboard.readLine());
	}
	double totalUpah(){
		return (hari_masuk*upah_harian)+(jml_anak*(0.1*(hari_masuk*upah_harian)));
	}
}