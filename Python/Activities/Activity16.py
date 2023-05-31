import self as self


class Car:
    'Class represents a Car'

    def __init__(self, manufacturer, make, model, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer + " " + self.model + " has started moving")

    def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped moving")


car1 = Car("Toyota", "Fortuner", "2021", "Manual", "White")
car2 = Car("Tata", "Safari", "2023", "Automatic", "Black")
car3 = Car("Jeep", "Rubicon", "2023", "Manual", "Red")

car1.accelerate()
car1.stop()
