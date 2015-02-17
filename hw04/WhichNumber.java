//Tashi Eng
//2/16/15
//CSE2
//Guess the number that the user is thinking of

import java.util.Scanner;
public class WhichNumber {
    public static void main(String[] args) {

        Scanner myScanner; //declares an instance of the Scanner object
        myScanner = new Scanner(System.in); //tells the scanner that an instance is being created that will take input for questions
        System.out.println("Think of a number between 1 and 10"); // asks the user to think of a number between 1 and 10
        String yes = "y"; //delcares the yes variable
        String no = "n"; //declares the no variable
        char firstAnswer; //declares the first answer as a character
        char secondAnswer; //declares the second answer as a character
        char thirdAnswer; //declares the third answer as a character
        char fourthAnswer; //declares tne fourth answer as a character
        char fifthAnswer; //declares the fifth answer as a character
        char sixthAnswer; //declares the sixth answer as a character
        char seventhAnswer; //declares the seventh answer as a character
        char eighthAnswer; //delcares the eighth answer as a character
        char ninthAnswer; //declares the ninth answer as a character
        System.out.println("Is the number even?"); // asks for the user input of either yes or no for the first question
        firstAnswer = myScanner.next().charAt(0); //accepts the user input of either yes or no for the first question
        if (firstAnswer == 'y' || firstAnswer == 'Y') { //prompts the next question if the first answer is yes
            System.out.println("Is it divisible by 3?"); //asks for the user input of either yes or no
            secondAnswer = myScanner.next().charAt(0); //accepts the user input of either yes or no for the second question
            if (secondAnswer == 'y' || secondAnswer == 'Y') { //decides the user's number if the second answer is yes
                System.out.println("Your number is 6)"); //prints and decides that the user's number is six
                return; //ends program
            }
            else if (secondAnswer == 'n' || secondAnswer == 'N') { //prompts the next question if the second answer is no
                System.out.println("Is the number divisible by 4"); //asks for the user input of either yes or no
                thirdAnswer = myScanner.next().charAt(0); //accepts the user input of either yes or no
                if (thirdAnswer == 'y' || thirdAnswer == 'Y') { //prompts the next question if the third answer is yes
                    System.out.println("Is the number divided by 4 greater than 1"); //asks for the user input of either yes or no for the fourth question
                    fourthAnswer = myScanner.next().charAt(0); //accepts the user input of either yes or no
                    if (fourthAnswer == 'y' || fourthAnswer == 'Y') { //decides the user's number if the fourth answer is yes
                        System.out.println("Your number is 8"); //prints and decides that the user's number is 8
                        return; //ends program
                    }
                    else if (fourthAnswer == 'n' || fourthAnswer == 'N') { //decides the user's number if the fourth answer is no
                        System.out.println("Your number is 4"); //decides and prints that the user's number is 4
                        return; //ends program
                    }
                    else if (thirdAnswer == 'n' || thirdAnswer == 'N') { //prompts the next question if the third answer is no
                        System.out.println("Is it divisible by 5?"); //asks for the user input of either yes or no for the fifth question
                        fifthAnswer = myScanner.next().charAt(0); //accepts the user input of either yes or no
                        if (fifthAnswer == 'y' || fifthAnswer == 'Y') { //prompts the user's number if the fifth answer is yes
                            System.out.println("Your number is 10"); //prints and decides that the user's number is 10
                            return; //ends program
                        }
                        else if (fifthAnswer == 'n' || fifthAnswer == 'N') { //prompts the user's number if the fifth answer is no
                            System.out.println("Your number is 2"); //prints and decides that the user's number is 2
                            return; //ends program
                        }
                    }
                }

            }



        }
        else if (firstAnswer == 'n' || firstAnswer == 'N') { //prompts the next question if the first answer is no
            System.out.println("Is it divisible by 3?"); //asks the user input of either yes or no for the sixth question
            sixthAnswer = myScanner.next().charAt(0); //accepts the user input of either yes or no for the sixth question
            if (sixthAnswer == 'y' || sixthAnswer == 'Y') { //prompts the next question if the sixth answer is yes
                System.out.println("When divided by 3 is the result greater than 1?"); //asks the user input of either yes or no for the seventh question
                seventhAnswer = myScanner.next().charAt(0); //accepts the user input of either yes or no
                if (seventhAnswer == 'y' || seventhAnswer == 'Y') { //prompts and decides the user's number if the seventh answer is yes
                    System.out.println("Your number is 9");//prints and decides that the user's number is 9
                    return; //ends program
                }
                else if (seventhAnswer == 'n' || seventhAnswer == 'N') { //prompts and decides if the seventh answer is no
                    System.out.println("Your number is 3"); //decides and prints that the user's number is 3
                    return; //ends program
                }
            }
            else if (sixthAnswer == 'n' || sixthAnswer == 'N') { //prompts the next question if the first answer is no
                System.out.println("Is it greater than 6?"); // asks the user input of either yes or no for the eighth question
                eighthAnswer = myScanner.next().charAt(0); //accepts the user input of either yes or no
                if (eighthAnswer == 'y' || eighthAnswer == 'Y') { //prompts and decides the user's number if the eighth answer is yes
                    System.out.println("Your number is 7"); //prints and decides that the user's number is 7
                    return; //ends program
                }
                else if (eighthAnswer == 'n' || eighthAnswer == 'N') { //prompts the next question if the eighth answer is no
                    System.out.println("Is it less than 3?"); //asks the user input of either yes or no for the ninth question
                    ninthAnswer = myScanner.next().charAt(0); //accepts the user input of either yes or no
                    if (ninthAnswer == 'y' || ninthAnswer == 'Y') { //prompts and decides if the ninth answer is yes
                        System.out.println("Your number is 1"); //decides and prints that the user's number is 1
                        return; //ends program
                    }
                    else if (ninthAnswer == 'n' || ninthAnswer == 'N') { //prompts and decides the user's number if the ninth answer is no
                        System.out.println("Your number is 5"); //decides and prints that the user's number is 5
                        return; //ends program
                    }
                }
            }
        }
    }
}






