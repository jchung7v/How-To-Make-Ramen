import HowToMakeRamen.Robot;
import HowToMakeRamen.Ramen;
import java.util.Scanner;

public class testDriver {
    
    public static void main(String[] args) {
        
        Robot robot = new Robot();

        String ramenName = "";
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Hi, Master. What Ramen do you want to eat today? (Shin, Neoguri, Jin): ");
            ramenName = scan.nextLine();
            if (ramenName.equalsIgnoreCase("Shin")) {
            } else if (ramenName.equalsIgnoreCase("Neoguri")) {
            } else if (ramenName.equalsIgnoreCase("Jin")) {
            } else {
                System.out.println("I am afraid that we don't have a Ramen you asked for.");
            }
            System.out.println("Of course. It'll be served shortly.");
        }
        ramen = RamenWorld.getRamen(ramenName);

        robot.setRamen(ramen);
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


    }
}
