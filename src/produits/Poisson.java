package produits;

public class Poisson extends Produit {
	private String datePeche;
	
	public Poisson(String datePeche) {
		super("poisson",Unite.PIECE);
		this.datePeche = datePeche;
	}
	
	@Override
	public String decrireProduit() {
		return getNom() + " pêchés " + datePeche;
	}
	
	@Override
	public int calculerPrix(int prixFixe) {
		return prixFixe;
	}
	
}
