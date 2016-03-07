import java.util.ArrayList;

public class CommandList extends Command {

    public void execute (DogRegistry dogRegistry) {

        System.out.print("Minimum tail length: ");
        float minTailLength = scanner.nextFloat();
        scanner.nextLine();

        ArrayList<Dog> dogs = dogRegistry.getDogs();

        for (Dog d : dogs) {
            float tail;
            if (d.getRace().equalsIgnoreCase("badger-dog")){
                tail = 3.7f;
            } else {
                tail = (d.getWeight() * d.getAge()) / 10f;
                }

            if (tail > minTailLength) {
                System.out.println(d + "" + tail);
            }
        }

    }
}
