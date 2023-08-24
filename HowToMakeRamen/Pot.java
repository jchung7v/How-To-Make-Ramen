package HowToMakeRamen;

public class Pot {
    
    Ramen ramen;
    private int waterAmountMl;
    
    public void addWater(int defaultWaterAmountMl) {
        this.waterAmountMl = defaultWaterAmountMl;
        System.out.println("Water is added in the pot, " + waterAmountMl + "ml");
    }

    public void addRamen(Ramen ramen) {
        this.ramen = ramen;
        System.out.println(ramen.getName() + " is added");
        ramen.cook();
    }

    public boolean isReady() {
        return ramen.isReady();

    }

}
