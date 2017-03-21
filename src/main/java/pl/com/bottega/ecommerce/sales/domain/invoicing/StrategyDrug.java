package pl.com.bottega.ecommerce.sales.domain.invoicing;

import java.math.BigDecimal;

public class StrategyDrug implements StrategyInterface {
	public void set(BigDecimal ratio, String desc) {
		ratio = BigDecimal.valueOf(0.05);
		desc = "5% (D)";
	}
}
