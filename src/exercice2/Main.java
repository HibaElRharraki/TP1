package exercice2;

public class Main {

	public static void main(String[] args) {
		
		Article a1=new Article("Stylo",3.3);
		Article a2=new Article("Cahier",5.5);
		Article a3=new Article("Corecteur",5);
		Panier p1= new Panier();
		p1.ajouterArticle(a1);
		p1.ajouterArticle(a2);
		p1.ajouterArticle(a3);
		p1.afficherPanier();

	}

}
