
import java.util.*;
public class Bjorksnas{
    // Global variables total counts 
    public static int numRounds = 0;
    public static int userScore = 0;
    public static int computerScore = 0;
    
    // Global array to use when trying to assign/validate a move
    public static String moves[] = {"Kvalfjord", "Bjorksnas", "Hauga", "Nordli", 
"Slakt"};
    public static void main(String args[]){
        // String to use when asking user
        String startingMenu = "Do you want to play Bjorksnas? (y/n) > ";
        String askIfAnother = "Do you want to play another round of Bjorksnas? 
(y/n) > ";
        
        // Print game content. 
        printDescription();
        printRules();
        
        // Starting game loop, exit only when user enter n
        System.out.print(startingMenu);
        while(launchGame()){
            execGame();  // Run game and print the result of the round
            numRounds++;    // Add in to number of round
            printSeperator(50); // Print a horizontal line for better UI
            // Ask if user want to play again 
            System.out.print(askIfAnother); 
        }
        
        /* Print number of games played, times the user won and times
           the computer won. */
        printEndingResult();
    }
    
    
    // Print the description of the game
    public static void printDescription(){
        System.out.println("Bjorksnas is a two-player game that ancient Nordic 
people play during winter season.\n");
        System.out.println("For each round, players choose a move, which may be 
either Kvalfjord, Bjorksnas, Hauga, Nordli, or Slakt.\n");
    }
    
    
    // Print the rules of the game
    public static void printRules(){
        System.out.println("For each round, the winner will be determine by the 
rules below:");
        System.out.println("Slakt beats Hauga, Kvalfjord");
        System.out.println("Hauga beats Bjorksnas, Nordli");
        System.out.println("Bjorksnas beats Slakt, Kvalfjord");
        System.out.println("Kvalfjord beats Nordli, Hauga");
        System.out.println("Nordli beats Slakt, Bjorksnas\n");
        System.out.println("The computer wins in the event of a tie.");
        printNotice();
    }
    
    
    // Print a friendly reminder, not necessary
    public static void printNotice(){
        System.out.println("\nFor better user experience, you can play as many 
games as you want before you entered n when asking next round. :D");
        System.out.println("\nFriendly Note: The moves are case sensitive");
        System.out.println("Make sure you entered the right move.");
        System.out.println("Otherwise, we'll contiute ask you to enter a valid 
move. :)");
        printSeperator(50);
    }
    
    
    // Ask user if he/she want to play Bjorksnas
    public static boolean launchGame(){
        Scanner scan = new Scanner(System.in);
        char input = scan.next().charAt(0);
        
        while(input != 'y' && input != 'n'){
            System.out.print("Input invalid, please enter y or n> ");
            input = scan.next().charAt(0);
        }
        
        if(input == 'y'){
            if(numRounds == 0){
                System.out.println("Game starting...");
            }
            return true;
        }
            
        System.out.println("Game ending...");
        return false;
    }
    
    // Print dash to make the terminal look more neat
    public static void printSeperator(int amount){
        for(int i = 1; i <= amount; i++){
            System.out.print("-");
        }
        System.out.println();
    }
    
    
    //Run the game
    public static void execGame(){
        Scanner scan = new Scanner(System.in);
        
        // Ask for input
        System.out.print("Enter a move: ");
        String userMove = scan.nextLine();
        String computerMove = moves[getRandom()];
        
        // Validate User's move (ask again until valid)
        userMove = validateUserMove(userMove);
        
        // Print result
        System.out.println("You entered " + userMove + " and computer entered " + 
computerMove);
        doJudge(userMove, computerMove);
    }
    
    
    // This method return the validated move from user
    public static String validateUserMove(String userMove){
        Scanner scan = new Scanner(System.in);
        
        // Set validity to false by default, and check validty by loop
        boolean valid = false;
        for(int i = 0; i < moves.length; i++){
            if(userMove.equals(moves[i])){
                valid = true;
            }
        }
        
        // Ask for valid move until user enter a valid move.
        while(!valid){
            System.out.println("Input not valid");
            System.out.println("Please enter either Kvalfjord, Bjorksnas, Hauga, 
Nordli, or Slakt");
            System.out.print("> ");
            userMove = scan.nextLine();
            for(int i = 0; i < moves.length; i++){
                if(userMove.equals(moves[i])){
                    valid = true;
                }
            }
        }
        
        // Return the validated move that user entered.
        return userMove;
    }
    
    
    // Get a random number for computer's move
    public static int getRandom(){
        Random dice = new Random();
        int pcMove = dice.nextInt(5);
        return pcMove;
    }
    
    
    // Judge who is the winner and add point to the winner
    public static void doJudge(String userMove, String computerMove){
        if(userMove.equals(computerMove)){
            System.out.println("Computer won this round.");
            computerScore++;
        }
        else if(userMove.equals(moves[0]) && (computerMove.equals(moves[2]) || 
computerMove.equals(moves[3]))){
            System.out.println("You have won this round!");
            userScore++;
        }
        else if(userMove.equals(moves[1]) && (computerMove.equals(moves[0]) || 
computerMove.equals(moves[4]))){
            System.out.println("You have won this round!");
            userScore++;
        }
        else if(userMove.equals(moves[2]) && (computerMove.equals(moves[1]) || 
computerMove.equals(moves[3]))){
            System.out.println("You have won this round!");
            userScore++;
        }
        else if(userMove.equals(moves[3]) && (computerMove.equals(moves[1]) || 
computerMove.equals(moves[4]))){
            System.out.println("You have won this round!");
            userScore++;
        }
        else if(userMove.equals(moves[4]) && (computerMove.equals(moves[2]) || 
computerMove.equals(moves[0]))){
            System.out.println("You have won this round!");
            userScore++;
        }
        else{
            System.out.println("Computer won this round.");
            computerScore++;
        }
    }
    
    
    // Print the ending result
    public static void printEndingResult(){
        printSeperator(50);
        System.out.println("Total rounds: " + numRounds);
        System.out.println("Rounds you won: " + userScore);
        System.out.println("Rounds computer won: " + computerScore);
    }
}
