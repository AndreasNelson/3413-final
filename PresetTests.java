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
        therac2.reset();
        therac2.registerObserver(new TheracObserver());

        System.out.println(" --- Testing firing high beam with shield on with observer ---");
        therac2.raiseShield();
        therac2.fireHighBeam();
        therac2.lowerShield();
        therac2.fireHighBeam();

        // Testing firing high beam more than 3 times
        Therac therac3 = Therac.getInstance();
        therac3.reset();
        therac3.registerObserver(new TheracObserver());

        System.out.println(" --- Testing firing high beam more than 3 times with observer ---");
        therac3.raiseShield();
        therac3.fireHighBeam();
        therac3.fireHighBeam();
        therac3.fireHighBeam();
        therac3.fireHighBeam();
        
        // Testing firing low beam more than 3 times
        Therac therac5 = Therac.getInstance();
        therac5.reset();
        therac5.registerObserver(new TheracObserver());

        System.out.println(" --- Testing firing low beam more than 3 times with observer ---");
        therac5.lowerShield();
        therac5.fireLowBeam();
        therac5.fireLowBeam();
        therac5.fireLowBeam();
        therac5.fireLowBeam();

        // Testing can not fire low, high beam when shield is down
        Therac therac4 = Therac.getInstance();
        therac4.reset();
        therac4.registerObserver(new TheracObserver());

        System.out.println(" --- Testing firing low, high beam with shield off with observer ---");
        therac4.lowerShield();
        therac4.fireLowBeam();
        therac4.fireHighBeam();

        // Testing firing low beam more than 3 times with high beam 1 time
        Therac therac6 = Therac.getInstance();
        therac6.reset();
        therac6.registerObserver(new TheracObserver());

        System.out.println(" --- Testing firing low beam more than 3 times with high beam 1 time with observer ---");
        therac6.lowerShield(); 
        therac6.fireLowBeam();
        therac6.fireLowBeam();
        therac6.fireLowBeam();
        therac6.raiseShield();
        therac6.fireHighBeam();
        therac6.fireHighBeam();
        therac6.fireHighBeam();
        therac6.fireHighBeam();
    }
}
