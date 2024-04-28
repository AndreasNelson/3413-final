public class TheracObserver implements Observer {
    @Override
    public void update(String event) {
        System.out.println("Observers has been notified that " + event + " event has occurred!");
    }
}