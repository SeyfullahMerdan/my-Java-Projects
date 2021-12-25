package marktProject2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Market2 {

	
		static List<String> urunler=new ArrayList<>(Arrays.asList("00 Domates","01 Patates","02 Biber","03 Sogan","04 Havuç","05 Elma","06 Muz","07 Çilek","08 Kavun","09 Üzüm","10 Limon"));
	    static List<Double> fiyatlar=new ArrayList<>(Arrays.asList(2.10,3.20,1.50,2.30,3.10,1.20,1.90,6.10,4.30,2.70,0.50));
		static List<String> sepetUrunlerin=new ArrayList<>();
		static List<Double> sepetKg=new ArrayList<>();
		static List<Double> sepetFiyatlar=new ArrayList<>();
		static Scanner scan= new Scanner(System.in);
		
	    
	    

		@SuppressWarnings("resource")
		public static void main(String[] args) {

			
			/* Basarili Market alýþ-veriþ programý.
			 *
			 * 1. Adým: Ürünler ve fiyatlarý içeren listeleri oluþturunuz.
			 * 			No 	   Ürün 		  Fiyat
					   ====	 =======	 	=========
						00	 Domates   	 	 2.10 TL
						01	 Patates   	 	 3.20 TL
						02	 Biber     	 	 1.50 TL
						03	 Soðan      	 2.30 TL
						04	 Havuç     	   	 3.10 TL
						05	 Elma      	   	 1.20 TL
						06	 Muz     	 	 1.90 TL
						07	 Çilek 	 		 6.10 TL
						08	 Kavun      	 4.30 TL
						09	 Üzüm      	 	 2.70 TL
						10	 Limon     	 	 0.50 TL
			 * 2. Adým: Kullanýcýnýn ürün nosuna göre listeden ürün seçmesini isteyiniz.
			 * 3. Adým: Kaç kg satýn almak istediðini sorunuz.
			 * 4. Adým: Alýnacak bu ürünü sepete ekleyiniz ve Sepeti yazdýrýnýz.
			 * 5. Baþka bir ürün alýp almak istemediðini sorunuz.
			 * 6. Eðer devam etmek istiyorsa yeniden ürün seçme kýsmýna yönlendiriniz.
			 * 7. Eðer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak  programý bitirinzi.
			 */
			
			
			Scanner scan= new Scanner(System.in);
			
			String devam="";
			
			double toplamFiyat=0;
			
			do {
				urunListesi();
				System.out.println("seçtiginiz ürün kodunuzu giriniz");
				int urunNo=scan.nextInt();
				System.out.println("kaç kilo");
				double kg=scan.nextDouble();
				
				sepeteEkle(urunNo,kg);
				
				sepetTutari();
				toplamFiyat=sepetTutari();
				System.out.println("devam mý? E'ye basýn");
				devam=scan.nextLine();
			//	scan.nextLine(); // dummy kukla
				
			} while (devam.equalsIgnoreCase("e"));
			
			odeme(toplamFiyat);
			
			
			
		}



		private static double sepetTutari() {
			
			double sepetToplamTutari=0;
			double septKg=0;
			
			for (int i = 0; i < sepetUrunlerin.size(); i++) {
				
				sepetToplamTutari+=sepetFiyatlar.get(i);
				septKg+=sepetKg.get(i);
				
			}
			
			
			
			System.out.println("toplam miktar : " + sepetToplamTutari + "aldýgýnýz miktar " + septKg);
			return sepetToplamTutari;
			
			
			
		}



		private static void odeme(double toplamFiyat) {

			System.out.println("Ödemeniz gereken miktar : " +toplamFiyat);
		    
			double nakit=0;
			
			
			do {
			System.out.println("Lütfen nakit ödemenizi giriniz : ");
			nakit+=scan.nextDouble();	
			 
	         if (nakit < toplamFiyat) {
	             System.out.println("eksik odeme yaptiniz " + (toplamFiyat - nakit) + " daha odeme yapiniz");
	         }
			
			} while (nakit<toplamFiyat);
			
			double paraUstu=nakit-toplamFiyat;
			
			if (paraUstu>0) {
				System.out.println("Para üstünüz : " + paraUstu);
			}
			
			
			
			System.out.println("yine bekleriz. iyi günler");
			
			
			
			
			
		}



		private static void sepeteEkle(int urunNo, double kg) {
		
			sepetUrunlerin.add(urunler.get(urunNo));
			sepetKg.add(kg);
			sepetFiyatlar.add(fiyatlar.get(urunNo)*kg);
			
			
		}



		private static void urunListesi() {
			
			System.out.println("No\t Ürünler \t Fiyatlar");
			System.out.println("====\t  ====== \t =========");
			
			
			for (int i = 0; i < urunler.size(); i++) {
				
				System.out.println(" " + i + "\t" + urunler.get(i) + "\t" + fiyatlar.get(i));
				
			}
			
			
			
			
		}

	}
