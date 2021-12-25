package hastane_project;

public class HastaneRunner {
	
	static Hastane hastane1 = new Hastane ();
	static Durum drm = new Durum();
	
	public static void main (String[] args) {
		
		
		
		String hastaDurumu="Soguk alginligi"; // Bas agrisi
		
		String unvan = doktorUnvan(hastaDurumu);
		
		
		hastane1.setDoktor(doktorBul(unvan));
		hastane1.setHasta(hastaBul(hastaDurumu));		
		hastaDurumuBul(hastaDurumu);
		
		System.out.println("Doktorun adi soyadi: "+ hastane1.getDoktor().getIsim()+" "+ hastane1.getDoktor().getSoyIsim());
		System.out.println("Doktorun unvani: "+hastane1.getDoktor().getUnvan());
		System.out.println("Hastanin adi soyadi: "+hastane1.getHasta().getIsim()+" "+hastane1.getHasta().getSoyIsim());
		System.out.println("Hastanin ID :"+hastane1.getHasta().getHastaID());
		System.out.println("Hasta aciliyeti: "+drm.isAciliyet());
		
	}//
	
	public static String doktorUnvan (String aktuelDurum) {
		
		if (aktuelDurum.equals("Allerji")  ) {
		   return hastane1.unvanlar[0] ;
		} else if (aktuelDurum.equals("Bas agrisi")) {
			return hastane1.unvanlar[1];
		} else if (aktuelDurum.equals("Diabet")) {
			return hastane1.unvanlar[2];
		} else if (aktuelDurum.equals("Soguk alginligi")) {
			return hastane1.unvanlar[3];
		} else if (aktuelDurum.equals("Migren")) {
			return hastane1.unvanlar[4];
		} else if (aktuelDurum.equals("Kalp hastaliklari")) {
			return hastane1.unvanlar[5];
		} else {
	  		return "yanlis unvan";
		}
	
	}

	
	public static Doktor doktorBul(String unvan){ 
		
		Doktor doktor= new Doktor();

		
		for (int i = 0; i < hastane1.unvanlar.length; i++) {
			
			
			if (hastane1.unvanlar[i].equalsIgnoreCase(unvan)) {
				
				doktor.setIsim(hastane1.doctorIsimleri[i]);
				doktor.setSoyIsim(hastane1.doctorSoyIsimleri[i]);
				doktor.setUnvan(hastane1.unvanlar[i]);
				
			}
			
			
		}
		
	
		return doktor;
	}

	
	public static Durum hastaDurumuBul(String aktuelDurum) {
		
		
		
		switch (aktuelDurum) {
		
		case "Allerji":
			
		case "Bas agrisi":
			
		case "Soguk alginligi":
			
		case "Diabet":
			
			drm.setAciliyet(false);
			
			break;
			
		case "Migren":
			
		case "Kalp hastaliklari":
			
			drm.setAciliyet(true);
			break;
			
		default:
			
			System.out.println("Gecerli durum degil.");
			
			break;
		}
		
		
		return drm;
	
	}

	
	public static Hasta hastaBul(String aktuelDurum) {
		
		
		Hasta hasta = new Hasta();
		
		
		for (int i = 0; i < hastane1.hastaIsimleri.length; i++) {
			
			
			if (hastane1.durumlar[i].equals(aktuelDurum)) {
				
				hasta.setIsim(hastane1.hastaIsimleri[i]);
				hasta.setSoyIsim(hastane1.hastaSoyIsimleri[i]);
				hasta.setHastaID(hastane1.hastaIDleri[i]);
				
			}
			
		}
		
		
		
		
		
		
		
		
		return hasta;
	}


	
	
	
	
	
	

}//
