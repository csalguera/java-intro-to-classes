## Java Introduction to Classes

## Store

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

In the code editor, create a public `Store` class.

Your program will not compile without a `main()` method.

Define one within `Store`.

Let’s explore how code execution moves around the file with two methods.

Add a print statement inside our Store constructor with the message: I am inside the constructor method.

We’ll see this message whenever we create an instance of Store by calling the constructor.

We did not see our constructor message printed because we haven’t run the code inside the constructor.

Inside main(), create an instance of Store called lemonadeStand. Don’t forget the new keyword!

We should see the constructor message.

Inside main(), print lemonadeStand to see how Java represents this instance.

Review the order of the printed messages:

Running the program invokes main()
We create an instance so we move from main() to Store()
The code inside Store() runs
When Store() finishes execution, we return to main()

Add some state to our Store class.

Declare a String instance field for productType.

Add the String parameter product to the Store() constructor.

Inside main(), create an instance of Store and assign it to the variable lemonadeStand. Use "lemonade" as the parameter value.

Add two new instance fields for Store.

inventoryCount of type int. inventoryPrice of type double.

Update the Store constructor method with the new parameters.

The parameters should be product, count, and price, in that order.

You must use that order and include the types for each parameter.

For example, product is of type String because that value is assigned to the instance field String productType.

In the body of the Store constructor, assign the parameter values to the appropriate instance fields.

Inside main(), create an instance of Store called cookieShop.

cookieShop has "cookies" as the product.

cookieShop has 12 cookies to sell and each cookie costs 3.75.