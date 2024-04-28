public class TheracTestEnvironment {
	public static void main(String[] args) {
		Therac therac = Therac.getInstance();
        

		System.out.println("Welcome to the Therac-25 test environment");
		System.out.println("Commands: lowerShield, fireLowBeam, raiseShield, fireHighBeam\n ________________________________\n");

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
