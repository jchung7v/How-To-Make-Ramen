package HowToMakeRamen;
public class GasStove {
    
    private boolean onOff = false;

    public void turnOn() {
        onOff = true;
        System.out.println("Gas Stove is turned ON");
    }

    public void turnOff() {
        onOff = false;
        System.out.println("Gas Stove is turned OFF");
    }

    public boolean isOn() {
        if (onOff) {
            System.out.println("Confirmed that Gas Stove is ON");
        } else {
            System.out.println("Confirmed that Gas Stove is OFF");
        }
        return onOff;
    }

}
