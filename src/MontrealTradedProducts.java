public interface MontrealTradedProducts {
    //Adding a new product
    void addNewProduct(Product product) throws ProductAlreadyRegisteredException;

    //add quantity to registered product
    void trade(Product product, int quantity);

    //returns the total quantity trades so far
    int totalTradedQuantityForDay();

    //returns the total value of today's trades that are in the system
    double totalValueOfDaysTradedProducts();
}
