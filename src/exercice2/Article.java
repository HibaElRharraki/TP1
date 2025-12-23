package exercice2;

public class Article {
	private String nom;
	private double prix;
	public Article(String n, double p){
		this.nom=n;
		this.prix=p;
	}
	public void afficher() {
		System.out.println("Nom: "+nom +" Prix: "+prix);
	}
	
	public double getPrix() {
		return prix;
	}
	
}