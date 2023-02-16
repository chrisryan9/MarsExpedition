import java.util.Scanner;

public class MarsExpedition {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Mars Expedition! System check initiated.");
        Thread.sleep(350);
        System.out.println(".....");
        Thread.sleep(350);
        System.out.println(".....");
        Thread.sleep(550);
        System.out.println("Initializing communication systems. Signal strength optimal.");
        Thread.sleep(350);
        System.out.println(".....");
        Thread.sleep(350);
        System.out.println(".....");
        Thread.sleep(550);
        System.out.println("Preparing landing sequence. Entering Mars' atmosphere.");
        Thread.sleep(350);
        System.out.println(".....");
        Thread.sleep(350);
        System.out.println(".....");
        Thread.sleep(550);
        System.out.println("Landing successful!");

        Thread.sleep(350);
        System.out.println("\nPlease enter name:");
        String name = input.nextLine();

        Thread.sleep(350);
        System.out.println("\nHi, " + name + "! Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        String responseStr = input.nextLine();
        char response = responseStr.charAt(0);

        if (response == 'Y' || response == 'y') {
            Thread.sleep(350);
            System.out.println("\nI knew you would say that. You are team leader for a reason!");
        } else if (response == 'N' || response == 'n') {
            Thread.sleep(350);
            System.out.println("\nToo bad... You are team leader. You have to go!");
        }

        Thread.sleep(350);

        int team = 0;
        while (team < 2 || team > 2) {
            System.out.println("\nHow many people do you want on your expedition team? -- Type an Integer");
            team = input.nextInt();
            input.nextLine();

            if (team > 2) {
                Thread.sleep(400);
                System.out.println("\nThat is way too many people. We can only send 2 more members.");
            } else if (team < 2) {
                Thread.sleep(400);
                System.out.println("\nThat's not enough people. We need you and 2 more members.");
            } else if (team == 2) {
                Thread.sleep(400);
                System.out.println("\nThat's a perfect sized team. Good job!");
            }
        }

        Thread.sleep(250);
        System.out.println("\nYou are allowed to bring one snack with you " + name + ". What do you want to bring?");

        String snack = input.nextLine();

        Thread.sleep(250);
        System.out.println("\nNice choice, " + snack + " are my favorite!");

        String vehicle = "";
        boolean validChoice = false;

        while (!validChoice) {
            System.out.println("\nYou have the choice of 3 vehicles"
                    + "\nA: CyberTruck"
                    + "\nB: Mars Rover"
                    + "\nC: Clyde the horse");

            String choice = input.nextLine();

            switch (choice.toUpperCase()) {
                case "A":
                    vehicle = "CyberTruck";
                    validChoice = true;
                    break;
                case "B":
                    vehicle = "Mars Rover";
                    validChoice = true;
                    break;
                case "C":
                    vehicle = "Clyde the horse";
                    validChoice = true;
                    break;
                default:
                    System.out.println("\nInvalid vehicle choice. Please choose A, B, or C.");
                    break;
            }
        }

        Thread.sleep(450);
        System.out.println("\nYour expedition is now ready! "
                + "\nLed by " + name + " along with " + team + " teammates. " + "You "
                + "will be exploring Mars using a " + vehicle + "."
                + "\nYour exploration mission begins now!"
                + "\nGood Luck!!");
    }
}
