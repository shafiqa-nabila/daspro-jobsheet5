import java.util.Scanner;
/**
 * KategoriUsia20
 */
public class KategoriUsia20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan usia Anda: ");

        if (sc.hasNextInt()) {
            int usia = sc.nextInt();
           
            if (usia >= 0) {
                
                String kategori;
                if (usia <= 12) {
                    kategori = "Anak";
                } else if (usia <= 19) {
                    kategori = "Remaja";
                } else if (usia <= 64) {
                    kategori = "Dewasa";
                } else {
                    kategori = "Lansia";
                }

                // Menampilkan hasil
                System.out.println("Anda termasuk kategori: " + kategori);
            } else {
                System.out.println("Usia tidak boleh negatif. Silakan coba lagi.");
            }
        } else {
            System.out.println("Input tidak valid. Harap masukkan angka positif.");
        }
    }
}

       