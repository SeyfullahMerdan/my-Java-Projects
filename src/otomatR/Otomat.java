package otomatR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Otomat {

	/* projemizin adý YIYECEK OTOMATI
	--15 adet ürün ve bu ürünlerin fiyatlarýný belirleyiniz. *****
	Bu ürünler ekranda listelensin****************
	--Ürün seçip, para miktarý giriniz*******************************
	--girdiðiniz para fazla ise üstünü versin, ***********
	eksik ise ekleme yapmanýzý istesin******************
	--Ek ürün seçme seçeneði olsun, siz devam ettiðiniz sürece, **********************
	para kontrolünü de yaparak iþlem yapmaya devam etsin...************************************
	NOT: Otomat sadece 1 tl , 5 tl, 10 tl, 20 tl miktarlarýný kabul etsin !(paraMiktari==1 || parmiktari==5 || paramiktari==10 || paraMiktari==20)
	oop concepte ait öðrendiklerimizi kullanmaya çalýþalým...*************************
	iyi çalýþmalar
	Kolay gelsin...
	1- ne istedigini sor*****
	2- fiyatini hesabla******
	3- parasini al**********
	4- cikis   */
	
	static List <String> urun= new ArrayList<>(Arrays.asList( "Albeni","Halley","Çizi","Cips","Bisküvi","Gofret","Biskrem","Sakýz","Redbull","Cola","Fanta","Ayran","Su","Sprite","Soda" ));
    static List <Double> urunFiyat=new ArrayList<>(Arrays.asList(5.0 , 5.0 , 2.0 , 5.0 , 4.0 , 3.5 , 3.0 , 1.0 , 5.0 , 3.5 , 4.0 , 3.0 , 2.0 , 1.5 , 1.5 ));
	
	public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);	
	
	System.out.println("    **********HOÞGELDÝNÝZ**********    \n");	
	System.out.println("  **********KOLAY ve PRATÝK********** \n\n");
		
	System.out.println(" *****OTOMAT ÜRÜNLER***** \n");	
		
	System.out.println("NO\tÜRÜN LÝSTESÝ \tÜRÜN FÝYATI");	
		
	
	for (int i = 0; i < urun.size(); i++) {
		System.out.println(" " + (i+1) + "\t" + urun.get(i) + "\t" + "\t"  +  urunFiyat.get(i) );
	}
	
	int urunKodu=0;
	double urunMiktari=0;
	int secim=0;
	double paraMiktari=0;
	double ekTutar=0;
	
	
	
	do {
	
	System.out.println("\nLütfen almak istediginiz ürün kodunu giriniz: ");
	urunKodu=scan.nextInt();   // 1den 15e kadar girecek
	
	if (urunKodu>15 || urunKodu<=0) {
	       
		System.out.println("Geçersiz giriþ yaptýnýz.Lütfen tekrar deneyiniz.");
		
		
	} else {
		
		System.out.println("Seçilen ürün: "  + urun.get(urunKodu-1)   );
		System.out.println("Ürünün fiyatý: "  + urunFiyat.get(urunKodu-1)   );
		
		urunMiktari+=urunFiyat.get(urunKodu-1);	
		
	}
	
	System.out.println("\nÜrün eklemek için herhangi bir tuþa basýnýz, kasaya gitmek için 2'yi tuþlayýnýz.");
	secim=scan.nextInt();
	
	} while (!(secim==2));
	
	
	System.out.println("\nToplam ödenmesi gereken tutar: " + urunMiktari );
	
	
	
	
	do {
	
	
	System.out.println("Lütfen ödemek istediginiz miktarý giriniz:\nLütfen sadece 1$,5$,10$,20$ banknotlardan giriniz.");
	paraMiktari=scan.nextDouble();
	
	
	if (!(paraMiktari==1 || paraMiktari==5 || paraMiktari==10 || paraMiktari==20) ) {
	  
		System.out.println("Geçersiz miktar giriþi yapmaya çalýþtýnýz.Otomata sadece 1$, 5$, 10$, 20$ banknotlardan yatýrabilirsiniz."+
		                                                  "Lütfen tekrar deneyiniz."); 
		
	}
	
	
	} while ( !(paraMiktari==1 || paraMiktari==5 || paraMiktari==10 || paraMiktari==20) ) ;
	
	/////////////////////
	
	
	
	if (paraMiktari>=urunMiktari) {
		
		System.out.println("Giriþi yapýlan miktar: " + paraMiktari + "\nPara üstünüz: " + (paraMiktari-urunMiktari) + "$'dýr"
		+   "\n*****Teþekkür eder, iyi günler dileriz*****"  );
		
		
		
	} else if (paraMiktari<urunMiktari) {

		
	   do {
		
		System.out.println("Eksik tutar girdiniz. Talep edilen ürün fiyatý: " + urunMiktari + "\nGirilen miktar: " +paraMiktari 
				+ "\nÖdenmesi gereken ek tutar: " +(urunMiktari-paraMiktari) + "Lütfen belirtilen tutarý giriniz: "  ) ;
		
		ekTutar=scan.nextDouble(); //3
	
		
		// kullanýcý istenilen paralardan girmeyebilir
		if (  !(ekTutar==1 || ekTutar==5 || ekTutar==10 || ekTutar==20)  ) {
			System.out.println("Ýþlem baþarýsýz. Geçersiz miktar giriþi yaptýnýz." + "Otomata sadece 1$, 5$, 10$, 20$ banknotlardan yatýrabilirsiniz."+
                    "Lütfen tekrar deneyiniz.");
		
			
		// kullanýcý parayý istenilen banknolardan girip istenilen fiyatýn ödemesini yapabilir.
		} else {
			paraMiktari+=ekTutar;
		}
		
		if (paraMiktari>=urunMiktari) {

			System.out.println("Giriþi yapýlan miktar: " + paraMiktari + "\nPara üstünüz: " + (paraMiktari-urunMiktari) + "$'dýr"
					+   "\n*****Teþekkür eder, iyi günler dileriz*****"  );
	   // break;
			urunMiktari=paraMiktari;
				// kullanýcý ek tutarý giriken sonra yine de istenilen ücrete ulaþamayabilir.	
		}  else {
			
			System.out.println("Eksik tutar girdiniz.Lütfen tekrar istenilen tutarý giriniz: ");
			}
		
		} while ( !(urunMiktari==paraMiktari) );
		
		
		
	   }
	   
	}
	}
	
