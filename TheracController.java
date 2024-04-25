public class TheracController {
	public static void main(String args[]) {
		// example of procedure
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
		
	}
}
