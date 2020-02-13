package heritage_Abstract;

import java.util.Scanner;

public class Application_Test {

	public static void main(String[] args) {
		Scanner Src = new Scanner(System.in);
		ServiceRH SRH = new ServiceRH("EHEI");
		
		
		Enseignant E1 = new Enseignant("Youssfi", "Med", 32,Contract.CDI,Grade.MAA); 
		Enseignant E2 = new Enseignant("Mirali", "Mouhi", 30,Contract.CDI,Grade.MCA); 
		Enseignant E3 = new Enseignant("Garziad", "Sara", 18,Contract.CDD,Grade.MAB);
		
		Administratif A1 = new Administratif("Hichem", "Modo",28,Contract.CDD,Poste.SECURITE);
		Administratif A2 = new Administratif("Maryem", "Modo",21,Contract.CDD,Poste.MAINTENACE);
		Administratif A3 = new Administratif("Manal", "Modo",22,Contract.CDD,Poste.LOGISTIQUE);
		
		ContactExt C1 = new ContactExt("Yaya", "Bebe", 25, TypeContact.SALARIE);
		ContactExt C2 = new ContactExt("Momo", "Sosee", 27, TypeContact.CHEF);
		ContactExt C3 = new ContactExt("Yito", "Keeeko", 20, TypeContact.SALARIE);
		
		SRH.addPersonne(E1);
		SRH.addPersonne(E2);
		SRH.addPersonne(E3);
		SRH.addPersonne(A1);
		SRH.addPersonne(A2);
		SRH.addPersonne(A3);
		SRH.addPersonne(C1);
		SRH.addPersonne(C2);
		SRH.addPersonne(C3);
		String p1,p2;
		System.out.println("Entrer le Nom que vous Cherchier :");
		p1=Src.nextLine();
		p2=Src.nextLine();
		SRH.afficherPersonne(p1,p2);
		Src.close();
	}

}
