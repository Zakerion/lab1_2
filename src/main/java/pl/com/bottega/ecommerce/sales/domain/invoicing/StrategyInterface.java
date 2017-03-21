package pl.com.bottega.ecommerce.sales.domain.invoicing;

import java.math.BigDecimal;

public interface StrategyInterface {
	void set(BigDecimal ratio, String desc);
}
