package HowToMakeRamen;

public class Robot {
    
    Pot pot = new Pot();
    Ramen ramen;
    GasStove gasStove = new GasStove();

    private boolean consumed = false;
    private boolean ready = false;

    public Robot(String ramenName) {
        if (ramenName.equals("shin")) {
            this.ramen = new ShinRamen();
        } else if (ramenName.equals("neoguri")) {
            this.ramen = new NeoGuRiRamen();
        } else if (ramenName.equals("jin")) {
            this.ramen = new JinRamen();
        }
    }

    public void addWater() {
        pot.addWater(ramen.getWaterAmountMl());
    }

    public void turnOnGasStove() {
        gasStove.turnOn();
    }

    public void addRamen() {
        pot.addRamen(ramen.getName());
    }

    public boolean isReady() {
        if (!ready) {
            System.out.println("Ramen is Ready");
            serveRamen();
        } else {
            System.out.println("Ramen is not ready yet");
        }
        return ready;
    }

    public void serveRamen() {
        consumed = true;
    }

    public boolean isConsumed() {
        if (consumed) {
            System.out.println("Ramen is consumed");
        } else {
            System.out.println("Ramen is not consumed");
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