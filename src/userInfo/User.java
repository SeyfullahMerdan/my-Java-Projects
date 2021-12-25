package userInfo;

import java.util.Scanner;

/*
 * 1. filedlarý(encapsulated) id, username, password, active (boolean)  
 *      signdIn(boolean) olan User isimli bir class create ediniz.
 * 
 * 2. bütün fieldleri parametre alan bir const tanýmlayýnýz. 
 * 
 * 3. UserMain isminde main için bir class create ediniz.    
 * 4. kullanýcýdan 2 adet user bilgisi isteyerek ArrayList'e atayýnýz.  
 *      active ve signedIn default olarak true, false atayabilirsiniz.
 *      id ise sistemden otamatik alýnýz.
 * 
 * 5.eðer password 6 karakterden küçükse yeniden kullanýcýdan giriþi
 * isteyin. 6 karakterden küçük olup olmadýðýný kontrol ediniz.     
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
		System.out.println("Lütfn username giriniz: ");
		isim=scan.next();
		System.out.println("Ýsminiz: " + isim);
		
		
		
		this.username = username;
	}
	
	
	
	
	
	
	
	public String getPassword() {
		return password;
	}
	
	
	
	
	public void setPassword(String password) {
		
		String sifre="";
		System.out.println("Lütfen password giriniz: ");
		sifre=scan.next();
		
		if (sifre.length() < 6) {
			
			do {
				System.out.println("Lütfen en az 6 karakterli bir þifre girin.");
				sifre = scan.next();
			} while ((sifre.length() == 6));  
			}
		System.out.println("Þifreniz kaydedildi.");
		
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
			System.out.println("True olarak ayarlandý.");
			break;
        case 2:
        	this.active=false;
        	System.out.println("False olarak ayarlandý.");
			break;
		default:
			System.out.println("Yanlýþ giriþ yaptýnýz");
			System.out.println("False olarak ayarlandý.");
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
			System.out.println("True olarak ayarlandý.");
			break;
        case 2:
        	this.signedIn=false;
        	System.out.println("False olarak ayarlandý.");
			break;
		default:
			System.out.println("Yanlýþ giriþ yaptýnýz");
			System.out.println("False olarak ayarlandý.");
			this.signedIn = signedIn;
			break;
		}
		
		
		
	}






	
	
 
    
}