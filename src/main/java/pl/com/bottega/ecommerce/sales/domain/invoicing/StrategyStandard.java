package pl.com.bottega.ecommerce.sales.domain.invoicing;

import java.math.BigDecimal;

public class StrategyStandard implements StrategyInterface {
	public void set(BigDecimal ratio, String desc) {
		ratio = BigDecimal.valueOf(0.23);
		desc = "23%";
	}

}
