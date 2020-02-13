package heritage_Abstract;

public class ContactExt extends Personne{
	
	protected TypeContact type;

	public ContactExt(String N, String P, int A,TypeContact T) {
		super(N, P, A);
		this.type=T;
	}

	
	
	public TypeContact getType() {
		return type;
	}


	public void setType(TypeContact type) {
		this.type = type;
	}



	@Override
	public void Afficher() {
		System.out.println("Contact Exterieur : ");
		System.out.println("Nom : "+getNom()+" Prenom : "+getPrenom()+
							" Age : "+getAge());
		System.out.println("Type de contact : "+getType());
		
	}
	
}
