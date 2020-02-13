package heritage_Abstract;

public class Enseignant extends Personel{
	
	private Grade grade;

	public Enseignant(String N, String P, int A, Contract C, Grade G) {
		super(N, P, A, C);
		this.grade = G;
	}

	
	public Grade getGrade() {
		return grade;
	}


	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	
	@Override
	public void Afficher() {
		System.out.println("Contact Enseignant : ");
		System.out.println("Nom : "+getNom()+" Prenom : "+getPrenom()+
							" Age : "+getAge());
		System.out.println("Type de Grade : "+getGrade());
		
	}
	
	
	

}
