//Tashi Eng
//2/9/15
//CSE 2
//Compute the distance traveled and the average miles per hour of a bicycle

    import java.util.Scanner;
    public class Bicycle {
        public static void main(String[] args) {
            Scanner myScanner; //declares an instance of the Scanner object
            myScanner = new Scanner( System.in ); //tells the Scanner that an instance is being created that will take input for number of seconds traveled
            System.out.print("Enter the number of seconds traveled (an integer > 0) : "); //asks the user input for the number of seconds traveled
            int nSeconds = myScanner.nextInt(); //allows the user input for the number of seconds traveled
            System.out.print("Enter the number of counts on a cyclometer (an integer > 0) :");//asks the user input for the number of counts on a cyclometer
            int nCounts = myScanner.nextInt(); //allows the user input for the number of counts on a cyclometer
            double diameter = 27.0; //declares diameter as 27 inches
            double PI = 3.14159; //declares PI as 3.14159
            double miles; //declares miles
            double minutes; //declares minutes
            double milesPerHour; //declares miles per hour
            miles = (nCounts*diameter*PI)/63360;//calculates miles
            minutes = nSeconds/60;//caclulates minutes
            milesPerHour = miles/(minutes/60);//calculates miles per hour
            
            miles *= 100; //rounds miles to two decimal places
            miles = (int) miles;
            miles /=100;
            
            milesPerHour *=100; //rounds miles per hour to two decimal places
            milesPerHour = (int) milesPerHour;
            milesPerHour /= 100;
            
            System.out.println("The distance was "+miles+" miles and took " +minutes+  "minutes"); //prints the distance and minutes traveled
            System.out.println("The average mph was "+milesPerHour+"."); //prints the average miles per hour
           
        }
    }