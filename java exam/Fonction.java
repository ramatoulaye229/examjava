public class Fonction {

      final int TAILLE=10;
      private int nbreService=0;
      private int nbreEmploye=0;
      private Service tabService[];
      private Employe [] tabEmploye;

    public Fonction(){
        tabService=new Service[TAILLE];
        tabEmploye=new Employe[TAILLE];

    }

    public void  ajouterService(Service serv){
          tabService[nbreService]=serv;
           nbreService++;

    }

    public void listerService(){
        for(int i=0;i<nbreService;i++){
            System.out.println(tabService[i].affiche());
        }
        
    }

    
    public void  ajouterPersonne(Employe emp){
          tabEmploye[nbreEmploye]=emp;
           nbreEmploye++;

    }

    public void listerEmbauche(Employe employe){
        for(int i=0;i<nbreEmploye;i++){
            if(tabEmploye[i] instanceof Embauché){
                   if(((Embauché)tabEmploye[i]).getService().getId()==employe.getId()){
                       System.out.println(tabEmploye[i].affiche());
                   }
            }
           
        }
        
    }
    public void listerJournalier(Employe employe){
        for(int i=0;i<nbreEmploye;i++){
            if(tabEmploye[i] instanceof Journalier){
                   if(((Embauché)tabEmploye[i]).getService().getId()==employe.getId()){
                       System.out.println(tabEmploye[i].affiche());
                   }
            }
           
        }
        
    }

    


    
}