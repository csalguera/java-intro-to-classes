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
  }
}