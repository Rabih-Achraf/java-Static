
public class Employer {

	private double salaire;
	private String nom;
	private String prenom;
	public static String nationalite="Maroc";
	
	// GET SET
	
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
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
	
	
	// constricteure
	
	public Employer(double salaire, String nom, String prenom) {
		super();
		this.salaire = salaire;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Employer() {
		// TODO Auto-generated constructor stub
	}
	
	public void afficherSalaire() {
		System.out.println("salaire " + salaire +"nom " + nom + " prenom " + prenom);
	} 
	
	public void afficherNationalite() {
		System.out.println("nationalite " + nationalite );
	} 

	
	 
	
}
