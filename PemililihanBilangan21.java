import java.util.Scanner;
public class PemililihanBilangan21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        // if (angka % 2 == 0)
        // {
        //     System.out.println("Angka " + angka + "termasuk bilangan genap");
        // }
        // else 
        // {
        //     System.out.println("Angka " + angka + "termasuk bilangan ganjil");
        // }

        //tenary
        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.print("Angka " + angka + "termasuk bilangan");
    }
}