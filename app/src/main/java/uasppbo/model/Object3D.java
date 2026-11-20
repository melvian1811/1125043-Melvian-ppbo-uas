package uasppbo.model;

public abstract class Object3D extends GObject {
    
    public abstract double hitungLuasPermukaan();

    public abstract double hitungVolume();

    @Override 
    public String[][] getKeyValueDetails(){
        
    }
}
