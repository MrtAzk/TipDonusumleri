import java.util.Scanner;

public class Donusum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int sayi= scanner.nextInt();
        System.out.println("bir küsürlü giriniz");
        double sayi2 = scanner.nextDouble();

        // Dönüşüm işlemleri

         double yenisayi =(double)  sayi;
         int yenisayi2=(int) sayi2;

        System.out.println(yenisayi);
        System.out.println(yenisayi2);

        scanner.close();
    }
}
