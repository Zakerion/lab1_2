package pl.com.bottega.ecommerce.sales.domain.invoicing;

import java.math.BigDecimal;

public class StrategyFood implements StrategyInterface {
	public void set(BigDecimal ratio, String desc) {
		ratio = BigDecimal.valueOf(0.07);
		desc = "7% (F)";
	}

}
