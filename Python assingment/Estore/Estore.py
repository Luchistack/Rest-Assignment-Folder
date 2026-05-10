from enum import Enum

class ProductCategory(Enum):

    ELECTRONICS = "Electronics"
    
    GROCERIES = "Groceries"

    UTENSILS =  "Utensils"

    CLOTHING = "Clothing"


class CardType(Enum):

    MASTER_CARD = "Master Card"

    VISA = "Visa"

    VERVE = "Verve"

    AMEX = "American Express"


class Address:

       def __init__(self, house_number, street, city, state, country):

            self.house_number = house_number
            self.street = street
            self.ciry = city
            self.state = state
            self.country = country

class User:

       def __init__(self, name, age, email, password, phone, address: Address):

            self.name = name
            self.age = age
            self.email = email
            self.password = password
            self.phone = phone
            self.address = address


class Customer(User):

    def __init__(self, name, age, email, password, phone, address):

        super().__init__(name, age, email, password, phone, address)

            self.billing_info = []
            self.cart = None

class Seller(User):
        
    pass

class Admin(User):

    pass


class Product:

       def __init__(self, product_id, product_name, price, product_description, product_category: ProductCategory):
                
            self.product_id = product_id
            self.product_name = product_name
            self.price = price
            self.product_description = product_descriprion
            self.product_category = product_category


class Item:
    
    def __init__(self, product:Product, quantity):

        self.product = product
        self.quantity = quantity

class ShoppingCart:

    def __init__(self):
        
        self.items = []

class CreditCard:

    def __init__(self, number, name_on_card, cvv, expiry_month, expiry_year, card_type:CardType):

        self.number = number
        self.name_on_card = name_on_card
        self.cvv = cvv
        self.expiry_month = expiry_month
        self.expiry_year = expiry_year
        self.card_type = card_type

class BillingInformation:
            
    def __init__(self, reciever_name, reciever_phone, delivery_address: Address, credit_card: CreditCard):

        self.reciever_name = receiver_name
        self.reciever_phone = receiever_phone
        self.delivery_address = delivery_address
        self.credit_card = credit_card
