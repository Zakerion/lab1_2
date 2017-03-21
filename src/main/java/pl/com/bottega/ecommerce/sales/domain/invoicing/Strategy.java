package pl.com.bottega.ecommerce.sales.domain.invoicing;

import java.math.BigDecimal;

public class Strategy implements StrategyInterface {
	public void set(BigDecimal ratio, String desc, RequestItem item) {
		switch (item.getProductData().getType()) {
		case DRUG:
			ratio = BigDecimal.valueOf(0.05);
			desc = "5% (D)";
			break;
		case FOOD:
			ratio = BigDecimal.valueOf(0.07);
			desc = "7% (F)";
			break;
		case STANDARD:
			ratio = BigDecimal.valueOf(0.23);
			desc = "23%";
			break;

		default:
			throw new IllegalArgumentException(item.getProductData().getType() + " not handled");
		}
	}

}
