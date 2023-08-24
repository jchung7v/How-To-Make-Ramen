package HowToMakeRamen;

public class Robot {
    
    Pot pot = new Pot();
    GasStove gasStove = new GasStove();

    private boolean consumed = false;

    public void addWater(int defaultWaterAmountMl) {
        pot.addWater(defaultWaterAmountMl);
    }

    public void turnOnGasStove() {
        gasStove.turnOn();
    }

    public void addRamen(Ramen ramen) {
        pot.addRamen(ramen);
    }

    public boolean isReady() {
        return pot.isReady();
    }

    public void serveRamen() {
        consumed = true;
    }

    public boolean isConsumed(Ramen ramen) {
        if (consumed) {
            System.out.println(ramen.getName() + " is consumed");
        } else {
            System.out.println(ramen.getName() + " is not consumed");
        }
        return consumed;
    }

    public void turnOffGasStove() {
        gasStove.turnOff();
    }

    public boolean isGasStoveOn() {
        return gasStove.isOn();
    }

}