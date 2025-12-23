package exercice4;

public class Utilisateur {
	private String nom;
	static int count=0;
	 
	public Utilisateur(String nom) {
		this.nom=nom;
		count++;	
	}
	
	static int getCount() {
		return count;
	}
	
	
	

}