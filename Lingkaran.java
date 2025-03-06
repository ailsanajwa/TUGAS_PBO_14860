public class Lingkaran{
    public static void main(String[] args) {
		//mendeklarasikan phi, dan jari-jari
        float phi = 3.14f; 
        float jariJari = 47.0f; 

        // Menghitung luas dan keliling
        float luas = phi * (jariJari * jariJari); 
        float keliling = 2 * phi * jariJari; 

        // Menampilkan hasil
        System.out.println("Phi      	: "+phi);
        System.out.println("Jari-jari	: "+jariJari);
        System.out.println("Luas     	: "+luas);
        System.out.println("Keliling  	: "+keliling);
    }
}