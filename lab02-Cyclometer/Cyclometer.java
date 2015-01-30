//Tashi Eng
//1/30/15
//CSE2
//Cyclometer measures speed, distance, etc.

	public class Cyclometer {
		public static void main(String[] args) {
			
			int secsTrip1=480; //The time for trip 1 was 480 seconds
			int secsTrip2=3220; //The time for trip 2 was 3220 seconds
			int countsTrip1=1561; //The rotation counts for trip 1 was 1561
			int countsTrip2=9037; //The rotation counts for trip 2 was 9037
			double wheelDiameter=27.0, //declares wheel diameter as a double variable
			PI=3.14159, //declares a number for PI
			feetPerMile=5280, //declares feet per mile
			inchesPerFoot=12, //declares inches per foot
			secondsPerMinute=60; //declares seconds per minute
			double distanceTrip1, distanceTrip2, totalDistance; //declares distances for each trip and the total distance of both trips
			System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts."); //Converts seconds to minutes for Trip 1
			System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts."); //Converts seconds to minutes for Trip 2
			distanceTrip1=countsTrip1*wheelDiameter*PI; //Calculates the distance of Trip 1 by multiplying the rotation counts, wheel diameter, and PI
			distanceTrip1/=inchesPerFoot*feetPerMile; //Gives distance in miles
			distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
			totalDistance=distanceTrip1+distanceTrip2;
			System.out.println("Trip 1 was "+distanceTrip1+" miles");
			System.out.println("Trip 2 was "+distanceTrip2+" miles");
			System.out.println("The total distance was "+totalDistance+" miles");
		}
	}