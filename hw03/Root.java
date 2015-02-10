//Tashi Eng
//2/9/15
//CSE 2
//Prints the cube root of a number

    import java.util.Scanner;
    public class Root {
        public static void main(String[] args) {
            Scanner myScanner; //declares an instance of the Scanner object
            myScanner = new Scanner( System.in ); //tells the Scanner that an instance is being created that will take input a number
            System.out.print("Enter a number in the form xx.xx to find its cube root: "); //asks the user input for a whole number
            double number = myScanner.nextInt(); //alllows the user input for a number
            double guess = number/3; //defines the guess of cube root x/3
            double answer; //defines the answer of the cube root of the number
            guess = (2*guess*guess*guess+number)/(3*guess*guess); //improves guess with (guess*guess*guess+x)/(3*guess*guess)
            
            guess = (2*guess*guess*guess+number)/(3*guess*guess); //further improves the estimate by repeating it four more times
            guess = (2*guess*guess*guess+number)/(3*guess*guess);
            guess = (2*guess*guess*guess+number)/(3*guess*guess);
            guess = (2*guess*guess*guess+number)/(3*guess*guess);
            
            answer = guess*guess*guess; //cubes guess to prove that the cube root of the number is correct
            System.out.println("The cube root is" +guess); //prints the cube root of the number
            System.out.println(guess+"*"+guess+"*"+guess+"="+answer+"."); //prints the proof that shows the cube root of the number is correct
            
            
        }
    }