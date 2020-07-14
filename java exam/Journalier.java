public class Journalier extends Employe {


    private int forfait;
    private int duree;

   
           public Journalier(){
          }
          public Journalier(String nomComplet,int duree, int forfait){
             super(nomComplet);
             this.forfait=forfait;
             this.duree=duree;
          }
   
    @Override
    public String affiche(){
       return super.affiche() +" forfait:"+forfait+" Duree  "+duree;
    }
    
}