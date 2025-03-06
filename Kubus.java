public class Kubus{
    public static void main(String[] args) {
		//mendeklarasikan sisi kubus
        float sisi = 43.0f; 

        // Menghitung volume dan luas permukaan
        float volume = sisi * sisi * sisi; 
        float luasPermukaan = 6 * (sisi * sisi); 
		
        // Menampilkan hasil
        System.out.println("Panjang Sisi     	: "+sisi);
        System.out.println("Volume Kubus     	: "+volume);
        System.out.println("Luas Permukaan    	: "+luasPermukaan);
        System.out.println("Luas Permukaan    	: "+luasPermukaan);
    }
}