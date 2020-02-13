package heritage_Abstract;

public abstract class Personel extends Personne{
	
	protected Contract contrat;
	
	public Personel(String N, String P, int A,Contract C) {
		super(N, P, A);
		this.contrat=C;
	}

	public Contract getCtr() {
		return contrat;
	}

	public void setCtr(Contract ctr) {
		contrat = ctr;
	}
 
}
