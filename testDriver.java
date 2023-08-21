import HowToMakeRamen.Robot;
import HowToMakeRamen.RamenWorld;
import HowToMakeRamen.Ramen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class testDriver {
    
    public static void main(String[] args) {
        
        Robot robot = new Robot();
        Ramen ramen;

        String ramenName = "";
        String[] strArray = {"Shin", "NeoGuRi", "Jin"};
        ArrayList<String> RamenList = new ArrayList<>(Arrays.asList(strArray));
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Hi, Master. What Ramen do you want to eat today? (Shin, NeoGuRi, Jin): ");
            ramenName = scan.nextLine();
            if (RamenList.contains(ramenName)) {
                System.out.println("Of course. It'll be served shortly.");
                break;
            } else {
                System.out.println("I am afraid that we don't have a Ramen you asked for.");
            }
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
