// Name: Allen Chin
// Course: CS178 Build Automation for DevOps and QA
// CRN: 76718
// Date: 09/01/2019
// Assignment: Asterisks

import java.util.Scanner;
import java.lang.System;

public class Asterisks
{
    private static Scanner scanner = new Scanner(System.in);

    // Prints the prompt and asks for input of answer yes/no
    // Loops endlessly until valid answer is given
    public static boolean promptBoolean(String prompt)
    {
        while (true)
        {
            try
            {
                System.out.println(prompt);
                System.out.println("[Y] Yes  [N] No");
                String response = scanner.next().toLowerCase();;

                if (response.equals("yes") || response.equals("y"))
                {
                    return true;
                }
                else if (response.equals("no") || response.equals("n"))
                {
                    return false;
                }

                // Unfortunately Java 7+ only...
                // switch (response)
                // {
                //     case "yes":
                //     case "y":
                //         return true;

                //     case "no":
                //     case "n":
                //         return false;
                // }
            }
            catch (Exception e)
            {
                System.out.println("Please enter yes or no.");
            }

        }
    }

    // Prints the prompt and asks for input of type int
    // Loops endlessly until valid answer is given
    public static int promptInt(String prompt)
    {
        while (true)
        {
            try
            {
                System.out.println(prompt);
                return scanner.nextInt();
            }
            catch (Exception e)
            {
                System.out.println("Please enter an integer.");
            }

        }
    }

    public static void main(String[] args)
    {
        String intMessage = "How many asterisks do you want to be printed to console?";
        String continueMessage = "Do you want to continue?";
        boolean running = true;

        while (running)
        {
            // Set newlines to be the delimiter
            scanner.useDelimiter("\\r\\n|\\n");


            // Java 7+ only...
            // scanner.useDelimiter(System.lineSeparator());
            int n = promptInt(intMessage);

            // Create a string with n asterisks
            System.out.println(new String(new char[n]).replace("\0", "*"));

            // Update running variable according to prompt
            running = promptBoolean(continueMessage);

        }

    }
}