from unittest import TestCase

import EStore


class TestEstoreApp(TestCase):

    def test_estore_system(self):

        self.address = Address("1", "jibril street", "Lagos", "Lagos", Nigeria")

        self.user = User("Faith Dike", "25", "ftoluchi@gmail.com", "1234", "07080100701", self.address)

        self.product = Product(1, "Laptop", "200000", "Gaming Latop", ProductCatergory.ELECTRONICS)

        self.item = Item(self.product, 2)

        self.cart = ShoppingCart()

        self.card = CreditCard("1234567890123456", "Faith Dike", "123", 12, 2027, CardType.VISA)

        self.billing = BillingInformation("Faith Dike", "07080100701", self.address, self.card)



    def test_user_creation(self):

        self.assertEqual(self.user.name, "Faith Dike")
        self.assertEqual(self.user.age, 25)
        self.assertEqual(self.user.address.city, "Lagos")
        self.assertEqual(self.user.email, "ftoluchi@gmail.com")

    def test_product_creation_(self):

        self.assertEqual(self.product_name, "Laptop")
        self.assertEqual(self.price, "200000")
        self.assertEqual(self.product.category, ProductCategory.ELECTRONICS)


    def test_item_creation(self);

        self.assertEqual(self.item.quantity, 2)
        self.assertEqual(self.item.product_name, "Laptop")


    def test_cart_add_item(self):

        self.cart.items.append(self.item)
        self.assertEqual(len(self.items), 1)


    def test_customer_credit_cart(self):

        customer = Customer("Faith", 22, "ftoluchi@gmail.com", "pass", "07080100701", self.address)
        
        customer.cart = self.cart

        self.assertIsNotNone(customer.self)

    def test_customer_billing(self):

        customer = Customer("Faith", 22, "ftoluchi@gmail.com", "pass", "07080100701", self.address)

        customer.billing_info.append(self.billing)

        self.assertEqual(len(customer.billing_info), 1)


    def test_credit_card(self):

        self.assertEqual(self.card.card_type, CardType.VISA)
        self.assertEqual(self.card.expiry_year, 2027)


    def test_billing_info(self):

        self.assertEqual(self.billing.reciever_name, "Faith Dike")
        self.assertEqual(self.billing.credit_card.name_on_card, "Faith Dike")




if __name__ == "__main__":
unittest.main()
