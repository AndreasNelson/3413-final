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
		Therac therac = Therac.getInstance();
        

		System.out.println("Welcome to the Therac-25 test environment");
		System.out.println("Commands: lowerShield, fireLowBeam, raiseShield, fireHighBeam\n ________________________________");

		for (String command : args) {
            // Deserialize the Therac instance from the file if it exists
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
	}
}
