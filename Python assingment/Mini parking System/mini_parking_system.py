
def park_a_car(parking_lot):
    
    for index in range(len(parking_lot)):

        print(f"Space {index + 1}: {parking_lot[index]}") 

    select = int(input("\nTo park a car select any available space between 1 - 20:\n"))

    if parking_lot[select -1] == "Free 👍️":

        parking_lot[select -1] = "Occupied 🚗️"

        result = f"You've successfully parked at space {select}"

        return result

    else:

        return "This Space is not Avaiable"             

def remove_car(parking_lot):


        select = int(input("Select space to remove, from occupied spaces: "))

        if parking_lot[select -1] == "Occupied 🚗️":

            parking_lot[select -1] = "Free 👍️"  

            result = f"You've successfull removed the car at space {select}"

            return result

        else:

            result2 = "This space is already free"
            return result2

def  view_parking_space(parking_lot):
    
    print("\nCurrent Parking Lot Status")
    
    for index in range(len(parking_lot)):

        result = f"Space {index + 1}: {parking_lot[index]}"

        return 


def main():


    parking_lot = ["Free 👍️"] * 20

    while True:
        choice = int(input("""\nEKO SUITES PARKING SPACE

1. Park a Car🚗️
2. Remove Car🚗️
3. View Parking Space⛩️
4. Exit⛔️

Select an Option: """))


        if choice == 1:
            park_a_car(parking_lot)
        elif choice == 2:
            remove_car(parking_lot)
        elif choice == 3:
            view_parking_space(parking_lot)
        elif choice == 4:
            ("Exiting... GoodBye")
            break
        else:
            print("Invalid entry choice")

main()
