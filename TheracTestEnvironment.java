public class TheracTestEnvironment {
	public static void main(String[] args) {
		Therac therac = Therac.getInstance();
        

		System.out.println("Welcome to the Therac-25 test environment");
		System.out.println("Commands: lowerShield, fireLowBeam, raiseShield, fireHighBeam\n ________________________________\n");

		for (String command : args) {
            switch (command.toLowerCase()) {
				case "lowershield":
					therac.lowerShield();
					break;
				case "firelowbeam":
					therac.fireLowBeam();
					break;
				case "raiseshield":
					therac.raiseShield();
					break;
				case "firehighbeam":
					therac.fireHighBeam();
					break;
				default:
					System.out.println("Invalid command: " + command);
					break;
			}
        }
	}
}
