
public class CommandRegister extends Command {

    public void execute (DogRegistry dogRegistry) {

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Race: ");
        String race = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Weight: ");
        int weight = scanner.nextInt();
        scanner.nextLine();

        Dog dog = new Dog(name, race, age, weight);

        dogRegistry.addDog(dog);
    }
}
