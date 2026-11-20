package uasppbo.model;

public abstract class GObject {
    
    private String label;
    

    public String getLabel(){
        return label;
    }

    public void setLabel(String label){
        this.label = label;
    }

    public GObject(String label){
        this.label = label;
    }


    public abstract String[][] getKeyValueDetails();
}
