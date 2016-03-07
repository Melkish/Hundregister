import java.util.Scanner;


public class Command {

    public static Scanner scanner = new Scanner(System.in);

    public static Command getCommand(DogRegistry dogRegistry) {
        System.out.print("Command: ");
        String commandString = scanner.nextLine();

        if (commandString.equalsIgnoreCase("register")) {
            return new CommandRegister();
        } else if (commandString.equalsIgnoreCase("list")) {
            return new CommandList();
        } else if (commandString.equalsIgnoreCase("remove")) {
            return new CommandRemove();
        } else
            return new CommandUnknown();
    }

    public void execute(DogRegistry dogRegistry) {

    }
}
