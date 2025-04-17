package produits;

public interface IProduit {

	String getNom();

	String decrireProduit();
	
	default int calculerPrix(int prixFixe) {
		return prixFixe;
	}

}