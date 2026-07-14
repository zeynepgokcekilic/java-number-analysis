package pck;

import java.util.Scanner;

public class SayiAnalizProgrami {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("Kaç adet sayı girmek istiyorsunuz: ");
        int sayiAdedi = input.nextInt();
        }

        int toplam = 0;
        int enBuyuk = 0;
        int ciftSayiAdedi = 0;
        int pozitifSayiAdedi = 0;

        System.out.println("Sayi Analiz Programi");
        System.out.println("Girilecek sayi adedi: " + sayiAdedi);

        int sayac = 1;

        while (sayac <= sayiAdedi) {

            System.out.println(sayac + ". tam sayiyi giriniz: ");
            int sayi = input.nextInt();

            toplam = toplam + sayi;

            if (sayac == 1) {
                enBuyuk = sayi;
            } else {
                if (sayi > enBuyuk) {
                    enBuyuk = sayi;
                }
            }

            if (sayi % 2 == 0) {
                ciftSayiAdedi = ciftSayiAdedi + 1;
            }

            if (sayi > 0) {
                pozitifSayiAdedi = pozitifSayiAdedi + 1;
            }

            sayac = sayac + 1;
        }

        double ortalama = (double) toplam / sayiAdedi;

        System.out.println("Toplam: " + toplam);
        System.out.println("Ortalama: " + ortalama);
        System.out.println("En buyuk sayi: " + enBuyuk);
        System.out.println("Cift sayi adedi: " + ciftSayiAdedi);
        System.out.println("Pozitif sayi adedi: " + pozitifSayiAdedi);
    }
}