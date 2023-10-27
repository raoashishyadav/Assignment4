package NeebalAssignment4;

public class Time {
	

	    public static void main(String[] args) {

	        int time = 3800;

	        int hours = time / 60 / 60;

	        int minutes = time % ( 60 * 10) / 60;

	        int seconds =  time % 60;

	        System.out.println( hours + " : " + minutes / 10 + minutes % 10 + " : " + seconds / 10 + seconds % 10 );


	    }
	
}
