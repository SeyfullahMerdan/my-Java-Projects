package otomatR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Otomat {

	/* projemizin ad� YIYECEK OTOMATI
	--15 adet �r�n ve bu �r�nlerin fiyatlar�n� belirleyiniz. *****
	Bu �r�nler ekranda listelensin****************
	--�r�n se�ip, para miktar� giriniz*******************************
	--girdi�iniz para fazla ise �st�n� versin, ***********
	eksik ise ekleme yapman�z� istesin******************
	--Ek �r�n se�me se�ene�i olsun, siz devam etti�iniz s�rece, **********************
	para kontrol�n� de yaparak i�lem yapmaya devam etsin...************************************
	NOT: Otomat sadece 1 tl , 5 tl, 10 tl, 20 tl miktarlar�n� kabul etsin !(paraMiktari==1 || parmiktari==5 || paramiktari==10 || paraMiktari==20)
	oop concepte ait ��rendiklerimizi kullanmaya �al��al�m...*************************
	iyi �al��malar
	Kolay gelsin...
	1- ne istedigini sor*****
	2- fiyatini hesabla******
	3- parasini al**********
	4- cikis   */
	
	static List <String> urun= new ArrayList<>(Arrays.asList( "Albeni","Halley","�izi","Cips","Bisk�vi","Gofret","Biskrem","Sak�z","Redbull","Cola","Fanta","Ayran","Su","Sprite","Soda" ));
    static List <Double> urunFiyat=new ArrayList<>(Arrays.asList(5.0 , 5.0 , 2.0 , 5.0 , 4.0 , 3.5 , 3.0 , 1.0 , 5.0 , 3.5 , 4.0 , 3.0 , 2.0 , 1.5 , 1.5 ));
	
	public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);	
	
	System.out.println("    **********HO�GELD�N�Z**********    \n");	
	System.out.println("  **********KOLAY ve PRAT�K********** \n\n");
		
	System.out.println(" *****OTOMAT �R�NLER***** \n");	
		
	System.out.println("NO\t�R�N L�STES� \t�R�N F�YATI");	
		
	
	for (int i = 0; i < urun.size(); i++) {
		System.out.println(" " + (i+1) + "\t" + urun.get(i) + "\t" + "\t"  +  urunFiyat.get(i) );
	}
	
	int urunKodu=0;
	double urunMiktari=0;
	int secim=0;
	double paraMiktari=0;
	double ekTutar=0;
	
	
	
	do {
	
	System.out.println("\nL�tfen almak istediginiz �r�n kodunu giriniz: ");
	urunKodu=scan.nextInt();   // 1den 15e kadar girecek
	
	if (urunKodu>15 || urunKodu<=0) {
	       
		System.out.println("Ge�ersiz giri� yapt�n�z.L�tfen tekrar deneyiniz.");
		
		
	} else {
		
		System.out.println("Se�ilen �r�n: "  + urun.get(urunKodu-1)   );
		System.out.println("�r�n�n fiyat�: "  + urunFiyat.get(urunKodu-1)   );
		
		urunMiktari+=urunFiyat.get(urunKodu-1);	
		
	}
	
	System.out.println("\n�r�n eklemek i�in herhangi bir tu�a bas�n�z, kasaya gitmek i�in 2'yi tu�lay�n�z.");
	secim=scan.nextInt();
	
	} while (!(secim==2));
	
	
	System.out.println("\nToplam �denmesi gereken tutar: " + urunMiktari );
	
	
	
	
	do {
	
	
	System.out.println("L�tfen �demek istediginiz miktar� giriniz:\nL�tfen sadece 1$,5$,10$,20$ banknotlardan giriniz.");
	paraMiktari=scan.nextDouble();
	
	
	if (!(paraMiktari==1 || paraMiktari==5 || paraMiktari==10 || paraMiktari==20) ) {
	  
		System.out.println("Ge�ersiz miktar giri�i yapmaya �al��t�n�z.Otomata sadece 1$, 5$, 10$, 20$ banknotlardan yat�rabilirsiniz."+
		                                                  "L�tfen tekrar deneyiniz."); 
		
	}
	
	
	} while ( !(paraMiktari==1 || paraMiktari==5 || paraMiktari==10 || paraMiktari==20) ) ;
	
	/////////////////////
	
	
	
	if (paraMiktari>=urunMiktari) {
		
		System.out.println("Giri�i yap�lan miktar: " + paraMiktari + "\nPara �st�n�z: " + (paraMiktari-urunMiktari) + "$'d�r"
		+   "\n*****Te�ekk�r eder, iyi g�nler dileriz*****"  );
		
		
		
	} else if (paraMiktari<urunMiktari) {

		
	   do {
		
		System.out.println("Eksik tutar girdiniz. Talep edilen �r�n fiyat�: " + urunMiktari + "\nGirilen miktar: " +paraMiktari 
				+ "\n�denmesi gereken ek tutar: " +(urunMiktari-paraMiktari) + "L�tfen belirtilen tutar� giriniz: "  ) ;
		
		ekTutar=scan.nextDouble(); //3
	
		
		// kullan�c� istenilen paralardan girmeyebilir
		if (  !(ekTutar==1 || ekTutar==5 || ekTutar==10 || ekTutar==20)  ) {
			System.out.println("��lem ba�ar�s�z. Ge�ersiz miktar giri�i yapt�n�z." + "Otomata sadece 1$, 5$, 10$, 20$ banknotlardan yat�rabilirsiniz."+
                    "L�tfen tekrar deneyiniz.");
		
			
		// kullan�c� paray� istenilen banknolardan girip istenilen fiyat�n �demesini yapabilir.
		} else {
			paraMiktari+=ekTutar;
		}
		
		if (paraMiktari>=urunMiktari) {

			System.out.println("Giri�i yap�lan miktar: " + paraMiktari + "\nPara �st�n�z: " + (paraMiktari-urunMiktari) + "$'d�r"
					+   "\n*****Te�ekk�r eder, iyi g�nler dileriz*****"  );
	   // break;
			urunMiktari=paraMiktari;
				// kullan�c� ek tutar� giriken sonra yine de istenilen �crete ula�amayabilir.	
		}  else {
			
			System.out.println("Eksik tutar girdiniz.L�tfen tekrar istenilen tutar� giriniz: ");
			}
		
		} while ( !(urunMiktari==paraMiktari) );
		
		
		
	   }
	   
	}
	}
	
