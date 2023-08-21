package HowToMakeRamen;

public class ShinRamen implements Ramen {
    
    private String ramenName = "ShinRamen";
    private int waterAmountMl = 400;
    private int spicyLevel = 5;
    private int cookingTimeMin = 3;
    private DryFlake flake = DryFlake.MEAT;

    @Override
    public String getRamenName() {
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
