from unittest import TestCase

import mini_parking_system

class TestMiniParkingSystem(TestCase):

    def test_parking_lot_and_choice_of_parking(self):

        parking_lot = ["Free 👍️"] * 20

        actual_result = mini_parking_system.park_a_car(parking_lot)

        expected_result = "You've successfully parked at space 1"

        self.assertEqual(actual_result, expected_result)


    def test_remove_car_and_choice_of_removed_space(self):

        parking_lot = ["Free 👍️"] * 20

        mini_parking_system.park_a_car(parking_lot)

        actual_result = mini_parking_system.remove_car(parking_lot, select = 1)

        expected_result = "You've successfull removed the car at space 1"

        self.assertEqual(actual_result, expected_result)


















