import java.util.*;
public class Program {
	public static void main(String[] args) {
		System.out.println("Ucak Rezervasyon Sistemine Hosgeldiniz.");
        boolean[] koltuklar = new boolean[Ucak.KOLTUK_SAYISI];
        int secim = 0;
        while (secim != 1 || secim != 2) {
            try {
            	Scanner input = new Scanner(System.in);
                System.out.println("1- Birinci Sinif Rezervasyon");
                System.out.println("2- Ekonomi Sinifi Rezervasyon");
                System.out.println("3- Cikis");
                System.out.print("Lutfen Yapmak Istediginiz Islemi Seciniz: ");
            	secim = input.nextInt();
            	if (secim == 1) {
            		birinciSinifRezervasyon(koltuklar);
		            break;
            	} else if (secim == 2) {
            		ekonomiSinifRezervasyon(koltuklar);
		            break;
            	} else if (secim == 3) {
            		System.out.println("Sistemden Cikiliyor...");
		            return;
            	} else {
            		System.out.println("Gecersiz Secim. Lutfen Tekrar Deneyiniz.");
		        }
            } catch (Exception e) {
            	System.out.println("Lutfen Rakam Girin.");
            }
        }
        Musteri.musteriOlustur();
        Lokasyon.lokasyonOlustur();
		Zaman.zamanOlustur();
		Odeme.odemeYap();
		System.out.println("");
		Musteri.musteriBilgileri(secim);
		System.out.println("Kalkis Lokasyonu: " + Lokasyon.kalkisLokasyon);
		System.out.println("Varis Lokasyonu: " + Lokasyon.varisLokasyon);
		System.out.println("Ucus Tarihi: " + Zaman.Tarih);
		System.out.println("Ucus Saati: " + Zaman.Saat);
		System.out.print("Bilgileriniz Kayit Edildi. Iyi Ucuslar Dileriz.");
    }
	public static void birinciSinifRezervasyon(boolean[] koltuklar) {
    	Scanner input = new Scanner(System.in);
        for (int i = 0; i < Ucak.EKONOMI_SINIR; i++) {
            if (!koltuklar[i]) {
                koltuklar[i] = true;
                System.out.println((i + 1) + ". Koltuk Sizin Icin Rezerve Edildi.");
                return;
            }
        }
    }
    public static void ekonomiSinifRezervasyon(boolean[] koltuklar) {
    	Scanner input = new Scanner(System.in);
        for (int i = Ucak.EKONOMI_SINIR; i < Ucak.KOLTUK_SAYISI; i++) {
            if (!koltuklar[i]) {
                koltuklar[i] = true;
                System.out.println((i + 1) + ". Koltuk sizin Icin Rezerve Edildi.");
                return;
            }
        }
    }
}