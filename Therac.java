public enum Therac {
	UNIQUE_INSTANCE;

	private boolean shielded;
	private boolean monitored;

	private Therac() {
		shielded = true;
		monitored = true;
	}

	public static Therac getInstance() {
		return UNIQUE_INSTANCE;
	}

	public boolean isShielded() {
		return shielded;
	}

	public boolean isMonitored() {
		return monitored;
	}

	public void fireLowBeam() {
		if (!isShielded() && isMonitored()) {
			System.out.println("Firing the low intensity beam");
		} else {
			System.out.println("Can't fire the low intensity beam when the shield is up");
		}
	}

	public void fireHighBeam() {
		if (isShielded() && isMonitored()) {
			System.out.println("Firing the high intensity beam");
		} else {
			System.out.println("Can't fire the high intensity beam when the shield is down");
		}
	}

	public void raiseShield() {
		if (!isShielded()) {
			shielded = true;
			System.out.println("Raising the shield");
		} else {
			System.out.println("Shield is already raised");
		}
	}

	public void lowerShield() {
		if (isShielded()) {
			shielded = false;
			System.out.println("Lowering the shield");
		} else {
			System.out.println("Shield is already lowered");
		}
	}
}
