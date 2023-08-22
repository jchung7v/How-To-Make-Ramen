import HowToMakeRamen.Robot;
import java.util.Scanner;

public class testDriver {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String ramenName = "";
        
        while (true) {
            System.out.print("Hi, Master. What Ramen do you want to eat today? (Shin, Neoguri, Jin): ");
            ramenName = scan.nextLine().toLowerCase();
            if (ramenName.equals("shin") || ramenName.equals("neoguri") || ramenName.equals("jin")) {
                System.out.println("Of course. " + ramenName + " Ramen will be served shortly.");
                break;
            } else {
                System.out.println("I am afraid that we don't have a Ramen you asked for.");
                continue;
            }
        }

        Robot robot = new Robot(ramenName);

        robot.addWater();
        robot.turnOnGasStove();
        robot.addRamen();
        robot.isReady();
        robot.turnOffGasStove();
        robot.serveRamen();
        robot.isConsumed();
        
        if (robot.isGasStoveOn()) {
            robot.turnOffGasStove();
        }
        scan.close();
    }
}
