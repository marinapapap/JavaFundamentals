class PriceDisplay {
    public static void main(String[] args) {
      String itemName = "Coffee Machine";
      Double itemPrice = 15.99;

      System.out.printf("The price for the item %s is %,.2f \n", itemName, itemPrice);
    }
  }