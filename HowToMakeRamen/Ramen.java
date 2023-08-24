package HowToMakeRamen;

public abstract class Ramen {

    private boolean ready = false;
    
    public abstract String getName();
    public abstract int getWaterAmountMl();
    public void cook() {
        ready = true;
    }
    public boolean isReady() {
        return ready;
    }
}

