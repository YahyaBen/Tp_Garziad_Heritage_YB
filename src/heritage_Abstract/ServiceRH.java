package heritage_Abstract;

import java.util.ArrayList;

public class ServiceRH {

	private String nomUniv;
	private ArrayList<Personne> Pers;

	public ServiceRH(String nomUniv) {

		this.nomUniv = nomUniv;
		Pers = new ArrayList<Personne>();
	}

	public String getNomUniv() {
		return nomUniv;
	}

	public void setNomUniv(String nomUniv) {
		this.nomUniv = nomUniv;
	}

	public ArrayList<Personne> getPers() {
		return Pers;
	}

	public void setPers(ArrayList<Personne> pers) {
		Pers = pers;
	}

	public void addPersonne(Personne P) {
		Pers.add(P);
	}

	public void suppPersonne(Personne P) {
		boolean tf=false;
		for(Personne S:Pers) {
			if(P.equals(S)) {
				Pers.remove(P);
				tf=true;
			}
		}
		if(tf==false) {
			System.err.println("Cette personne n'existe pas a la base donnees !");
		}
	}

	public void nbrPersonne() {
		Pers.size();
	}

	public void typePersonne(Personne P) {
		if (P instanceof Enseignant)
			System.out.println(" C'est un Enseignant");
		else if (P instanceof Administratif)
			System.out.println(" C'est un Administrateur");
		else if (P instanceof ContactExt)
			System.out.println(" C'est un Contact administrative");
	}

	public Personne afficherPersonne(String Nom,String Prenom) {
		boolean tf=false;
		for(Personne S:Pers) {
			if(S.nom.equals(Nom) && S.prenom.equals(Prenom)) {
				S.Afficher();
				tf=true;
				return S;
			}
		}
		if(tf==false) {
				System.err.println("La personne N'existe pas !");
			}
		return null;
		}
		

	public void afficherLesPersonne() {
		for (Personne P : Pers) {
			P.Afficher();
		}
	}

}
