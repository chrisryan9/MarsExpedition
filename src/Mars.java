import java.util.Scanner;

public class Mars {
    public static void main(String[] args) {
        String colonyName = "mahogany";
        int shipPopulation = 300;
        double meals = 4_000.00;
        boolean landing = true;

        meals -= (shipPopulation * 0.75);
        System.out.println(meals);
        meals += (meals *.5);
        System.out.println(meals);
        shipPopulation += 5;
        System.out.println(shipPopulation);


        String landingLocation = "The Plain";
        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzzz landing on The Plain");
        } else {
            System.out.println("ERROR!! Flight plan already set. Landing on the Plain");
        }

        try {
            landingCheck(10);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static boolean landingCheck(int minutesLeft) throws InterruptedException{
        for (int minute = 0; minute <= minutesLeft; minute++) {
            if ((minute % 2) == 0 && (minute % 3) ==0) {
                System.out.println("Keep Center!");
            } else if ((minute % 2) == 0) {
                System.out.println("Right");
            } else if ((minute % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }

            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }

}


