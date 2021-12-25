package marktProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Market {
	
	
	static List <String> gunler=new ArrayList <String>(Arrays.asList("PAZARTESÝ","SALI","ÇARÞAMBA","PERÞEMBE","CUMA","CUMARTESÝ","PAZAR"));
	static List <Double> gunlukKazanc=new ArrayList <>();
    static double getOrtalama=0;
    static List <String> ortalamaUstuGunler=new ArrayList <>();
    static List <String> ortalamaAltiGunler=new ArrayList <>();
    
    

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/*
		* Bir bakkalýn 7 günlük tüm kazançlarýný günlük olarak gösteren bir program yazýnýz.
     * Ayrýca bakkalýn bu hafta ortalama kazandýðý miktarý gösteren bir method yazýnýz.
     * Ayrýca bakkalýn hangi günler ortalamanýn üstüne kazandýðýný gösteren bir method yazýnýz.
     * Ayrýca bakkalýn hangi günler ortalamanýn altýnda kazandýðýný gösteren bir method yazýnýz.
     *
     * 1. Adým : Günleri içeren bir tane ArrayList oluþturun. (gunler)     ****
     * 2. Adým : Günlük kazançlarý ekleyeceðimiz bir tane ArrayList oluþturun. (gunlukKazanclar)**********
     * 3. Adým : While döngüsü ile kullanýcýdan 7 günlük kazançlarý tekek teker alýp gunlukKazanclar ArrayList'e ekle.*******
     * 4. Adým : getOrtalamaKazanc() adlý method ile ortalama kazancý alýn.  ******
     * 5. Adým : getOrtalamaninUstundeKazancGünleri() adlý method oluþturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karþýlaþtýr
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adým : getOrtalamaninAltindaKazancGünleri() adlý method oluþturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karþýlaþtýr
     * 			 ortalama kazançtan aþaðýysa o günleri return yap.
		 * */
		

		
    System.out.println(        "     ********************GÜNLÜK KAZANÇ PROGRAMINA HOÞGELDÝNÝZ********************     "   );
		
		   System.out.println("                 **********ÝÞLEMLERÝNÝZ ARTIK DAHA KOLAY!************             ");
		
		System.out.println("\n    //// KAZANÇ GÝRÝÞÝ ////\n                         ");
		
		
		
		
		Scanner scan=new Scanner(System.in);
		
		double kazanc=0;       // günlük kazanc alacam
		int gunIndex=0;     // günleri getirmek için, günlerin indexini bulacam
		
        do {
			
        	System.out.println("Lütfen " + gunler.get(gunIndex) + " günü için elde edilen kazancý giriniz: "  );
        	kazanc=scan.nextDouble();
			
			gunlukKazanc.add(kazanc);  // her döngüde sýrasý ile ayný indexe atacak
        	
			System.out.println("" + gunler.get(gunIndex)+" günü için elde edilen kazanç: " + kazanc+"$\n" );
			
			
			gunIndex++;
			
		} while (gunIndex<7);
		
        
        
		getOrtalamaKazanc();
		getOrtalamaninUstundeKazancGünleri();
		getOrtalamaninAltindaKazancGünleri();
	

		
	}

	private static List<String> getOrtalamaninAltindaKazancGünleri() {
		
		
        for (int i = 0; i < gunlukKazanc.size(); i++) {
			
			if (gunlukKazanc.get(i)<getOrtalama) {
			 
			ortalamaAltiGunler.add(gunler.get(i));	
		}
		
        }
        System.out.println("Ortalama kazancýn altýnda olan günler: " + ortalamaAltiGunler);
        
        return ortalamaAltiGunler;
	}

	
	
	private static List<String> getOrtalamaninUstundeKazancGünleri() {
		

		
		for (int i = 0; i < gunlukKazanc.size(); i++) {
			
			if (gunlukKazanc.get(i)>getOrtalama) {
			 
			ortalamaUstuGunler.add(gunler.get(i));
			}
			
		}
		
		System.out.println("Ortalama kazancýn üzerinde olan günler: " + ortalamaUstuGunler);
		
		return ortalamaUstuGunler;
		
	}

	
	
	public static double getOrtalamaKazanc() {
	
		double toplam=0;
	
	
		for (int i = 0; i < gunlukKazanc.size(); i++) {
		
			toplam+=gunlukKazanc.get(i);
			
		}
		
		getOrtalama=toplam/7;
		
		System.out.println("\nBir haftalýk ortalama kazanç: \n" + getOrtalama + "\n");
		
		return getOrtalama;
		
	}

}
