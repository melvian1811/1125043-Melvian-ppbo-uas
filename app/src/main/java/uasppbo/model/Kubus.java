package uasppbo.model;

public class Kubus extends Object3D {
    
    private double sisi;

    public Kubus(String label, double sisi){
        super(label);
        this.sisi = sisi;
    }

    @Override
    public double hitungLuasPermukaan(){
        return 6 * sisi * sisi;
    }

    @Override
    public double hitungVolume(){
        return sisi * sisi * sisi;
    }
}
