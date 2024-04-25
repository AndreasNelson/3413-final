public class TheracController {
	public static void main(String args[]) {
		Therac therac = Therac.getInstance();
		therac.lowerShield();
		therac.fireLowBeam();
		therac.raiseShield();
		therac.fireHighBeam();
		therac.lowerShield();
	}
}
