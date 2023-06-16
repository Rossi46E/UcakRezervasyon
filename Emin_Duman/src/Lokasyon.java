import java.util.ArrayList;
import java.util.Scanner;
public class Lokasyon{
    private static ArrayList<String> lokasyonlar = new ArrayList<String>();
    public static String kalkisLokasyon = "";
    public static String varisLokasyon = "";
    public static void lokasyonOlustur(){
    	lokasyonAta();
    	int secim = 0;
    	for(int i = 0; i < lokasyonlar.size(); i++) {
    		System.out.println((i + 1) + ") " + lokasyonlar.get(i));
    	}
        while(true) {
        	try {
        		Scanner input = new Scanner(System.in);
                System.out.print("Lutfen Kalkis Lokasyonu Seciniz: ");
            	secim = input.nextInt();
            	if (secim > 0 && secim < 54){
            		kalkisLokasyon = lokasyonlar.get(secim - 1);
                    break;
                } else {
            		System.out.println("Gecersiz Secim. Lutfen Tekrar Deneyiniz.");
		        }
            } catch (Exception e) {
            	System.out.println("Lutfen Rakam Girin.");
            }
        }
        while(true) {
        	try {
        		Scanner input = new Scanner(System.in);
                System.out.print("Lutfen Varis Lokasyonu Seciniz: ");
            	secim = input.nextInt();
            	if (secim > 0 && secim < 54) {
            		if(lokasyonlar.get(secim - 1) != kalkisLokasyon) {
	            		varisLokasyon = lokasyonlar.get(secim - 1);
	                    break;
            		} else {
            			System.out.println("Kalkis Lokasyonu ile Varis Lokasyonu Ayni Olamaz.");
            		}
                } else {
            		System.out.println("Gecersiz Secim. Lutfen Tekrar Deneyiniz.");
		        }
            } catch (Exception e) {
            	System.out.println("Lutfen Rakam Girin.");
            }
        }
    }
    private static void lokasyonAta(){
    	lokasyonlar.add("Adana,Adana Havalimani (ADA)");
    	lokasyonlar.add("Adana,Cukurova Havalimani (COV)");
    	lokasyonlar.add("Adiyaman,Adiyaman Havalimani (ADF)");
    	lokasyonlar.add("Agri,Agri Havalimani (AJI)");
    	lokasyonlar.add("Alanya,Gazipasa Alanya Havalimani (GZP)");
    	lokasyonlar.add("Amasya,Amasya Merzifon Havalimani (MZH)");
    	lokasyonlar.add("Ankara,Ankara Esenboga Havalimani (ESB)");
    	lokasyonlar.add("Antalya,Antalya Havalimani (AYT)");
    	lokasyonlar.add("Balikesir - Edremit,Koca Seyit Havalimani (EDO)");
    	lokasyonlar.add("Batman,Batman Havalimani (BAL)");
    	lokasyonlar.add("Bingol,Bingol Havalimani (BGG)");
    	lokasyonlar.add("Bursa,Bursa Yenisehir Havalimani (YEI)");
    	lokasyonlar.add("Canakkale,Canakkale Havalimani (CKZ)");
    	lokasyonlar.add("Denizli,Denizli Cardak Havalimani (DNZ)");
    	lokasyonlar.add("Diyarbakir,Diyarbakir Havalimani (DIY)");
    	lokasyonlar.add("Elazig,Elazig Havalimani (EZS)");
    	lokasyonlar.add("Erzincan,Erzincan Yildirim Akbulut Havalimani (ERC)");
    	lokasyonlar.add("Erzurum,Erzurum Havalimani (ERZ)");
    	lokasyonlar.add("Eskisehir,Hasan Polatkan Havalimani (AOE)");
    	lokasyonlar.add("Gaziantep,Gaziantep Havalimani (GZT)");
    	lokasyonlar.add("Hakkari,Yuksekova Havalimani (YKO)");
    	lokasyonlar.add("Hatay,Hatay Havalimani (HTY)");
    	lokasyonlar.add("Igdir,Igdir Sehit Bulent Aydin Havalimani (IGD)");
    	lokasyonlar.add("Isparta,Isparta Suleyman Demirel Havalimani (ISE)");
    	lokasyonlar.add("Istanbul,Istanbul Havalimani (IST)");
    	lokasyonlar.add("Istanbul,Sabiha Gokcen Havalimani (SAW)");
    	lokasyonlar.add("Izmir,Izmir Adnan Menderes Havalimani (ADB)");
    	lokasyonlar.add("Kahramanmaras,Kahramanmaras Havalimani (KCM)");
    	lokasyonlar.add("Kars,Kars Harakani Havalimani (KSY)");
    	lokasyonlar.add("Kastamonu,Kastamonu Havalimani (KFS)");
    	lokasyonlar.add("Kayseri,Kayseri Havalimani (ASR)");
    	lokasyonlar.add("Kocaeli,Kocaeli Cengiz Topel Havalimani (KCO)");
    	lokasyonlar.add("Konya,Konya Havalimani (KYA)");
    	lokasyonlar.add("Kutahya,Zafer Bolgesel Havalimani (KZR)");
    	lokasyonlar.add("Malatya,Malatya Havalimani (MLX)");
    	lokasyonlar.add("Mardin,Mardin Prof. Dr. Aziz Sancar Havalimani (MQM)");
    	lokasyonlar.add("Mugla-Bodrum,Milas-Bodrum Havalimani (BJV)");
    	lokasyonlar.add("Mugla-Dalaman,Dalaman Havalimani (DLM)");
    	lokasyonlar.add("Mus,Mus Havalimani (MSR)");
		lokasyonlar.add("Nevsehir,Nevsehir Kapadokya Havalimani (NAV)");
		lokasyonlar.add("Ordu-Giresun,Ordu-Giresun Havalimani (OGU)");
		lokasyonlar.add("Rize,Rize Artvin Havalimani (RZV)");
		lokasyonlar.add("Samsun,Samsun Carsamba Havalimani (SZF)");
		lokasyonlar.add("Siirt,Siirt Havalimani (SXZ)");
		lokasyonlar.add("Sinop,Sinop Havalimani (NOP)");
		lokasyonlar.add("Sivas,Sivas Nuri Demirag Havalimani (VAS)");
		lokasyonlar.add("Sanliurfa,Sanliurfa GAP Havalimani (GNY)");
		lokasyonlar.add("Sirnak,Sirnak Serafettin Elci Havalimani (NKT)");
		lokasyonlar.add("Tokat,Tokat Havalimani (TJK)");
		lokasyonlar.add("Trabzon,Trabzon Havalimani (TZX)");
		lokasyonlar.add("Usak,Usak Havalimani (USQ)");
		lokasyonlar.add("Van,Van Ferit Melen Havalimani (VAN)");
		lokasyonlar.add("Zonguldak,Zonguldak Havalimani (ONQ)");
    }
}