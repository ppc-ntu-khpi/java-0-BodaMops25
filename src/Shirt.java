public class Shirt {
  public int shirtID = 555;
  public String description = "description shirt 1";
  public String colorCode = "green";
  public double price = 45.99;
  public int quantityInStock = 0;
  
  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  }
}