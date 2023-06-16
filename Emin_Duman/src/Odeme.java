import java.time.LocalDate;
import java.util.*;
public class Odeme {
	public static void odemeYap() {
		while(true) {
			System.out.print("Kart Numarasini Giriniz: ");
            Scanner scanner = new Scanner(System.in);
            String kartNo = scanner.nextLine();
            try {
                Long.parseLong(kartNo);
                if (kartNo.length() == 16) {
                    break;
                } else {
                    System.out.println("Kart Numarasi 16 Haneden Olusur.");
                }
            } catch (Exception e) {
                System.out.println("Kart Numarasi Rakamlardan Olusur.");
            }
		}
		while(true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.print("Son Kullanma Tarihinde Bulunan Ayi Giriniz: ");
	            int ay = scanner.nextInt();
	            if(ay > 0 && ay < 13) {
	            	break;
	            } else {
	            	System.out.println("1 - 12 Arasi Bir Sayi Giriniz.");
	            }
			} catch (Exception e) {
				System.out.println("Sayi Giriniz.");
			}
		}
		while(true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.print("Son Kullanma Tarihinde Bulunan Yili Giriniz: ");
				int simdiYil = LocalDate.now().getYear();
	            int yil = scanner.nextInt();
	            if(yil >= simdiYil && yil <= simdiYil + 2) {
	            	break;
	            } else {
	            	System.out.println(simdiYil + " - " + (simdiYil + 2) + " Arasi Bir Sayi Giriniz.");
	            }
			} catch (Exception e) {
				System.out.println("Sayi Giriniz.");
			}
		}
		while(true) {
			System.out.print("Guvenlik Kodu Giriniz: ");
            Scanner scanner = new Scanner(System.in);
            String guvenlikKod = scanner.nextLine();
            try {
            	Integer.parseInt(guvenlikKod);
                if (guvenlikKod.length() == 3 && Integer.parseInt(guvenlikKod) != 0) {
                    break;
                } else {
                    System.out.println("Guvenlik Kodu 3 Haneden Olusur.");
                }
            } catch (Exception e) {
                System.out.println("Guvenlik Kodu Rakamlardan Olusur.");
            }
		}
	}
}