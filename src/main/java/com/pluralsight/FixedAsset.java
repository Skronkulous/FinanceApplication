package com.pluralsight;

public abstract class FixedAsset implements Valuble {
    String name;
    double marketValue;

    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = Double.parseDouble(df.format(Double.toString(marketValue)));
    }

    public double getValue(){
        return 0;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }
}
