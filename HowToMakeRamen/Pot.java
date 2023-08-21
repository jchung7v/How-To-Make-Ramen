package HowToMakeRamen;

import HowToMakeRamen.Ramen;

public class Pot {
    
    private int waterAmountMl;
    private String ramenName;
    
    public void addWater(int waterAmountMl) {
        this.waterAmountMl = waterAmountMl;
        System.out.println("Water is added in the pot, " + waterAmountMl + "ml");
    }

    public void addRamen(String ramenName) {
        this.ramenName = ramenName;
        System.out.println(ramenName + " is added");
    }

    public void addDryFlake(Ramen ramen) {
        System.out.println("Ramen is added");
    }

}
