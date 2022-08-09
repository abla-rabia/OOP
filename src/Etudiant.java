public class Etudiant {
    private String nom;
    private String prenom;
    private String matricule;
    private double mod1;
    private double mod2;
    private double mod3;

    //Le constructeur
    public  Etudiant (String nom,String prenom,String matricule,double mod1,double mod2 , double mod3){
        this.nom=nom;
        this.prenom=prenom;
        this.matricule=matricule;
        this.mod1=mod1;
        this.mod2=mod2;
        this.mod3=mod3;
    }
    //Afficher les valeurs des attributs
    public void afficher(){
        System.out.println("Nom : "+nom);
        System.out.println("Prenom : "+prenom);
        System.out.println("Matricule : "+matricule);
        System.out.println("Moyenne du module 1 : "+mod1);
        System.out.println("Moyenne du module 2 : "+mod2);
        System.out.println("Moyenne du module 3 : "+mod3);
    }
    //Le module qui calcule la moyenne :
    public double calculerMoyenne(){
        return ((mod1+mod2+mod3)/3);
    }
}
