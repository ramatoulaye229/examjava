import java.time.LocalDate;
public class Embauché extends Employe {


    private int salaire;
    private int dateEmb;

    //Propriété navigationnelle
     private Service  serviceEmb;
   
           public Embauché(){
          }
          public Embauché(String nomComplet,LocalDate dateEmb,int salaire ){
             super(nomComplet);
             this.salaire=salaire;
             this.dateEmb=dateEmb;
          }
     public Service getService(){
        return this.serviceEmb;
     }

     public void setService(Service service){
           this.serviceEmb=service;
   }
    @Override
    public String affiche(){
       return super.affiche() +" Salaire :"+salaire+" Date d'embauche "+dateEmb;
    }

}