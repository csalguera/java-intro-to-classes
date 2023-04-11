public class App {
  public static void main(String[] args) {
    /*
     * ----------------
     * Intro to Classes
     * ----------------
     * 
     * All Java programs require one or more classes that act as a model
     * 
     * A program to track student test scores may contain Student, Course, and Grade classes
     * Each student would be represented as an instance, or object, of the Student class
     * 
     * An object contains state and behavior
     */

    /*
     * ---------------
     * Classes: Syntax
     * ---------------
     * 
     * The fundamental concept of object-oriented programming is the calls
     * 
     * A class is the set of instructions that describe how an instance can behave and what information it contains
     * 
     * Java has built-in classes, such as System
     * 
     * public class Car {
     *   // scope of Car class
     *   public static void main(String[] args) {
     *     // scope of main() method
     *
     *     // program tasks
     * 
     *   }
     *   // scope of main() method ends
     * }
     * // scope of Car class ends
      */

    /*
     * ---------------------
     * Classes: Constructors
     * ---------------------
     * 
     * To create an object (an instance of a class), we need a constructor method
     * 
     * The constructor is defined within the class
     * 
     * public class Car {
     *   // Constructor method
     *   public Car() {
     *     // instructions for creating a Car instance
     *   }
     * 
     *   public static void main(String[] args) {
     *     // body of main method
     *   }
     * }
     * 
     * To create an instance, we need to call or invoke the constructor within main()
     * 
     * The following example assigns a Car instance to the variable ferrari:
     * 
     * public class Car {
     *   public Car() {
     *     // instructions for creating a Car instance
     *   }
     * 
     *   public static void main(String[] args) {
     *     // Invoke the constructor
     *     Car ferrari = new Car();
     *   }
     * }
     * 
     * In this example, instead of being declared with a primitive data type like int or boolean, our variable ferrari is declared as a reference data type
     * the value of our variable is a reference to an instance's memory address
     * 
     */

    /*
     * ------------------------ 
     * Classes: Instance Fields
     * ------------------------ 
     * 
     * When an object is created, the constructor sets the initial state of the objec
     * The state is made up of associated data that represents the characteristics of an object
     * 
     * We'll add data to an object by introducing instance variables, or instance fields
     * 
     * We want Car instances of different colors, so we declare a String color instance field.
     * Often times, instance variables are described as a "has-a" relationship with the object
     * 
     * For example Car has a color
     * 
     * public class Car {
     *   // declare fields inside the class by specifying the type and name
     *   String color;
     * 
     *   public Car() {
     *     // instance fields available in scope of constructor method
     *   }
     * 
     *   public static void main(String[] args) {
     *     // body of main method
     *   }
     * }
     * 
     * The declaration is within the class and the instance variable will be available for assignment inside the constructor.
     * 
     * Fields are a type of state each instance will possess
     * One instance may 'red' as its color, another 'blue', etc
     */

    /*
     * -------------------------------
     * Classes: Constructor Parameters
     * -------------------------------
     * 
     * To create objects with dynamic, individual states, we'll use a combination of the constructor method and instance fields
     * 
     * To assign a value to an instance variable, we need to alter our constructor method to include parameters to access the data we to assign to an instance
     * 
     * We've seen a parameter in the main method: String[] args
     * but this is the first time we're using the parameter value within a method body
     * 
     * The Car constructor now has a parameter:
     * 
     * public class Car {
     *   String color;
     *   // constructor method with a parameter
     * 
     *   public Car(String carColor) {
     *     // parameter value assigned to the field
     *     color = carColor;
     *   }
     *   public static void main(String[] args) {
     *     // program tasks
     *   }
     * }
     * 
     * When a String value gets passed into Car(). it is assigned to the parameter carColor
     * Inside the constructor, carColor will be assigned as the value to the instance variable color
     * 
     * Our method also has a signature which defines the name and parameters of the method
     * In the above example, the signature is Car(String carColor)
     */

    /*
     * ----------------------------------
     * Assigning Value to Instance Fields
     * ----------------------------------
     * 
     * Now that our constructor has a parameter, we must pass values into the method call
     * 
     * These values are referred to as argumentsl once they are passed in, they will be used to give the instance fields initial value
     * 
     * Here we create an instance, ferrari, in the main() method with 'red' as its color field:
     * 
     * public class Car {
     *   String color;
     * 
     *   public Car(String carColor) {
     *     // assign parameter value to instance field
     *     color = carColor;
     *   }
     * 
     *   public static void main(String[] args) {
     *     // parameter value supplied when calling constructor
     *     Car ferrari = new Car("red");
     *   }
     * }
     * 
     * We pass the String value "red" to our constructor method call: new Car("red");
     * 
     * The type of the value given to the invocation must match the type declared by the parameter
     * 
     * Inside the constructor, the parameter carColor refers to the value passed in during the invocation: "red"
     * This value is assigned to the instance field color
     * 
     * color has already been declared, so we don't specify the type during assignment
     * 
     * The object, ferrari, holds the state of color as an instance field referencing the value "red"
     * 
     * We access the value of this fields with the dot operator (.):
     * 
     * // accessing a field:
     * // objectName.fieldName
     * 
     * ferrari.color;
     * // "red"
     */

    /*
     * ---------------
     * Multiple Fields
     * ---------------
     * 
     * Objects are not limited to a single instance field
     * 
     * We can declare as many fields as necessary
     * 
     * LEt's change Car instances so the have multiple fields
     * 
     * We'll add a boolean isRunning, that indicates the car engine is on
     * and an int velocity, that indicates the speed at which the car is traveling
     * 
     * public class Car {
     *   String color;
     *   // new fields!
     *   boolean isRunning;
     *   int velocity;
     * 
     *   // new parameters that correspond to the new fields
     *   public Car(String carColor, boolean carRunning, int milesPerHour) {
     *     color = carColor;
     *     // assign new parameters to the new fields
     *     isRunning = carRunning;
     *     velocity = milesPerHour;
     *   }
     * 
     *   public static void main(String[] args) {
     *     // new values passed into the method call
     *     Car ferrari = new Car("red", true, 27);
     *     Car renault = new Car("blue", false, 70);
     * 
     *     System.out.println(renault.isRunning);
     *     // false
     *     System.out.println(ferrari.velocity);
     *     // 27
     *   }
     * }
     */

    /*
     * ------
     * Review
     * ------
     * 
     * Java is an object-oriented programming language where every program has at least one class
     * Programs are often built from many classes and objects, which are the instances of a class
     * 
     * Classes define the state and behavior of their instances
     * Behavior comes from instance fields declared inside the class
     * 
     * Classes are modeled on the real-world things we want to represent in our program
     * 
     * public class Dog {
     *   // instance field
     *   String breed;
     *   // constructor method
     *   public Dog(String dogBreed) {
     *     // value of parameter dogBreed assigned to instance field breed
     *     breed = dogBreed;
     *   }
     *   public static void main(String[] args) {
     *     // create instance:
     *     // use 'new' operator and invoke constructor
     *     Dog fido = new Dog("poodle");
     *     // fields are accessed using:
     *     // the instance name, `.` operator, and the field name
     *     fido.breed
     *     // "poodle"
     *   }
     * }
     */
  }
}