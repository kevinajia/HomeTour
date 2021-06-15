package fixtures;

public abstract class Fixture {
	public Fixture(String n, String sd, String ld){
        this.setName(n);
        this.setShortDescription(sd);
        this.setLongDescrition(ld);
    }
    
    private String name;
    private String shortDescription;
    private String longDescription;
    
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }
    
    public void setShortDescription(String sd){
        this.shortDescription = sd;
    }
    public String getShortDescription(){
        return this.shortDescription;
    }
    
    public void setLongDescrition(String ld){
        this.longDescription = ld;
    }
    public String getLongDescription(){
        return this.longDescription;
    }
}
