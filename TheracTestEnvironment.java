import java.beans.Transient;
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

		// Testing raising and lowering the shield
		// Other observers will get a second notification that the event have happened
		System.out.println(" --- Testing raising and lowering the shield with observer ---");
		therac.registerObserver(new TheracObserver());
		therac.lowerShield();
		therac.raiseShield();

		// Testing firing low beam with shield on, off
		// Other observers will get a second notification that the event have happened
		System.out.println(" --- Testing firing low beam with shield on with observer ---");
		therac.raiseShield();
		therac.fireLowBeam();
		
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(therac);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
