package userInfo;

import java.util.Scanner;

/*
 * 1. filedlar�(encapsulated) id, username, password, active (boolean)  
 *      signdIn(boolean) olan User isimli bir class create ediniz.
 * 
 * 2. b�t�n fieldleri parametre alan bir const tan�mlay�n�z. 
 * 
 * 3. UserMain isminde main i�in bir class create ediniz.    
 * 4. kullan�c�dan 2 adet user bilgisi isteyerek ArrayList'e atay�n�z.  
 *      active ve signedIn default olarak true, false atayabilirsiniz.
 *      id ise sistemden otamatik al�n�z.
 * 
 * 5.e�er password 6 karakterden k���kse yeniden kullan�c�dan giri�i
 * isteyin. 6 karakterden k���k olup olmad���n� kontrol ediniz.     
 * 
 */

public class User {
	

	public Scanner scan=new Scanner(System.in);
   
	private int id=999;
	private String username;
	private String password;
	private boolean active=false;
	private boolean signedIn=false;
	
	
	
	 
	public int getId() {       // Sistemden otomatik gelecek.
		       
		return id;
	}
	
	
	public void setId(int id) {
		
		int ids = 999;
		ids++;
		this.id = ids;
	}
	
	
	
	public String getUsername() {
		return username;
	}
	
	
	
	public void setUsername(String username) {
		
		String isim;
		System.out.println("L�tfn username giriniz: ");
		isim=scan.next();
		System.out.println("�sminiz: " + isim);
		
		
		
		this.username = username;
	}
	
	
	
	
	
	
	
	public String getPassword() {
		return password;
	}
	
	
	
	
	public void setPassword(String password) {
		
		String sifre="";
		System.out.println("L�tfen password giriniz: ");
		sifre=scan.next();
		
		if (sifre.length() < 6) {
			
			do {
				System.out.println("L�tfen en az 6 karakterli bir �ifre girin.");
				sifre = scan.next();
			} while ((sifre.length() == 6));  
			}
		System.out.println("�ifreniz kaydedildi.");
		
		this.password = sifre;
	}
	
	
	
	
	
	
	
	
	public boolean isActive() {
		return active;
	}
	
		
	public void setActive(boolean active) {
		
		int activ;
		System.out.println("Active durumunuzu 1(E)/2(H) olarak giriniz");
		activ=scan.nextInt();
		switch (activ) {
		
		case 1:
			this.active=true;
			System.out.println("True olarak ayarland�.");
			break;
        case 2:
        	this.active=false;
        	System.out.println("False olarak ayarland�.");
			break;
		default:
			System.out.println("Yanl�� giri� yapt�n�z");
			System.out.println("False olarak ayarland�.");
			this.active = active;
			break;
		}
		
		
		
	}
	
		
		
	
	
	
	
	public boolean isSignedIn() {
		return signedIn;
	}
	
	
	public void setSignedIn(boolean signedIn) {
		
		int signed;
		System.out.println("Signed durumunuzu 1(E)/2(H) olarak giriniz");
		signed=scan.nextInt();
		switch (signed) {
		
		case 1:
			this.signedIn=true;
			System.out.println("True olarak ayarland�.");
			break;
        case 2:
        	this.signedIn=false;
        	System.out.println("False olarak ayarland�.");
			break;
		default:
			System.out.println("Yanl�� giri� yapt�n�z");
			System.out.println("False olarak ayarland�.");
			this.signedIn = signedIn;
			break;
		}
		
		
		
	}






	
	
 
    
}