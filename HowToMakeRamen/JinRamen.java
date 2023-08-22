package HowToMakeRamen;

public class JinRamen implements Ramen {
    
    private String ramenName = "JinRamen";
    private int waterAmountMl = 450;
    private int spicyLevel = 4;
    private int cookingTimeMin = 3;
    private DryFlake flake = DryFlake.MIXED;

    @Override
    public String getName() {
        return ramenName;
    }

    @Override
    public int getWaterAmountMl() {
        return waterAmountMl;
    }

    @Override
    public int getSpicyLevel() {
        return spicyLevel;
    }

    @Override
    public int getCookingTime() {
        return cookingTimeMin;
    }

    @Override
    public DryFlake getDryFlake() {
        return flake;
    }
}