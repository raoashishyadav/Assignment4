package NeebalAssignment4;

public class DistanceTravelled {

	    public static void main(String[] args) {
	    
	     double diameter = 2;
	     double rpm = 5;
	     double time = 60;
	     
	     double circumference = 2 * Math.PI * (diameter/2);
	     double distance = circumference * rpm * time;

	        System.out.println(" Distance travelled : " + distance);

	    }

}
