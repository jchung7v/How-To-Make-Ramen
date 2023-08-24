import HowToMakeRamen.Robot;
import HowToMakeRamen.Order;
import HowToMakeRamen.Ramen;
import java.io.IOException;

public class testDriver {
    
    public static void main(String[] args) {
        
        Order order = new Order();

        Boolean exit = true;

        while (exit) {
            order.sayHello();
            order.showRamenList();
            try {
                Ramen ramen = order.getOrder();
                Robot robot = new Robot();
                System.out.println("");
                robot.addWater(ramen.getWaterAmountMl());
                robot.turnOnGasStove();
                robot.addRamen(ramen);
                robot.isReady();
                robot.turnOffGasStove();
                robot.serveRamen();
                robot.isConsumed(ramen);
                
                if (robot.isGasStoveOn()) {
                    robot.turnOffGasStove();
                }
                System.out.println("");
                exit = false;
                
            } catch (IOException e) {
                System.out.println("Error: " + e);
                exit = false;
            }
        }
    }
}
