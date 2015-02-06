//Tashi Eng
//2/5/2015
//CSE2
//Compute the cost of buying some Big Macs

    import java.util.Scanner;
    public class BigMac {
        public static void main(String[] args) {
            
            Scanner myScanner; //declares an instance of the Scanner object
            myScanner = new Scanner( System.in ); //tells the Scanner that an instance is being created that will take input for number of big macs
            System.out.print("Enter the number of Big Macs (an integer > 0) : "); //asks the user input for the number of big macs
            int nBigMacs = myScanner.nextInt(); //allows the user input for the number of big macs
            System.out.print("Enter the cost per Big Mac as"+ " a double (in the form xx.xx): " ); //asks the user input for the cost of big macs
            double bigMac$ = myScanner.nextDouble(); //allows the user input for the cost of big macs
            System.out.print("Enter the percent tax as a whole number (xx): "); //asks the user input for the percentage of tax as a whole number
            double taxRate = myScanner.nextDouble(); //alllows the user input for the percentage of tax as a whole number
            taxRate/=100; //converts the whole number to a decimal percent
            double cost$; //declares cost in terms of dollars, dimes, and pennies
            int dollars,
                dimes,
                pennies;
            cost$ = nBigMacs*bigMac$*(1+taxRate); // calculates total cost
            dollars = (int)cost$; //calculates cost in dollars
            dimes = (int) (cost$*10)%10; //calculates cost in dimes
            pennies = (int) (cost$*100)%10; //calculates cost in pennies
            System.out.println("The total cost of "+nBigMacs+" BigMacs, at $"+bigMac$ +" per bigMac, with a" + " sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies); //prints total cost
            
        }
    }