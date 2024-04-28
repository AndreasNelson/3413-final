public class PresetTests {
    public static void main(String[] args) {
        Therac therac = Therac.getInstance();

        // Testing raising and lowering the shield
        // Other observers will get a second notification that the event has happened
        System.out.println(" --- Testing raising and lowering the shield with observer ---");
        therac.registerObserver(new TheracObserver());
        therac.lowerShield();
        therac.raiseShield();

        // Testing firing low beam with shield on, off
        // Other observers will get a second notification that the event has happened
        System.out.println(" --- Testing firing low beam with shield on with observer ---");
        therac.raiseShield();
        therac.fireLowBeam();

        // Testing firing high beam with shield on, off
        Therac therac2 = Therac.getInstance();

        System.out.println(" --- Testing firing high beam with shield on with observer ---");
        therac2.raiseShield();
        therac2.fireHighBeam();
        therac2.lowerShield();
        therac2.fireHighBeam();

        // Testing firing high beam more than 3 times
        Therac therac3 = Therac.getInstance();

        System.out.println(" --- Testing firing high beam more than 3 times with observer ---");
        therac3.raiseShield();
        therac3.fireHighBeam();
        therac3.fireHighBeam();
        therac3.fireHighBeam();
        therac3.fireHighBeam();
        


    }
}
