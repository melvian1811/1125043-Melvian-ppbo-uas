package uasppbo.model;

public class SegiEmpat extends Object2D{
    
    private double panjang;
    private double lebar;

    public SegiEmpat(String label, double panjang, double lebar){
        super(label);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungKeliling(){
        return 2 * (panjang + lebar);
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }
}
