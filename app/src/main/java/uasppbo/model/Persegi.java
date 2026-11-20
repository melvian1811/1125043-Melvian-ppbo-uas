package uasppbo.model;

public class Persegi extends Object2D  {
    
    private double sisi;

    public Persegi(String label, double sisi){
        super(label);
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas(){
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling(){
        return sisi * sisi * sisi;
    }
}
