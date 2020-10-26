package sp1;

public class Benzinbil extends Bil{
    private int oktanTal;
    private double kmPrL;
    
    public Benzinbil(int årgang, int antalDøre, String regNr, String mærke, String model, int oktanTal, double kmPrL) {
        super(årgang, antalDøre, regNr, mærke, model);
        this.oktanTal = oktanTal;
        this.kmPrL = kmPrL;
    }
    
    public int getOktanTal() {
        return oktanTal;
    }
    public void setOktanTal(int oktanTal) {
        this.oktanTal = oktanTal;
    }
    public double getKmPrL() {
        return kmPrL;
    }
    public void setKmPrL(int kmPrL){
        this.kmPrL = kmPrL;
    }

    @Override
    public double beregnGrønEjerafgift() {
        if(kmPrL > 0 && kmPrL < 5) {
            return 10470;
        }
        else if(kmPrL < 10) {
            return 5500;
        }
        else if(kmPrL < 15) {
            return 2340;
        }
        else if(kmPrL < 20) {
            return 1050;
        }
        else if(kmPrL >= 20) {
            return 330;
        }
        else
            throw new IllegalArgumentException("kmPrL er ikke inden for given mængde");
    }
    
    @Override
    public String toString() {
        return "Benzin bilx: "
                + super.toString()
                + "\nDoors: " + getAntalDøre()
                + "\noktanTal: " + oktanTal
                + "\nkmPrL:" + kmPrL
                + "\nafgift: " + beregnGrønEjerafgift();
    }

    
}
