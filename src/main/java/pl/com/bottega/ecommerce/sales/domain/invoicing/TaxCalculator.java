package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;
import pl.com.bottega.ecommerce.sharedkernel.Money;

import java.math.BigDecimal;

/**
 * Created by Sasho on 2017-03-12.
 */
public class TaxCalculator {
    public Tax calculateTax (ProductType type, Money price){
        TaxCreator creator;
        switch (type) {
            case DRUG:
                creator = new DrugTaxCreator();
                break;
            case FOOD:
                creator = new FoodTaxCreator();
                break;
            case STANDARD:
                creator = new StandardTaxCreator();
                break;

            default:
                throw new IllegalArgumentException(type + " not handled");
        }
        return creator.createTax(price);
    }
}

