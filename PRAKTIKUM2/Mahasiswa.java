import java.util.Scanner;

public class Mahasiswa{
	String nim;
	String nama;
	float nilaiUts, nilaiTugas, nilaiUas, pNilaiTugas, pNilaiUts, pNilaiUas, nilaiAkhir;
	Scanner myObj = new Scanner(System.in);
	void isiData(String nim, String nama, float nilaiUts, float nilaiTugas, float nilaiUas)
	{
		this.nim = nim;
		this.nama = nama;
		this.nilaiUts = nilaiUts;
		this.nilaiTugas = nilaiTugas;
		this.nilaiUas = nilaiUas;
	}
	void setNim(String nim)
	{
		this.nim = nim;
	}
	String getNim()
	{
		return nim;
	}
	void inputData()
	{
		System.out.print("NIM 		: "); nim=myObj.nextLine();
		System.out.print("Nama 		: "); nama=myObj.nextLine();
		System.out.print("Nilai Tugas 	: "); nilaiTugas=myObj.nextFloat();
		System.out.print("Nilai UTS 	: "); nilaiUts=myObj.nextFloat();
		System.out.print("Nilai UAS 	: "); nilaiUas=myObj.nextFloat();
	}
	void hitungNilai(){
		pNilaiTugas = nilaiTugas * 0.20f;
		pNilaiUts = nilaiUts * 0.35f;

		pNilaiUas = nilaiUas * 0.45f;
		nilaiAkhir = pNilaiUts + pNilaiTugas + pNilaiUas;
	}
	void cetakNilai(){
		System.out.println("NIM		: " + nim);
		System.out.println("Nama		: " + nama);
		System.out.println("Nilai Tugas	: " + nilaiTugas +" 	30% : " +pNilaiTugas);
		System.out.println("Nilai UTS	: " + nilaiUts +" 	35% : " +pNilaiUts);
		System.out.println("Nilai UAS	: " + nilaiUas +" 	35% : " +pNilaiUas);
		System.out.println("Nilai Akhir	: " + nilaiAkhir);
	}
}