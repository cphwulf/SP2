package sp1;

import java.util.List;

public class EnvTax {
    List<Integer> prices;
    List<Integer> addprices;
    List<Integer> limits;
    boolean filter;

    public EnvTax(List<Integer> prices, List<Integer> addprices,  List<Integer> limits, boolean filter) {
        this.prices = prices;
        this.addprices = addprices;
        this.limits = limits;
        this.filter = filter;
    }

    public List<Integer> getPrices() {
        return prices;
    }

    public List<Integer> getAddprices() {
        return addprices;
    }

    public List<Integer> getLimits() {
        return limits;
    }

    public boolean isFilter() {
        return filter;
    }
}
