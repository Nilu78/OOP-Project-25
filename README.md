Project: TAA (Toll Administration Application)

Design a Java application for calculating the toll amount for different vehicles that will be used by a toll service company.

Use Encapsulation, Inheritance, Polymorphism and Abstraction principles of OOP to design and implement the application.


Steps:

A. Implement the class Vehicle.

It contains the following:
  
   Data fields with private visibility: 
   - toll - represents toll amount for the vehicle
   - distanceTraveled - represents distance traveled within the toll road
  
   Constructor with protected visibility: 
   - constructor that accepts and initializes distanceTraveled.
  
   Methods:
     - getters and setters for toll and distanceTraveled.
     - calculateToll() - abstract method with void return type.

B. Implement the class Car as a subclass of a Vehicle.

It contains the following:
  
   Data fields with private visibility: 
   - hasTrailer - represents if the car has a trailer.
   - isHov - represents if the car is HOV3+ car.
  
   Constructor: 
   - constructor that accepts and initializes distanceTraveled , hasTrailer and isHov.

  
   Methods:
     -getters and setters for hasTrailer and isHov.
     - calculateToll() - implements the abstract method with the following:
        - toll is calculated as -> distanceTraveled * 0.020
        - if isHov true the toll is 0;
        - if the vehicle has trailer, add 1 dollar on top of the regular toll.
     - toString() - returns the info about the car in the format ->  type + distance + toll
        Example:  Car			 231.0				$5.62


C. Implement the class Truck as a subclass of Vehicle.

It contains the following:
  
   Data field with private visibility: 
   - noOfAxles - represents the amount of axles the truck has.
  
   Constructor: 
   - constructor that accepts and initializes distanceTraveled, noOfAxles

  
   Methods:
     -getters and setters for noOfAxles.
     - calculateToll() - implements the abstract method with the following:
        - if the noOfAxles is 4, the toll is distanceTraveled * 0.040
        - if the noOfAxles is 6, the toll is distanceTraveled * 0.045
        - if the noOfAxles is 8 and up, the toll is distanceTraveled * 0.048
     - toString() - returns the info about the Truck in the format type + distance + toll
        Example:  Truck			 231.0				$5.62

C. Implement the class PoliceCruiser as a subclass of Vehicle.

It contains the following:
  
   Constructor: 
   - constructor that accepts and initializes distanceTraveled

  
   Methods:
     
     - calculateToll() - implements abstract method with the following:
        Police cars get to drive free on the toll road.

     - toString() - returns the info about the Truck in the format type + distance + toll
        Example:  PoliceCruiser			 231.0				$0.0

C. Implement application logic in Main class:
     
     Your application should do the following:

    - Asks the user about the number of Vehicles he/she wants to calculate the toll for.
     (This option assumes using an array hence the requirement for the amount of entries beforehand, you can avoid asking this question if List is used as collection for Vehicles, try that approach!)
    - Asks the following info for each vehicle:
        - The type of the vehicle
        - Distance Traveled
        - trailer and hov info, if it is for a Car
        - no of axles, if it is for a Truck
        - displays the toll info for that vehicle

    
    
    - After all vehicles have been created, displays all the information about the tolls related to each vehicle and ends the application.
    - Refer to the attached document for examples of the console output.