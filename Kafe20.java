import java.util.Scanner;
/**
 * Kafe20
 */
public class Kafe20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;

        System.out.print("Masukkan menu: ");
        menu = sc.nextLine();
        System.out.print("Masukkan ukuran cup: ");
        ukuranCup = sc.next().charAt(0);
        System.out.print("Masukkan jumlah: ");
        jumlah = sc.nextInt();
        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = sc.nextBoolean();

        double hargaMenu = 0;

        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
        }
        double totalharga = hargaMenu * jumlah;
        String cupTidakValid = "";

        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                totalharga += 0.25 * totalharga;
                break;
            case 'L': 
                totalharga += 0.4 * totalharga;
                break;
            default: 
                cupTidakValid = "(cup tidak valid)";

        }

        double diskon = keanggotaan ? 0 : 0.1;
        double nominalBayar = totalharga - (diskon * totalharga);

        System.out.println("Item pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup + cupTidakValid);
        System.out.println("Nominal bayar: " + nominalBayar);
        }
}