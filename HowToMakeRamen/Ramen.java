package HowToMakeRamen;

public interface Ramen {
    
    public String getRamenName();
    public int getWaterAmountMl();
    public int getSpicyLevel();
    public int getCookingTime();
    enum DryFlake { 
        VEGE, MEAT, MIXED 
    }
    public DryFlake getDryFlake();
}

