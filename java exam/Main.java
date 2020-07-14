import java.time.LocalDate;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    
String choix;
     Scanner clavier=new Scanner(System.in);
     Fonction service =new Fonction();
    do {

        System.out.println("1-ajouter service");
        System.out.println("2-lister les services ");
        System.out.println("3-ajouter un employé");
        System.out.println("4-lister les journaliers ");
        System.out.println("5-lister les embauchées d'un service ");
        System.out.println("6-quitter ");
        System.out.println("Faites votre choix");
        choix=clavier.nextLine();
        switch(choix){
            case "1":
             System.out.println("Entrer le libelle");
             String libelle =clavier.nextLine();
            System.out.println("Saisir l'ID du service");
             int idService=clavier.nextInt();
            break;

            case "2":

            fonction.listerService();
            break;

            case "3":
            System.out.println("Entrer le Nom Complet");
            String nomComplet =clavier.nextLine();
            System.out.println("Saisir l'ID de l'employe");
            int idEmploye=clavier.nextInt();

            break;

            case "4":
            fonction.listerJournalier();
            break;
             case "5":
            fonction.listerEmbauche();
            break;

        }
        
    } while (choix!="5");

        
}
    
}