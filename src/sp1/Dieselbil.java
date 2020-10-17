package sp1;

public class Dieselbil extends Bil{
    private boolean harPartikelFilter;
    private double kmPrL;
    
    public Dieselbil(int årgang, int antalDøre, String regNr, String mærke, String model, boolean harPartikelFilter, double kmPrL) {
        super(årgang, antalDøre, regNr, mærke, model);
        this.harPartikelFilter = harPartikelFilter;
        this.kmPrL = kmPrL;
    }
    
    public boolean harPartikelFilter() {
        return harPartikelFilter;
    }
    public void setHarPartikelFilter(boolean harPartikelFilter) {
        this.harPartikelFilter = harPartikelFilter;
    }
    public double getKmPrL() {
        return kmPrL;
    }
    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }
    
    @Override
    public double beregnGrønEjerafgift() {
        // Hvis bilen har partikel filter, er afgiften 0, ellers er afgiften 1000.0
        double partikelUdledningsAfgift = harPartikelFilter ? 0.0 : 1000.0;
        
        double afgift = 0.0;
        // NOTE(Benjmain): Igen har vi noget kode duplikation, dette ville også kunne undgås.
        if(kmPrL > 0 && kmPrL < 5) {
            afgift = 10470 + 15260;
        }
        else if(kmPrL < 10) {
            afgift = 5500 + 2770;
        }
        else if(kmPrL < 15) {
            afgift = 2340 + 1850;
        }
        else if(kmPrL < 20) {
            afgift = 1050 + 1390;
        }
        else if(kmPrL >= 20) {
            afgift = 330 + 130;
        }
        else
            throw new IllegalArgumentException("kmPrL er ikke inden for given mængde");
        
        return afgift + partikelUdledningsAfgift;
    }
    
    @Override
    public String toString() {
        return "Diesel bil: "
                + super.toString()
                + "\nharPartikelFilter: " + harPartikelFilter
                + "\nkmPrL: " + kmPrL
                + "\nafgift: " + beregnGrønEjerafgift();
    }

}
