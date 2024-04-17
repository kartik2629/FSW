function Car(make, model, year) {
    this.make = make;
    this.model = model;
    this.year = year;
    // Method to get car details
    this.getDetails = function() {
    return `Make: ${this.make}, Model: ${this.model}, Year: ${this.year}`;
    }
   }
   // Create an ElectricCar subclass that inherits from Car
   function ElectricCar(make, model, year, batteryCapacity) {
    Car.call(this, make, model, year); // Call the parent constructor
    this.batteryCapacity = batteryCapacity;
    // Method specific to ElectricCar
    this.getRange = function() {
    // Simulate range based on battery capacity (replace with actual calculation if needed)
    return `${this.batteryCapacity} kWh battery. Estimated range: ${this.batteryCapacity * 5} km`;
    }
   }
   // Set ElectricCar to inherit from Car prototype
   ElectricCar.prototype = Object.create(Car.prototype);
   ElectricCar.prototype.constructor = ElectricCar; // Reset constructor pointer
   // Create instances of Car and ElectricCar
   const car1 = new Car("Toyota", "Camry", 2023);
   const electricCar1 = new ElectricCar("Tesla", "Model S", 2024, 100);
   console.log(car1.getDetails()); // Output: Make: Toyota, Model: Camry, Year: 2023
   console.log(electricCar1.getDetails()); // Output: Make: Tesla, Model: Model S, Year: 2024 (inherited from Car)
   console.log(electricCar1.getRange()); // Output: 100 kWh battery. Estimated range: 500 km (specific to ElectricCar)
   // Note that electricCar1 can also access the getDetails() method inherited from Car
   