package heritage_Abstract;

public class Administratif extends Personel{

	private Poste poste;

	public Administratif(String N, String P, int A, Contract C, Poste Po) {
		super(N, P, A, C);
		this.poste = Po;
	}

	@Override
	public void Afficher() {
		System.out.println("Contact Admin : ");
		System.out.println("Nom : "+getNom()+" Prenom : "+getPrenom()+
							" Age : "+getAge());
		System.out.println("Type de poste : "+getPoste());
		
	}

	public Poste getPoste() {
		return poste;
	}

	public void setPoste(Poste poste) {
		this.poste = poste;
	}
	
	
	
	
}
