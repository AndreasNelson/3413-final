import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class TheracTestEnvironment {
	public static void main(String[] args) {
		Therac therac;
        File file = new File("therac.ser");

        // Deserialize the Therac instance from the file if it exists
        if (file.exists()) {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
                therac = (Therac) in.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                return;
            }
        } else {
            therac = Therac.getInstance();
        }

		System.out.println("Welcome to the Therac-25 test environment");
		System.out.println("Commands: lowerShield, fireLowBeam, raiseShield, fireHighBeam\n ________________________________");

		// Process command line arguments
		for (String command : args) {
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

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(therac);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
