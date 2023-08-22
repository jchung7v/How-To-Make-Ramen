package HowToMakeRamen;

public class NeoGuRiRamen implements Ramen {
    
    private String ramenName = "NeoGuRiRamen";
    private int waterAmountMl = 500;
    private int spicyLevel = 3;
    private int cookingTimeMin = 4;
    private DryFlake flake = DryFlake.VEGE;

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
