#step
#import random , to generate random maths questions,

# ask the user to answer the question

#the user as two trial on each subtraction questions, 
#
#if user missed the correct answer twice, 
#
#go to the next question till it gets to 10
#
#display the total scores e.g your score is 6 / 10
#


#

#Import random

#set total passes to 0

#for question in 1 to 10, using for loop to loop through question 10 times

#set number equals to random.randit from 40 - 70 

#set second_number to equals random.randit from 1 - 39 in a another variable name

#tell user to anwser question, on first attempt

#if the anwser is correct , add it to total pass and print correct if incorrect print incorrect

#attempt 2 if first question is correct do same as first attempt or print wrong if not correct

#display total passes at the end of the 10 question





import random

total_passes = 0

for question in range(1, 11):

    number = random.randint(40, 80)

    second_number = random.randint(1, 39)

    result = number - second_number

    question1 = int(input(f"{number} - {second_number} = "))
       
    if question1 == result:

        print("Right answer👍️, Move next question")

        total_passes += 1

    else:

        print("Wrong answer ⛔️, try one more time")

        question2 = int(input(f"{number} - {second_number} = "))

        if question2 == result:

            print("Right answer👍️, Move next question")

            total_passes += 1

        else:

            print("Wrong answer ⛔️, Answer Next Question")
            

print("Total passes is: ", total_passes)






