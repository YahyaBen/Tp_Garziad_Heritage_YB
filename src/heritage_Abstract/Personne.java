package heritage_Abstract;

public abstract class Personne {
	
	protected String nom;
	protected String prenom;
	protected int age;
	
	public Personne(String N, String P, int A) {
		this.nom = N;
		this.prenom = P;
		this.age = A;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract void Afficher();
}
