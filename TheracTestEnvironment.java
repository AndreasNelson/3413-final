import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TheracTestEnvironment {
	public static void main(String[] args) {
    Therac therac = Therac.getInstance();
	System.out.println("Welcome to the Therac-25 test environment!\n Commands: lowerShield, fireLowBeam, raiseShield, fireHighBeam\n");
    // Read commands from a file
    try {
        List<String> commands = Files.readAllLines(Paths.get("commands.txt"));
        for (String command : commands) {
            switch (command) {
                case "lowerShield":
                    therac.lowerShield();
                    break;
                case "fireLowBeam":
                    therac.fireLowBeam();
                    break;
                case "raiseShield":
                    therac.raiseShield();
                    break;
                case "fireHighBeam":
                    therac.fireHighBeam();
                    break;
                default:
                    System.out.println("Invalid command: " + command);
                    break;
            }
        }
    } catch (IOException e) {
        System.out.println("Error reading commands file: " + e.getMessage());
    }
}
}
