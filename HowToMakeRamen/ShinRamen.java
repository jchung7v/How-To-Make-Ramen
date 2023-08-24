package HowToMakeRamen;

public class ShinRamen extends Ramen {
    
    private String ramenName = "ShinRamen";
    private int waterAmountMl = 400;

    @Override
    public String getName() {
        return ramenName;
    }

    @Override
    public int getWaterAmountMl() {
        return waterAmountMl;
    }
}
