public class Mobil2BMWDemo {
	public static void main(String[] a){
		Mobil2BMW mobilku = new Mobil2BMW();
		mobilku.hidupkanMobil ("Silver"); //parent
		mobilku.nontonTV(); //child
		mobilku.ubahGigi("Silver"); //parent
		mobilku.matikanMobil("Silver"); //parent
	}
}