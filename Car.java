public class Car extends Vehicle {
	private boolean hasTrailer;
	private boolean isHov;

	public Car(int distanceTraveled, boolean hasTrailer, boolean isHov) {
		super(distanceTraveled);
		this.hasTrailer = hasTrailer;
		this.isHov = isHov;
		calculateToll();
	}

	public boolean isHasTrailer() {
		return hasTrailer;
	}

	public void setHasTrailer(boolean hasTrailer) {
		this.hasTrailer = hasTrailer;
	}

	public boolean isHov() {
		return isHov;
	}

	public void setHov(boolean isHov) {
		this.isHov = isHov;
	}

	@Override
	public void calculateToll() {
		double toll=this.getDistanceTraveled()*0.020;
		if(this.isHov) {
			toll=0;
		}
		
		if(this.hasTrailer) toll++;
		this.setToll(toll);

	}

	@Override
	public String toString() {
		return "Car   " + getDistanceTraveled() + "     "+"$"+this.getToll() ;
	}

	

	
	

}