import java.util.Scanner;
public class PemilihanHariDenganIf20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka hari: ");
        int angka20 = sc.nextInt();

        String hasil20;

        if (angka20 <= 5) {
            hasil20 = "weekday";
        } else if (angka20 <= 7) {
            hasil20 = "weekend";
        } else {
            hasil20 = "Invalid Number";
        }

        System.out.println(" Angka" +  angka20 + " Is a" + hasil20);
    }
}
