package HowToMakeRamen;

public class JinRamen extends Ramen {
    
    private String ramenName = "JinRamen";
    private int waterAmountMl = 450;

    @Override
    public String getName() {
        return ramenName;
    }

    @Override
    public int getWaterAmountMl() {
        return waterAmountMl;
    }
}