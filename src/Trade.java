import java.util.List;

public class Trade implements MontrealTradedProducts{

    int quantity;
    List<Product> productList;
    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {
        for (Product products : productList) {
            if (products != product) {
                productList.add(product);
            }
        }
    }


    @Override
    public void trade(Product product, int quantity) {
        for (Product products : productList){
            if (products.equals(product)){
                product.setQuantity(quantity);
            }
        }
    }

    @Override
    public int totalTradedQuantityForDay() {
        int totalTradedQuantityForDay = 0;
        for (Product product : productList){
            totalTradedQuantityForDay += product.getQuantity();
        }
        return totalTradedQuantityForDay;
    }

    @Override
    public double totalValueOfDaysTradedProducts() {
        double totalValueOfDaysTradedProducts = 0.0;
        for (Product product : productList){
            if (product.getProductType().equals("Stock")) {
                totalValueOfDaysTradedProducts += (product.quantity * product.price);
            } else if (product.getProductType().equals("Future")) {
                totalValueOfDaysTradedProducts += (product.quantity * product.price);
            }
            return totalValueOfDaysTradedProducts;
        }
        return 0;
    }

}
