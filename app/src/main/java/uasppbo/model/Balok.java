package uasppbo.model;

public class Balok extends Object3D{
    
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(String label, double panjang, double lebar, double tinggi){
        super(label);
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuasPermukaan(){
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    @Override
    public double
}
