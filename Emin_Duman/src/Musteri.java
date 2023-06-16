import java.util.Scanner;
public final class Musteri {
	static Scanner input = new Scanner(System.in);
	public static String TC;
	public static String pasaport;
    public static String ad;
    public static String soyad;
    public static String telefon;
    public static int yas;
    public static void musteriOlustur() {
    	while(true) {
    		System.out.print("TC Kimlik Numarasi Giriniz: ");
            TC = input.nextLine();
            try {
                Long.parseLong(TC);
                if (TC.length() == 11) {
                    break;
                } else {
                    System.out.println("TC Kimlik Numarasi 11 Haneden Olusur.");
                }
            } catch (Exception e) {
                System.out.println("TC Kimlik Numarasi Rakamlardan Olusur.");
            }
    	}
    	while(true) {
    		System.out.print("Pasaport Numarasi Giriniz: ");
    		pasaport = input.nextLine();
            try {
                Long.parseLong(pasaport);
                if (pasaport.length() == 7 || pasaport.length() == 9) {
                    break;
                } else {
                    System.out.println("Eski Pasaport Numarasi 7 Haneden, Yeni Pasaport Numarasi 9 Haneden Olusur.");
                }
            } catch (Exception e) {
                System.out.println("Pasaport Numarasi Rakamlardan Olusur.");
            }
    	}
        System.out.print("Ad: ");
        ad = input.nextLine();
        System.out.print("Soyad: ");
        soyad = input.nextLine();
    	while(true)	{
    		System.out.print("Telefon Numarasi Giriniz: ");
            telefon = input.nextLine();
            try {
                Long.parseLong(telefon);
                if (telefon.length() == 11) {
                    break;
                } else {
                	System.out.println("Telefon Numarasi 11 Haneden Olusur.");
                }
            } catch (Exception e) {
                System.out.println("Telefon Numarasi Rakamlardan Olusur.");
            }
    	}
        while(true) {
        	System.out.print("Yas Giriniz: ");
        	String tYas = input.nextLine();
            try {
                yas = Integer.parseInt(tYas);
                if (yas > 0 && yas < 101) {
                    break;
                } else {
                    System.out.println("1 - 100 Yas Araligindaki Yolcular Kabul Edilmektedir.");
                }
            } catch (Exception e) {
                System.out.println("Sadece Rakam Girebilirsiniz.");
            }
        }
    }
    public static void musteriBilgileri(int secim) {
    	System.out.println("Musteri'nin TC Kimlik Numarasi: " + TC);
        System.out.println("Musteri'nin Pasaport Numarasi: " + pasaport);
        System.out.println("Musteri'nin Adi: " + ad);
        System.out.println("Musteri'nin Soyadi: " + soyad);
        System.out.println("Musteri'nin Telefon Numarasi: " + telefon);
        System.out.println("Musteri'nin Yasi: " + yas);
        if (secim == 1) {
        	System.out.println("Musteri Birinci Sinif Bileti Aldi.");
            System.out.println("Musteri'nin Odeyecegi Ucret: 1000 TL");
        }
        if (secim == 2) {
        	System.out.println("Musteri'nin Ekonomi Sinifi Bileti Aldi.");
            System.out.println("Musteri'nin Odeyecegi Ucret: 500 TL");
        }
    }
}