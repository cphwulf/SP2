package sp1;

import java.util.ArrayList;

public class Garage {
    private String navn;
    private ArrayList<Bil> biler;
    
    public Garage(String navn) {
        this.navn = navn;
        biler = new ArrayList<>();
    }

    public double beregnGrønAfgiftForBilpark() {
        double afgiftSum = 0;
        for (Bil bil : biler) {
            afgiftSum += bil.beregnGrønEjerafgift();
        }
        return afgiftSum;
    }
    
    public void tilføjBil(Bil bil) {
        biler.add(bil);
    }
    
    public String getNavn() {
        return navn;
    }
    public void setNavn(String navn) {
        this.navn = navn;
    }    
    
    @Override
    public String toString() {
        // StringBuilder er et bedre valg en at lave string-concatenation i en løkke.
        // String er immutable og skal derfor genskabes hvergang der sker en string-concatenation.
        // Det problem har vi ikke med StringBuilder.
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("Biler i ").append(navn).append(":").append("\n");
        for (Bil bil : biler) {
            strBuilder.append(bil).append("\n\n");
        }
        return strBuilder.toString();
    }
}
