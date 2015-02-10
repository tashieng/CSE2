//Tashi Eng
//2/9/15
//CSE 2
//Prints the first four digits to the right of the decimal point of a number

    import java.util.Scanner;
    public class FourDigits{
        public static void main(String[] args) {
            Scanner myScanner; //declares an instance of the Scanner object
            myScanner = new Scanner( System.in ); //tells the Scanner that an instance is being created that will take input of a number
            System.out.print("Enter a number to see its first four digits to the right of its decimal point ");//asks for the user input of a number
            double firstNumber = myScanner.nextDouble(); //allows the user input of the number
            int secondNumber = (int) firstNumber; //converts the first number into a whole number without decimal places
            double thirdNumber = firstNumber - secondNumber; //subtracts the whole number from the original number to get the four decimal numbers
            thirdNumber *=10000; //converts the decimal numbers into a whole number
            int firstInt = 0 + ((int)thirdNumber/100); //removes decimals from the first digit of the third number
            thirdNumber -= firstInt*1000;
            int secondInt = 0 + ((int)thirdNumber/100); //removes decimals from the second digit of the third number
            thirdNumber -= secondInt*100;
            int thirdInt = 0 + ((int)thirdNumber/100); //removes decimals from the third digit of the third number
            thirdNumber -= thirdInt*10;
            int fourthInt = 0 + ((int)thirdNumber/100); //removes decimals from the fourth digit of the third number
            System.out.print("The four digits are " ); //prints "The four digits are"
            System.out.print(firstInt); //prints first digit
            System.out.print(secondInt); //prints second digit
            System.out.print(thirdInt); //prints third digit
            System.out.print(fourthInt); //prints fourth digit
            
 
        }
    }


