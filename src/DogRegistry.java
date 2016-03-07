import java.util.ArrayList;

public class DogRegistry {

    private ArrayList<Dog> dogs = new ArrayList<Dog>();

    public static void main(String[] args) {

        DogRegistry dogRegistry = new DogRegistry();
        dogRegistry.theCommandLoop();
    }

    private void theCommandLoop() {

        Command command = Command.getCommand(this);
        while (!(command instanceof CommandQuit)) {
            System.out.println("");
            command.execute(this);
            command = Command.getCommand(this);
        }
        System.out.print("Bye");
    }

    public void addDog(Dog dog) {
        this.dogs.add(dog);
    }

    public Dog getDogByName(String name) {
        for (Dog d : dogs) {
            if (d.getName().equalsIgnoreCase(name)){
                return d;
            }
        }
        return null;
    }

    public void removeDog(Dog dog) {
        this.dogs.remove(dog);
    }

    public ArrayList<Dog> getDogs(){
        return dogs;
    }
}
