public class Truck extends Vehicle{
	
	private int noOfAxles;
	
	

	public Truck(int distanceTraveled, int noOfAxles) {
		super(distanceTraveled);
		this.noOfAxles = noOfAxles;
		calculateToll();
	}

 

	public int getNoOfAxles() {
		return noOfAxles;
	}



	public void setNoOfAxles(int noOfAxles) {
		this.noOfAxles = noOfAxles;
	}



	@Override
	public void calculateToll() {
		double toll=0;
		
		if(noOfAxles==4) {
			toll=getDistanceTraveled()*0.040;
		}else if(noOfAxles==6) {
			toll=getDistanceTraveled()*0.045;
		}else if(noOfAxles>=8) {
			toll=getDistanceTraveled()*0.048;	
		}
		
		setToll(toll);
		
	}
	
	@Override
	public String toString() {
		return "Truck   " + getDistanceTraveled() + "     "+"$"+this.getToll() ;
	}


}