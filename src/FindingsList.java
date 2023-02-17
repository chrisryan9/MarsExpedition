import java.util.*;

public class FindingsList {
    private String name;
    public FindingsList(String name) throws InterruptedException{
        this.name = name;

        Thread.sleep(8000);

        System.out.println("\nWelcome back " + name + "!");

        ArrayList<String> rocks = new ArrayList<>();

        System.out.println("\nList of rocks has been downloaded.");

        rocks.add("rock");
        rocks.add("weird rock");
        rocks.add("smooth rock");
        rocks.add("not rock");

        System.out.println(rocks);

        Thread.sleep(5000);

        HashMap<String, String> fossils = new HashMap<>();

        System.out.println("\nFossil data downloaded!");

        fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossils.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("\nPlease type which fossil you would like to learn more about? (Bird, Fish, Tooth)");

        Scanner input = new Scanner(System.in);

        String fossilChoice = input.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossils.get("Bird Fossil"));
        } else if (fossilChoice.equalsIgnoreCase("Fish")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossils.get("Fish Fossil"));
        } else if (fossilChoice.equalsIgnoreCase("Tooth")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossils.get("Tooth Fossil"));
        }

        Thread.sleep(2000);

        HashSet<String> supplies = new HashSet<>();

        supplies.add("Crackers");
        supplies.add("Flashlight");
        supplies.add("Doritos");

        supplies.remove("Doritos");

        System.out.println("\nHere are the supplies you returned with.");

        Iterator it = supplies.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Congratulations on a successful mission!");

    }
}
