package userInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * 1. filedlar�(encapsulated) id, username, password, active (boolean)  ++++
 *      signdIn(boolean) olan User isimli bir class create ediniz.******************* ++++
 * 
 * 2. b�t�n fieldleri parametre alan bir const tan�mlay�n�z. ************  ++++
 * 
 * 3. UserMain isminde main i�in bir class create ediniz.     ++++
 * 4. kullan�c�dan 2 adet user bilgisi isteyerek ArrayList'e atay�n�z.  ++++
 *      active ve signedIn default olarak true, false atayabilirsiniz.
 *      id ise sistemden otamatik al�n�z.
 * 
 * 5.e�er password 6 karakterden k���kse yeniden kullan�c�dan giri�i
 * isteyin. 6 karakterden k���k olup olmad���n� kontrol ediniz.         ++++++
 * 
 */

public class User {
	
	public Scanner scan=new Scanner(System.in);
	private int id=999;
	private String username;
	private String password;
	private boolean active=true;
	private boolean signedIn=false;
	
    private List <String> userInfo=new ArrayList <>();
 
    User (String username,String password, int id, boolean active, boolean signedIn ) {
    	
  
    	
    	System.out.println("Please enter Username : ");
		this.username=scan.nextLine();
		
		
		do {
		
			System.out.println("Please create new password. It should be minimum 6 character: ");
		 this.password=scan.nextLine().trim().replaceAll("\\s","");
			

		} while (!(this.password.length()==6));
		
		System.out.println("Your password has been successfully saved.");
		
		
		
		id=this.id++;
		this.active=active;
    	this.signedIn=signedIn;
    	
    	
    	
    }
		
}
