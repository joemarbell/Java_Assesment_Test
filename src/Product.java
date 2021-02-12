import java.util.List;

public class Product implements ProductPricingService, HasProductType{

    String id;
    double price;
    String exchange;
    String ticker;
    int quantity;
    int contractCode;

    ProductType productType;

    public Product(String id) {
        this.id = id;
    }

    @Override
    public double price(String exchange, String ticker) {
        return this.price;
    }

    @Override
    public double price(String exchange, String contractCode, int month, int year) {
        return this.price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public ProductType getProductType() {
        return productType;
    }
}
