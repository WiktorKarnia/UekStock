package pl.wkarnia.stock.productcatalog;


import org.junit.jupiter.api.Test;
import pl.wkarnia.stock.pl.wkarnia.stock.productcatalog.ProductCatalogFacade;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ProductCatalogTest {
    @Test
    void itWorks(){
        assertEquals(1,1);
    }

    @Test
    void ItAllowsAddPicture() {
        ProductCatalogFacade api = thereISProductCatalog();

        String id = api.addPicture(
                "Nice picture",
                BigDecimal.valueOf(10.10),
                Arrays.asList("#nice","#picture"),
                "picture1.jpeg"
        );

        thereIsProductWithIdAvailable(api);
    }
    private ProductCatalogFacade thereISProductCatalog() {

    }

    private void thereIsProductWithIdAvailable(ProductCatalogFacade api) {
        assertTrue(api.isProductExists());
    }
}
