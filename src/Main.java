public class Main {
    public static void main(String[] args) {
        Etudiant etudiant =new Etudiant("hello","world","21/0047");
        etudiant.afficher();
        double moyenne =etudiant.calculerMoyenne();
        System.out.println("Votre moyenne est : "+moyenne);
    }
}