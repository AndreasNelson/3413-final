import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public enum Therac implements Subject, Observer {
	UNIQUE_INSTANCE;

	private boolean shielded;
    private boolean safe;
    private int lowBeamCount;
    private int highBeamCount;
    private List<Observer> observers = new ArrayList<>();

	private Therac() {
        shielded = true;
        safe = true;
        lowBeamCount = 0;
        highBeamCount = 0;
    }

	public static Therac getInstance() {
		return UNIQUE_INSTANCE;
	}

	public boolean isShielded() {
		return shielded;
	}

	public boolean isSafe() {
		return safe;
	}
    
    public void reset() {
        shielded = true;
        safe = true;
        lowBeamCount = 0;
        highBeamCount = 0;
        observers.clear();
    }

    public void fireLowBeam() {
        if (!isSafe()) {
            System.out.println("Can't fire the low intensity beam when the patient is not safe");
            notifyObservers("fail to fire low intensity beam without monitoring");
            return;
        }

        if (!isShielded()) {
            lowBeamCount++;
            if (lowBeamCount > 3) {
                safe = false;
                notifyObservers("low intensity beam fired more than 3 times");
            } else {
                System.out.println("Firing the low intensity x-ray beam");
                notifyObservers("low intensity beam fired");
            }
        } else {
            System.out.println("Can't fire the low intensity beam when the shield is up");
            notifyObservers("fail to fire low intensity beam with shield up");
        }
    }

    public void fireHighBeam() {
        if (!isSafe()) {
            System.out.println("Can't fire the high intensity beam when the patient is not safe");
            notifyObservers("fail to fire high intensity beam without monitoring");
            return;
        }

        if (isShielded()) {
            highBeamCount++;
            if (highBeamCount > 3) {
                safe = false;
                notifyObservers("high intensity beam fired more than 3 times");
            } else {
                System.out.println("Firing the high intensity cancer cell removal beam");
                notifyObservers("high intensity beam fired");
            }
        } else {
            System.out.println("Can't fire the high intensity beam when the shield is down");
            notifyObservers("fail to fire high intensity beam with shield down");
        }
    }

	public void raiseShield() {
		if (!isShielded()) {
			shielded = true;
			System.out.println("Raising the shield");
			notifyObservers("shield have been raised");
		} else {
			System.out.println("Shield is already raised");
			notifyObservers("fail to raise shield as it already raised");
		}
	}

	public void lowerShield() {
		if (isShielded()) {
			shielded = false;
			System.out.println("Lowering the shield");
			notifyObservers("shield have been lowered");
		} else {
			System.out.println("Shield is already lowered");
			notifyObservers("fail to lower shield as it already lowered");
		}
	}

	@Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    public void update(String event) {
    }
}
