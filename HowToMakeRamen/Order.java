package HowToMakeRamen;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

import HowToMakeRamen.ShinRamen;
import HowToMakeRamen.NeoGuRiRamen;
import HowToMakeRamen.JinRamen;
import HowToMakeRamen.Ramen;

public class Order {

    private ArrayList<Ramen> ramenList;
    
    public Order() {
        ramenList = new ArrayList<Ramen>();
        ramenList.add(new ShinRamen());
        ramenList.add(new NeoGuRiRamen());
        ramenList.add(new JinRamen());
    }

    public void sayHello() {
        System.out.println("Hi, Master. What Ramen do you want to eat today?");
    }

    public void showRamenList() {
        for(Ramen ramen:ramenList) {
            System.out.print(ramen.getName() + " ");
        }
    }

    public Ramen getOrder() throws IOException {
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        String ramenName = scan.nextLine().toLowerCase();

        if (ramenName.equals("shinramen")) {
            return new ShinRamen();
        } else if (ramenName.equals("neoguriramen")) {
            return new NeoGuRiRamen();
        } else if (ramenName.equals("jinramen")) {
            return new JinRamen();
        } else {
            System.out.println();
            throw new IOException("I am afraid that we don't have the ramen you requested.");
        }


    }
}
