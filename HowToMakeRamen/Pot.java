package HowToMakeRamen;

public class Pot {
    
    private int waterAmountMl;
    private String ramenName;
    
    public void addWater(int defaultWaterAmountMl) {
        this.waterAmountMl = defaultWaterAmountMl;
        System.out.println("Water is added in the pot, " + waterAmountMl + "ml");
    }

    public void addRamen(String defaultRamenName) {
        this.ramenName = defaultRamenName;
        System.out.println(ramenName + " is added");
    }

    public void addDryFlake(Ramen ramen) {
        System.out.println("Ramen is added");
    }

}
