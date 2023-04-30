for i in range(5):
    import random

    print(
        """
                   Greetings! Welcome to GUESS THE WORD!
        ========                                          =======
                ==========================================
        ========             MADE BY GROUP 4              =======
                ==========================================
                
            =======__         __________________________________
           /     0 0/__     <  Hi! My name's PYTHON, Let's play! ]
          /    _______/      |    Enter your name down below.   ]
         /     /              |_________________________________]
        /     /
        |     |
        ---____----------
       |_________________|                ^
      |___________________|---___________| |
    |_______________________|-___________---
        """
    )
    name = input("What's your name?:")
    guesses = ''
    turns = 5
    points = 50


    print("Good Luck", name, "!")
    print("You have", points, "points!")


    words = ['python', 'program', 'pycharm', 'phinma', 'computer', 'keyboard', 'mouse', 'desktop']


    word = random.choice(words)

    print("Guess the characters")


    while turns > 0:

        failed = 0

        for char in word:

            if char in guesses:
                print(char, end=" ")

            else:
                print("_")

                failed += 1

        if failed == 0:

            print("Congratulations, You win!")

            print("The word is: ", word)
            print("you still have", points ,"points left!")
            a = str(input("Do you want to play again?"))
            if a == "yes":
                print("You have selected yes")
            elif a == "no":
                print(
                    """
                        =======__         ________________________ ______________
                       /     0 0 |     <  Well then, Let's play again sometime! ]
                      /    _______|==<     |             Goodbye!!               ]
                     /     /              |_________________________________]
                    /     /
                    |     |
                    ---____----------
                   |_________________|                ^
                  |___________________|---___________| |
                |_______________________|-___________---
                    """
                )
                exit()

            print("Your points are", points)
            break


        print()
        guess = input("Guess a character:")

        guesses += guess

        if guess not in word:

            turns -= 1

            points -= 10

            print("Incorrect")

            print("You have", + turns, 'guesses left')

            print("You have", + points, 'points left')

            if turns == 0:
                print("GAME OVER!")
                print("YOU LOSE")
                print(
                    """
                        =======__         _______________________________________
                       /     0 0/__     <   Don't worry, you'll get it next time!]
                      /    _______/      |              Goodbye!           ]
                     /     /              |____________________________________]
                    /     /
                    |     |
                    ---____----------
                   |_________________|                ^
                  |___________________|---___________| |
                |_______________________|-___________---
                    """
                )
                exit()
