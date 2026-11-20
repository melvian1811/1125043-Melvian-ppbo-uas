package uasppbo.model;

public class Lingkaran extends Object2D {
    
    private double jarijari;

    public Lingkaran(String label, double jarjari){
        super(label);
        this.jarijari = jarjari;
    }

    @Override
    public double hitungLuas(){
        return 3.14 * jarijari * jarijari;
    }

    @Override
    public double hitungKeliling(){
        return 2 * 3.14 * jarijari;
    }
}
