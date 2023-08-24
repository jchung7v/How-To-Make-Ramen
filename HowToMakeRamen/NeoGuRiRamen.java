package HowToMakeRamen;

public class NeoGuRiRamen extends Ramen {
    
    private String ramenName = "NeoGuRiRamen";
    private int waterAmountMl = 500;

    @Override
    public String getName() {
        return ramenName;
    }

    @Override
    public int getWaterAmountMl() {
        return waterAmountMl;
    }
}
