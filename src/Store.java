public class Store {
  public Store() {
    System.out.println("I am inside the constructor method.");
  }
  public static void main(String[] args) {
    System.out.println("Start  of the main method.");

    Store lemonadeStand = new Store();

    System.out.println(lemonadeStand);
  }
}