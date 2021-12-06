package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Market {

	public static void main(String[] args) {
		
		/*
		* Bir bakkal�n 7 g�nl�k t�m kazan�lar�n� g�nl�k olarak g�steren bir program yaz�n�z.
     * Ayr�ca bakkal�n bu hafta ortalama kazand��� miktar� g�steren bir method yaz�n�z.
     * Ayr�ca bakkal�n hangi g�nler ortalaman�n �st�ne kazand���n� g�steren bir method yaz�n�z.
     * Ayr�ca bakkal�n hangi g�nler ortalaman�n alt�nda kazand���n� g�steren bir method yaz�n�z.
     *
     * 1. Ad�m : G�nleri i�eren bir tane ArrayList olu�turun. (gunler)     ****
     * 2. Ad�m : G�nl�k kazan�lar� ekleyece�imiz bir tane ArrayList olu�turun. (gunlukKazanclar)
     * 3. Ad�m : While d�ng�s� ile kullan�c�dan 7 g�nl�k kazan�lar� tekek teker al�p gunlukKazanclar ArrayList'e ekle.
     * 4. Ad�m : getOrtalamaKazanc() adl� method ile ortalama kazanc� al�n.
     * 5. Ad�m : getOrtalamaninUstundeKazancG�nleri() adl� method olu�turun.
     * 			 for d�ng�s� ile t�m g�nleri ortalama kazan� ile kar��la�t�r
     * 			 ortalama kazan�tan y�ksekse o g�nleri return yap.
     * 6. Ad�m : getOrtalamaninAltindaKazancG�nleri() adl� method olu�turun.
     * 			 for d�ng�s� ile t�m g�nleri ortalama kazan� ile kar��la�t�r
     * 			 ortalama kazan�tan a�a��ysa o g�nleri return yap.
		 * */
		
		
		List <String> gunler=new ArrayList <String>(Arrays.asList("PAZARTES�,SALI,�AR�AMBA,PER�EMBE,CUMA,CUMARTES�,PAZAR"));
		List <Double> gunlukKazanc=new ArrayList <>();

		
		Scanner scan=new Scanner(System.in);
		
		double kazanc=0;       // g�nl�k kazanc alacam
		int gunIndex=0;     // g�nleri getirmek i�in, g�nlerin indexini bulacam
		
        do {
			
        	System.out.println("L�tfen " + gunler.get(gunIndex) + " g�n� i�in elde edilen kazanc� giriniz: "  );
        	kazanc=scan.nextDouble();
			
			gunlukKazanc.add(kazanc);  // her d�ng�de s�ras� ile ayn� indexe atacak
			
        	
        	
			gunIndex++;
			
		} while (gunIndex>6);
		
		
		System.out.println(gunlukKazanc);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
