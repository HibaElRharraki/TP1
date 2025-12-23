package exercice2;

public class Panier {
	private Article[] articles;
	private int  nbArticles;
	
	public Panier() {
		articles =new Article[5];
		nbArticles=0;	
	}
	
	public void ajouterArticle(Article article) {
		if(nbArticles<articles.length) {
			articles[nbArticles]=article;
			nbArticles++;
		}
		else {
			System.out.println("Le Panier est plein!");
		}
	}
	
	public double calculerTotal() {
		double somme=0;
		for(Article i: articles) {
			 somme=somme+i.getPrix();
		}
		return somme;
	}
	
	public void afficherPanier() {
	    System.out.println("Contenu du panier :");
	    for (int i = 0; i <nbArticles; i++) {
	       articles[i].afficher();
	    }
	}
}	
	
	
	