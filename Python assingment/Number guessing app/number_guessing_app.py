import random

def guess_game():
    
    total = 0

    total_attempt = 0

    attempt_time = 5

    random_number = random.randint(1,100)     

    for num in range(attempt_time):   

        try:
            guess = int(input("Guess a Number: "))
        except ValueError:

            print("Error ⛔️, Enter a valid input between 1-100")

            continue


        if num == 0 and guess == random_number:

            print("First Guess is Correct.....🏆️Legendary!")
            total += 1
            total_attempt += 1
            break

        if num == 1 and guess == random_number:

            print("Second Guess is Correct.....🏆️Excellent!")
            total += 1
            total_attempt += 1
            break

        if num == 2 and guess == random_number:

            print("Third Guess is Correct.....🏆️Good!")
            total += 1
            total_attempt += 1
            break

        if num == 3 and guess == random_number:

            print("Forth Guess is Correct.....🏆️Good!")
            total += 1
            total_attempt += 1
            break

        if num == 4 and guess == random_number:

            print("Fifth Guess is Correct.....🏆️Close!")
            total += 1
            total_attempt += 1
            break

        if guess != random_number:

            print("Wrong guess, try again")

            if guess > random_number:
        
                print("Guess is too High")

            else:

                print("Guess is too low")

    print("\nGAME SUMMARY\n")

    print("\nTotal Correct attempt is ", total)

    print("Correct Number is ", random_number)

    print(f"Here is your rating, you got {total} out of {total_attempt} Guesses")


#
guess_game()
