//Tashi Eng
//2/17/15
//CSE 2
//Program that processes banking transactions

    import java.util.Scanner;
    public class Banking{
        public static void main(String[] args){
            
            Scanner myScanner; //declares an instance of a scanner 
            myScanner = new Scanner(System.in); //tells the scanner to take input
            int randor = (int)Math.random()*4000+1000; //creates a random number between 1000 and 5000
            System.out.println("If you would like to make a deposit, press 1"); //asks for user's input of making a deposit
            System.out.println("If you would like to withdraw cash, press 2"); //asks for the user's input of making a withdrawal
            System.out.println("If you would like to view your current balanc, press 3"); //asks for the user's input of viewing their balance
            String bank = myScanner.next(); //creates a string for a switch statement
            switch (bank){
                case "1": //works out case 1
                    System.out.println("How much would you like to deposit?"); //asks the user how much they would like to deposit
                    int randor += myScanner.nextInt(); //adds user's amount to random amount in the bank account
                    System.out.println("Your balance is: "+randor); //tells the user their balance after deposit
                    break; //breaks program out of switch
                case "2": //works out case 2
                    System.out.println("How much would you like to withdraw?"); ///asks the user how much they would like to withdraw
                    int take = myScanner.nextInt(); //accepts the user's input of the amount they would like to withdraw
                        if(take > randor){ //checks the bank account to see if there is enough money to complete the transaction
                            System.out.println("There are insufficient funds to complete the withdrawal"); //tells the user that they do not have enough money
                            System.exit(0); //exits program
                        }
                        else{ randor -= take; //calculates how much is left in the user's bank account
                            System.out.println ("Your balance is: "+randor); //tells the user their balance after the withdrawal
                        }
                        break; //breaks program out of switch
                case "3": //works out case 3
                    System.out.println("Your balance is: "+randor); //tells the user their balance
                    break; //breaks program out of switch
                    default: //redirects the user if they do not select a valid number
                    System.out.println("Please enter a valid case number");
                    break;
                    
                    
            }
            
            
        }
    }