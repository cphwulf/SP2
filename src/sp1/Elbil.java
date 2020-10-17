package sp1;

public class Elbil extends Bil {
    private final double DIVISION_FAKTOR = 91.25;
    private int batteriKapacitetKWh, maxKm, whPrKm;
    
    public Elbil(int årgang, int antalDøre, String regNr, String mærke, String model, int batteriKapacitetKWh, int maxKm, int whPrKm) {
        super(årgang, antalDøre, regNr, mærke, model);
        this.batteriKapacitetKWh = batteriKapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public int getBatteriKapacitetKWh() {
        return batteriKapacitetKWh;
    }
    public void setBatteriKapacitetKWh(int batteriKapacitetKWh) {
        this.batteriKapacitetKWh = batteriKapacitetKWh;
    }
    public int getMaxKm() {
        return maxKm;
    }
    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }
    public int getWhPrKm() {
        return whPrKm;
    }
    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }
    
    private double beregnKmPrL() {
        return 100.0 / (whPrKm / DIVISION_FAKTOR);
    }
    
    @Override
    public double beregnGrønEjerafgift() {
        double kmPrL = beregnKmPrL();
        
        // NOTE(Benjmain):  Ligesom i BenzinBil her har vi en del kode duplikation som nemt ville kunne undgås
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
        return "El bil: "
                + super.toString()
                + "\nbatteriKapacitetKWh: " + batteriKapacitetKWh
                + "\nmaxKm: " + maxKm
                + "\nwhPrKm: " +whPrKm
                + "\nafgift: " + beregnGrønEjerafgift();
    }

}
