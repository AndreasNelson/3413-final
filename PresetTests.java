public class PresetTests {
    public static void main(String[] args) {
        Therac therac = Therac.getInstance();

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

    }
}
