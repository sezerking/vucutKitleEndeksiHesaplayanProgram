import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy,kilo,bKEndeksi;

        Scanner scn =new Scanner(System.in);

        System.out.println("Lutfen kilonuzu giriniz: ");
        kilo=scn.nextDouble();

        System.out.println("Lutfen boyunuzu giriniz(metre cinsinden): ");
        boy=scn.nextDouble();

        bKEndeksi=kilo/(boy*boy);

        System.out.println("Vucut kitle endeksiniz: "+bKEndeksi);
    }
}
