package sp1;

public abstract class Bil {
    private int årgang, antalDøre;
    private String regNr, mærke, model;
    
    public Bil(int årgang, int antalDøre, String regNr, String mærke, String model) {
        this.årgang = årgang;
        this.antalDøre = antalDøre;
        this.regNr = regNr;
        this.mærke = mærke;
        this.model = model;   
    }
    
    public abstract double beregnGrønEjerafgift();
    
    public void setÅrgang(int årgang) {
        this.årgang = årgang;
    }
    public int getÅrgang() {
        return årgang;
    }
    public void setAntalDøre(int antalDøre) {
        this.antalDøre = antalDøre; 
    }
    public int getAntalDøre() {
        return antalDøre;
    }
    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }
    public String getRegNr() {
        return regNr;
    }
    public void setMærke(String mærke) {
        this.mærke = mærke;
    }
    public String getMærke() {
        return mærke;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model; 
    }
    
    @Override
    public String toString() {
        return "årgang: " + årgang + ", antaldøre: " + antalDøre + ", regNr: " + regNr + ", mærke: " + mærke + ", model: " + model;
    }
    
}
