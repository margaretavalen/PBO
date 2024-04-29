public class Nilai {
	public static void main(String[] args) {
		Mahasiswa nilaiku = new Mahasiswa();
		nilaiku.nim = "A11.2022.00001";
		nilaiku.nama = "Najwa";
		nilaiku.nilaiTugas = 87;
		nilaiku.nilaiUts = 90;
		nilaiku.nilaiUas = 98;
		nilaiku.hitungNilai();
		nilaiku.cetakNilai();

		Mahasiswa nilaimu = new Mahasiswa();
		nilaimu.nim = "A11.2022.00002";
		nilaimu.nama = "Ghiyatsi";
		nilaimu.nilaiTugas = 80;
		nilaimu.nilaiUts = 88;
		nilaimu.nilaiUas = 95;
		nilaimu.hitungNilai();
		nilaimu.cetakNilai();

		Mahasiswa nilainya = new Mahasiswa();
		nilainya.isiData("A11.2022.00003", "Anisa", 90,79,80);
		nilainya.hitungNilai();
		nilainya.setNim("A11.2022.00007");
		nilainya.cetakNilai();

		Mahasiswa nilaiDia = new Mahasiswa();
		nilaiDia.inputData();
		nilaiDia.hitungNilai();
		nilaiDia.cetakNilai();
	}
}