/**
 *
 * @author roudet
 */
 
public class Orange {
    private double prix;
    private String origine;
	
    public Orange() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Orange(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Orange de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Orange or = (Orange) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
        Orange o = new Orange();
        System.out.println("premier test Orange");
        double prix = o.getPrix();
        String origine = o.getOrigine();
        if(prix==0.5)
            System.out.println("getPrix OK");
        else
            System.out.println("getPrix FALSE");
        
        if(origine.equals("Espagne"))
            System.out.println("getOrigine OK");
        else
            System.out.println("getOrigine FALSE");
        
        o.setPrix(1.5);
        prix = o.getPrix();
        if(prix==1.5)
            System.out.println("setPrix OK");
        else
            System.out.println("setPrix FALSE");
        
        o.setOrigine("Maroc");
        origine = o.getOrigine();
        if(origine.equals("Maroc"))
            System.out.println("setOrigine OK");
        else
            System.out.println("setOrigine FALSE");
        
        String desc = o.toString();
        if(desc.equals("Orange de Maroc a 1.5 euros"))
            System.out.println("toString OK");
        else
            System.out.println("toString FALSE");    
   }
}
