package produits;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private double poids;
	private Gaulois chasseur;
	
	public Sanglier(double poids, Gaulois chasseur) {
		super("sanglier",Unite.KILOGRAMME);
		this.poids = poids;
		this.chasseur = chasseur;
	}
	
	@Override
	public String decrireProduit() {
		return getNom() + " de " + this.poids + unite.toString() + " chassé par " + chasseur.getNom();
	}
	
	@Override
	public int calculerPrix(int prixFixe) {
		return (int) Math.floor(poids/1000*prixFixe);
	}
}
