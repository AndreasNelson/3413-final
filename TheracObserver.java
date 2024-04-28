public class TheracObserver implements Observer {
    private int highBeamCount = 0;
    private int lowBeamCount = 0;
    private boolean safe = true;

    public void update(String event) {
        switch (event) {
            case "high intensity beam fired":
                highBeamCount++;
                break;
            case "low intensity beam fired":
                lowBeamCount++;
                break;
            case "high intensity beam fired more than 3 times":
            case "low intensity beam fired more than 3 times":
                safe = false;
                break;
            default:
                System.out.println(event);
        }

        if (!safe) {
            System.out.println("The system is not safe. High intensity beam fired: " + highBeamCount + " times. Low intensity beam fired: " + lowBeamCount + " times.");
        }
    }
}