public abstract class Employe implements iservice {

     protected int id;
     protected  String nomComplet;
     public Employe(){

    }

    public Employe(String nomComplet){
       this.nomComplet=nomComplet;
   }
   public int getId(){
    return id;
     }
   public void setId(int id){
    this.id=id;
    }

    
     @Override
     public String affiche(){
        return "Id: "+id+" Nom et Prenom : "+nomComplet;
     }
 
 
 }