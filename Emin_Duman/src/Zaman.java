import java.time.*;
import java.util.*;
public class Zaman {
	public static String Tarih = "";
	public static String Saat = "";
	public static void zamanOlustur() {
		tarihSec();
		saatSec();
	}
	private static void tarihSec() {
        LocalDate bugunTarih = LocalDate.now();
        LocalDate[] tarihler = new LocalDate[7];
        for (int i = 0; i < 7; i++){
        	tarihler[i] = bugunTarih.plusDays(i + 1);
        }
        for (int j = 0; j < 7; j++){
        	System.out.println((j + 1) + ") " + tarihler[j].toString());
        }
        int secim = 0;
        while(true) {
        	try {
        		Scanner input = new Scanner(System.in);
                System.out.print("Lutfen Tarih Seciniz: ");
                secim = input.nextInt();
                if(secim > 0 && secim < 8) {
                	Tarih = tarihler[secim - 1].toString();
                    break;
                } else {
            		System.out.println("Gecersiz Secim. Lutfen Tekrar Deneyiniz.");
		        }
            } catch (Exception e) {
            	System.out.println("Lutfen Rakam Girin.");
            }
        }
	}
	private static void saatSec() {
		String[] saatler = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
		String[] dakikalar = {"00", "15", "30", "45"};
		String[] sabahAksam = {"AM", "PM"};
		Random rastgeleSayi = new Random();
		String[] saatListesi = new String[10];
        String saat = "";
        for (int i = 0; i < 10;) {
        	saat = saatler[rastgeleSayi.nextInt(12)] + ":" + dakikalar[rastgeleSayi.nextInt(4)] + " " + sabahAksam[rastgeleSayi.nextInt(2)];
        	boolean kontrol = true;
        	for (String item : saatListesi) {
        		if(item == saat) {
        			kontrol = false;
        			break;
        		}
        	}
        	if(kontrol) {
        		saatListesi[i] = saat;
        		i++;
        	}
        }
        Arrays.sort(saatListesi);
        for (int i = 0; i < 10; i++) {
        	System.out.println((i + 1) + ") " + saatListesi[i]);
        }
        int secim = 0;
        while(true) {
        	try {
        		Scanner input = new Scanner(System.in);
                System.out.print("Lutfen Saat Seciniz: ");
            	secim = input.nextInt();
            	if (secim > 0 && secim < 11) {
            		Saat = saatListesi[secim - 1];
                    break;
                } else {
            		System.out.println("Gecersiz Secim. Lutfen Tekrar Deneyiniz.");
		        }
            } catch (Exception e) {
            	System.out.println("Lutfen Rakam Girin.");
            }
        }
	}
}