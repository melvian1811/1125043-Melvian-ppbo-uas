package uasppbo.model;

public abstract class Object3D extends GObject {
    
    public Object3D(String label){
        super(label);
    }
    
    public abstract double hitungLuasPermukaan();

    public abstract double hitungVolume();

    @Override 
    public String[][] getKeyValueDetails(){
        return ["label"][getLabel()];
    }
}
