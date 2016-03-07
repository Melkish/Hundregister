
public class CommandRemove extends Command {

    public void execute (DogRegistry dogRegistry) {

        System.out.print("Which dog would you like to remove from the registry? ");
        String name = scanner.nextLine();

        Dog dog = dogRegistry.getDogByName(name);

        dogRegistry.removeDog(dog);

        System.out.println("The dog " + name + " has been removed.");

    }
}
