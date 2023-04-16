## Java Introduction to Classes

## Contents

* Introduction to Classes
* Syntax
* Constructors
* Instance Fields
* Constructor Parameters
* Assigning Values to Instance Fields
* Multiple Fields
* Review

## Introduction to Classes

```
public class Store {
  // instance fields
  String productType;
  int inventoryCount;
  double inventoryPrice;
  
  // constructor method
  public Store(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("lemonade", 42, .99);
    Store cookieShop = new Store("cookies", 12, 3.75);
    
    System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");
    
    System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
  }
}
```

Our text editor contains a complete class definition that we’ll build up as we progress through the lesson.

Run the code to see it in action.

## Syntax

```
public class Store {
  public static void main(String[] args) {
    
  }
}
```

1. In the code editor, create a public `Store` class.

2. Your program will not compile without a `main()` method.

    Define one within `Store`.

## Constructors

```
public class Store {
  
  // new method: constructor!
  public Store() {
    System.out.println("I am inside the constructor method.");
  }
  
  // main method is where we create instances!
  public static void main(String[] args) {
    System.out.println("Start of the main method.");
    
    // create the instance below
    Store lemonadeStand = new Store();
    // print the instance below
    System.out.println(lemonadeStand);
  }
}
```

1. Let’s explore how code execution moves around the file with two methods.

    Add a print statement inside our `Store` constructor with the message: `I am inside the constructor method.`

    We’ll see this message whenever we create an instance of `Store` by calling the constructor.

2. We did not see our constructor message printed because **we haven’t run the code inside the constructor**.

    Inside `main()`, create an instance of `Store` called `lemonadeStand`. Don’t forget the `new` keyword!

    We should see the constructor message.

3. Inside `main()`, print `lemonadeStand` to see how Java represents this instance.

    Review the order of the printed messages:
    1. Running the program invokes `main()`
    2. We create an instance so we move from `main()` to Store()
    3. The code inside Store() runs
    4. When Store() finishes execution, we return to `main()`

## Instance Fields

```
public class Store {
  // declare instance fields here!
  String productType;
  
  // constructor method
  public Store() {
    System.out.println("I am inside the constructor method.");
  }
  
  // main method
  public static void main(String[] args) {
    System.out.println("This code is inside the main method.");
    
    Store lemonadeStand = new Store();
    
    System.out.println(lemonadeStand);
  }
}
```

1. Add some state to our `Store` class.

    Declare a `String` instance field for `productType`.


## Constructor Parameters

```
public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // main method
  public static void main(String[] args) {
    
    
  }
}
```

1. Add the `String` parameter `product` to the `Store()` constructor.

2. Inside of the constructor method, set the instance variable `productType` equal to the `product` parameter.

## Assigning Values to Instance Fields

```
public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("lemonade");
    System.out.println(lemonadeStand.productType);
  }
}
```

1. Inside `main()`, create an instance of `Store` and assign it to the variable `lemonadeStand`. Use `lemonade` as the parameter value.

2. Print the instance field `productType` from `lemonadeStand`.

## Multiple Fields

```
public class Store {
  // instance fields
  String productType;
  int inventoryCount;
  double inventoryPrice;
  
  // constructor method
  public Store(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }
  
  // main method
  public static void main(String[] args) {
    Store cookieShop = new Store("cookies", 12, 3.75);
  }
}
```

1. Add two new instance fields for `Store`.

    `inventoryCount` of type `int`. `inventoryPrice` of type `double`.

2. Update the `Store` constructor method with the new parameters.

    The parameters should be `product`, `count`, and `price`, **in that order**.

    You must use that order and include the types for each parameter.

    For example, `product` is of type `String` because that value is assigned to the instance field `String` `productType`.

3. In the body of the `Store` constructor, assign the parameter values to the appropriate instance fields.

    Inside `main()`, create an instance of `Store` called `cookieShop`.

    `cookieShop` has `cookies` as the product.

    `cookieShop` has `12` cookies to sell and each cookie costs `3.75`.

## Review

```
public class Dog {
  String breed;
  boolean hasOwner;
  int age;
  
  public Dog(String dogBreed, boolean dogOwned, int dogYears) {
    System.out.println("Constructor invoked!");
    breed = dogBreed;
    hasOwner = dogOwned;
    age = dogYears;
  }
  
  public static void main(String[] args) {
    System.out.println("Main method started");
    Dog fido = new Dog("poodle", false, 4);
    Dog nunzio = new Dog("shiba inu", true, 12);
    boolean isFidoOlder = fido.age > nunzio.age;
    int totalDogYears = nunzio.age + fido.age;
    System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
    System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
    System.out.println("The total age of the dogs is: " + totalDogYears);
    System.out.println("Main method finished");
  }
}
```

The text editor contains a `Dog` class. Play around with the code!

Try to add and remove instance fields. Create instances with different values. Access and print different fields.