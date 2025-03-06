public class Segitiga {
    public static void main(String[] args) {
		//mendeklarasikan alas,tinggi,sisiA,sisiB,sisiC
        float alas = 78.0f; 
        float tinggi = 6.0f; 
        float sisiA = 10.0f; 
        float sisiB = 4.0f;  
        float sisiC = 6.0f;  

        // Menghitung luas segitiga
        float luas = (alas * tinggi) / 2; 

        // Menghitung keliling segitiga
        float keliling = sisiA + sisiB + sisiC; 
		
        // Menampilkan hasil
        System.out.println("Alas   		: "+alas);
        System.out.println("Tinggi 		: "+tinggi);
        System.out.println("Luas   		: "+luas);
        System.out.println("Keliling	: "+keliling);
    }
}