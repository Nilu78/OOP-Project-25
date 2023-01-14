public class PoliceCruiser extends Vehicle {

	protected PoliceCruiser(int distanceTraveled) {
		super(distanceTraveled);
	}

	@Override
	public void calculateToll() {
		setToll(0);
	}

	@Override
	public String toString() {
		return "PoliceCruiser   " + getDistanceTraveled() + "     " + "$" + this.getToll();
	}
}