//Tashi Eng
//2/11/15
//CSE 2
//bring cookies to an event and make sure that there are enough for each person

    import java.util.Scanner;
    public class Cookies {
        public static void main(String[] args) {
           Scanner myScanner; //declares an instance of a scanner
           myScanner = new Scanner(System.in); //tells the Scanner that an instance is being created that will take input for number of people
            System.out.print("Enter the number of people (an integer > 0):"); //asks user input for number of people
            int nPeople = myScanner.nextInt(); //accepts user input for the number of people
            if (nPeople < 0){
                System.out.println("You did not enter an int > 0"); //prevents the program from running if the input is illegal
                return;
            }
            
            System.out.println("Enter the number of cookies you are planning to buy (an integer > 0 ):"); //asks user input for number of cookies
            int nCookies = myScanner.nextInt(); //accepts user input for the number of cookies
            if (nCookies < 0){
                System.out.print("You did not enter an int > 0"); //prevents the program from running if the input is illegal
                return;
            }
            
            System.out.print("How many do you want each person to get? (an integer > 0 ):"); //asks user input for number of cookies each person gets
            int nGive = myScanner.nextInt(); //accepts user input for the number of cookies each person gets
            if (nGive < 0){
                System.out.println("You did not enter an int > 0"); //prevents the program from running if the input is illegal
                return;
            }
            
            if (nGive*nPeople > nCookies){
                System.out.println("You do not have enough cookies for each person"); //decides and prints whether or not there are enough cookies
                System.out.println("You will need" +(nPeople*nGive-nCookies)+ " more"); //prints and calculates how many more cookies are needed
            }else {
                System.out.print("You have enough cookies for each person"); //decides and prints if there are enough cookies
            }
            if ((nCookies%nPeople) != 0){
                System.out.println("The amount will not divide evenly"); //decides and prints if the cookies will not divide evenly
            }else{
                System.out.println("The amount will divide evenly"); //decides and prints if the cookies will divide evenly
            }
            
        }
    }