import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String playerAMove = "", playerBMove = "";
        String PlayAgain = "";
        Boolean playerA = false;
        Boolean playerB = false;
        Boolean donePlaying = true;

        // After Playing once and deciding to play again, If you enter an invalid move it will correctly output that
        // your move is invalid. However, the code will then use the previous game's correct input instead of looping
        // and prompting for a new input.

        do
        {
            do
            {

                System.out.print("Player A, please enter a move R,P,S: ");

                    playerAMove = in.nextLine();
                    if (playerAMove.equalsIgnoreCase("R"))
                    {
                        playerA = true;
                    }
                    else if (playerAMove.equalsIgnoreCase("P"))
                    {
                        playerA = true;
                    }
                    else if (playerAMove.equalsIgnoreCase("S"))
                    {
                        playerA = true;
                    }
                    else
                    {
                        System.out.println("You entered an illegal move! Please enter R,P,S!");
                        playerA = false;
                    }

            }while(!playerA);


            do
            {

                System.out.print("Player B, please enter a move R,P,S: ");


                    playerBMove = in.nextLine();

                    if (playerBMove.equalsIgnoreCase("R"))
                    {
                        playerB = true;
                    }
                    else if (playerBMove.equalsIgnoreCase("P"))
                    {
                        playerB = true;
                    }
                    else if (playerBMove.equalsIgnoreCase("S"))
                    {
                        playerB = true;
                    }
                    else
                    {
                        System.out.println("You entered an illegal move! Please enter R,P,S!");
                        playerB = false;
                    }
            }while(!playerB);

            if (playerAMove.equalsIgnoreCase("R")) // nested if then else
            {
                if (playerBMove.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock vs Rock. It's a tie!");
                }
                else if (playerBMove.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper covers Rock. Player B wins!");
                }
                else // player2 is Scissors
                {
                    System.out.println("Rock breaks Scissors. Player A wins!");
                }
            }
            else if (playerAMove.equalsIgnoreCase("P"))
            {
                if (playerBMove.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper covers Rock. Player A Wins!");
                }
                else if (playerBMove.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper vs Paper. It's a tie!");
                }
                else // player2 is Scissors
                {
                    System.out.println("Scissors cuts paper. Player B wins!");
                }
            }
            else // player1 is Scissors
            {
                if (playerBMove.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock breaks Scissors. Player B Wins");
                }
                else if (playerBMove.equalsIgnoreCase("P"))
                {
                    System.out.println("Scissors cuts Paper. Player A wins!");
                }
                else // player2 is Scissors
                {
                    System.out.println("Scissors vs Scissors. It's a tie!");
                }
            }

            System.out.print("Would you like to play again? [Y/N]: ");

            if(in.hasNextLine())
            {
                PlayAgain = in.nextLine();
                if (PlayAgain.equalsIgnoreCase("Y"))
                {
                    donePlaying = false;
                }
                else if (PlayAgain.equalsIgnoreCase("N"))
                {
                    System.out.println("Thank you for playing");
                    donePlaying = true;
                }
                else
                {
                    System.out.println("Please enter either Y/N");
                }
            }
        }while(!donePlaying);

    }
}