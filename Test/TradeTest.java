import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TradeTest {

    @Test
    void addNewProduct() throws ProductAlreadyRegisteredException {
        List<Product> products = Arrays.asList(new Product("5425"));
        Product stock = new Product("4578658");
        Trade todayTrade = new Trade();


    }
}