import java.util.Scanner;
import java.io.*;
public class TestNilai{
 
	public static void main (String[] a){
		String jawab="";
		Scanner input = new Scanner(System.in);
		Nilai nilaiku=new Nilai();
		nilaiku.nim="A11202214667";
		nilaiku.nama="Nila";
		nilaiku.nilaiTugas=99;
		nilaiku.nilaiUts=87;
		nilaiku.nilaiUas=98;
		nilaiku.hitungNilai();
		nilaiku.cetakNilai();
		
		Nilai nilaimu=new Nilai();
		
		nilaimu.nim="A11202214704";
		nilaiku.nama="Valen";
		nilaiku.nilaiTugas=98;
		nilaiku.nilaiUts=87;
		nilaiku.nilaiUas=99;
		nilaiku.hitungNilai();
		nilaiku.cetakNilai();

		do{
        Nilai nilaiDia = new Nilai();
        nilaiDia.inputData();
        nilaiDia.hitungNilai();
        nilaiDia.cetakNilai();

        System.out.println("Input data lagi [Y/T]? ");
		jawab=input.nextLine();
        } while(jawab.equalsIgnoreCase("Y"));
		
		System.out.print("Jumlah Mahasiswa : ");
		int n=input.nextInt();
		Nilai[] nilaibyk=new Nilai[n];
		for(int i=0;i<n;i++){
			System.out.println("Mahasiswa ke : "+(i+1));
			nilaibyk[i]=new Nilai();
			nilaibyk[i].inputData();
			nilaibyk[i].hitungNilai();
			nilaibyk[i].cetakNilai();
		}
		nilaibyk[0].judul();
		for(int i=0;i<n;i++){
			nilaibyk[i].daftarNilai();
		}
	}
}