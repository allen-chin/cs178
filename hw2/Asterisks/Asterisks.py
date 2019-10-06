# Name: Allen Chin
# Course: CS178 Build Automation for DevOps and QA
# CRN: 76718
# Date: 09/01/2019
# Assignment: Asterisks


def main():
    answers = ["yes", "no", "y", "n"]

    # For Python 2 compatibility in Bitbucket
    try:
        input = raw_input
    except NameError:
        pass

    while True:
        # Get integer input
        n = None

        while not n:
            try:
                n = int(input("How many asterisks do you want to be printed to console?\n"))
            except:
                print("Please enter a integer.")

        print(n * "*")

        # Prompt to continue or terminate
        response = None

        while response not in answers:
            try:
                print("Do you want to continue?")
                response = input("[Y] Yes  [N] No\n").lower()
            except:
                print("Please try again.")

        if response[0] == "y":
            continue
        elif response[0] == "n":
            exit(0)

if __name__ == "__main__":
    main()