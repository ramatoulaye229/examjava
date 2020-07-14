public abstract class Service implements iservice {

    protected int id;
    protected  String libelle;
    public Service(){

   }

   public Service(String libelle){
      this.libelle=libelle;
  }
  public int getId(){
   return id;
    }
  public void setId(int id){
   this.id=id;
   }

   
    @Override
    public String affiche(){
       return "Id: "+id+" libelle: "+libelle;
    }


}