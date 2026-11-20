package uasppbo.model;

public class Kerucut extends Object3D {
    
    private double jarijari;
    private double tinggi;

    public Kerucut(String label, double jarijari, double tinggi){
        super(label);
        this.jarijari = jarijari;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuasPermukaan(){
        return 3.14 * jarijari * (tinggi + jarijari);
    }

    @Override
    public double hitungVolume(){
        return 1/3 * 3.14 * jarijari * jarijari * tinggi;
    }
}
