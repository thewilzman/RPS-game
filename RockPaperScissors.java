import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);// scanner object

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

    // See if the user wants to play. pick up its response.
    String ready = scan.nextLine();

   

    if (ready.equals("yes")) {
        System.out.println("Great"); 
        System.out.println("rock- paper - scissors, shoot!");
        String userChoice = scan.nextLine();
        String compChoice = computerChoice();
        System.out.println(compChoice);

        String finalResult = result(userChoice, compChoice);
        printResult(userChoice, compChoice, finalResult);

  
    }else{
        System.out.println("Darn, Some other time...!!!");
    }
    
        scan.close();// to close scanner
    }


    // This function is a function where the computer picks a random choice between 0 and 2

    public static String computerChoice(){
        int randomNumber = (int)(Math.random() * 3); // 0-2
        if (randomNumber == 0) {
            return "rock";
        }else if (randomNumber == 1) {
            return "paper";
        }else if (randomNumber == 2) {
            return "Scissors";
        }else{
            return "Error in the app.Please visit Customer Service Center.";
        }


    }


    //This function is a function that compares the choices and returns the result.

    public static String result(String yourChoice, String computerChoice) {
        String result = "";

        if(yourChoice.equals("rock") && computerChoice.equals("scissors")){
            return "You Win";

        }else if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
            return "You win";
            
        }else if (yourChoice.equals("scissors") && computerChoice.equals("paper")){
            return "You Win";

        }else if(computerChoice.equals("rock") && yourChoice.equals("scissors")){
            return "You lose";
        }else if (computerChoice.equals("paper") && yourChoice.equals("rock")) {
            return "You lose";
            
        }else if (computerChoice.equals("scissors") && yourChoice.equals("paper")){
            return "You lose";
        }else if (computerChoice.equals(yourChoice)){
            return "It's a tie";
        }else{
            System.out.println("Invalid choice");
            System.exit(0);
        }

        return result;
      }
 
     //This function is a function that prints your choice, the computer's, and the result.
     public static void printResult(String yourChoice, String computerChoice,String result){ 
        System.out.println("\nYou chose: "+ yourChoice);
        System.out.println("The computer chose: "+ computerChoice);
        System.out.println(result);

     }

}
