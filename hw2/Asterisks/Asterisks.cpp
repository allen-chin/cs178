// Name: Allen Chin
// Course: CS178 Build Automation for DevOps and QA
// CRN: 76718
// Date: 09/01/2019
// Assignment: Asterisks

#include <iostream>
#include <limits>
#include <string>

using namespace std;

// Prints the prompt and asks for input of answer yes/no
// Loops endlessly until valid answer is given
bool promptBoolean(string prompt)
{
    while (true)
    {
        cout << prompt << endl;
        cout << "[Y] Yes  [N] No" << endl;

        string response;
        cin >> response;

        // Since C++ does not include a built-in toLowercase, just check first character
        if (response[0] == 'y' || response[0] == 'Y')
        {
            return true;
        }
        else if (response[0] == 'n' || response[0] == 'N')
        {
            return false;
        }

        cout << "Please enter yes or no." << endl;
    }
}

// Prints the prompt and asks for input of type int
// Loops endlessly until valid answer is given
int promptInt(string prompt)
{
    while (true)
    {
        cout << prompt << endl;
        int response;

        if (!(cin >> response))
        {
            cin.clear();
            cin.ignore(numeric_limits<streamsize>::max(), '\n');
            cout << "Please enter an integer greater than or equal to 0." << endl;
        }
        else if (response < 0)
        {
            cout << "Please enter an integer greater than or equal to 0." << endl;
        }
        else
        {
            return response;
        }
    }
}

int main()
{
    string intMessage = "How many asterisks do you want to be printed to console?";
    string continueMessage = "Do you want to continue?";
    bool running = true;

    while (running)
    {
        int n = promptInt(intMessage);

        // Create a string with n asterisks
        cout << string(n, '*') << endl;

        // Update running variable according to prompt
        running = promptBoolean(continueMessage);
    }
    return 0;
}