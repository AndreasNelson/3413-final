public class TheracTestEnvironment {
	public static void main(String args[]) {
		// example of a proper procedure
		Therac therac = Therac.getInstance();
		therac.lowerShield(); // lower shield for low beam
		therac.fireLowBeam(); // fire low beam to scan for cancer
		therac.raiseShield(); // raise shield for high beam
		therac.fireHighBeam(); // fire high beam to treat cancer
		System.out.println("--------------------");

		// attempted misfire
		Therac therac2 = Therac.getInstance();
		therac.lowerShield(); // lower shield
		therac.fireHighBeam(); // fire the high beam without raising the shield

		// command line interface for end user
		for (String arg : args) {
			switch (arg) {
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
					System.out.println("Invalid command: " + arg);
					break;
			}
		}
	}
}
