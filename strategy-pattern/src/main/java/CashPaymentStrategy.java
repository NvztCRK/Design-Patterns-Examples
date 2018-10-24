import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CashPaymentStrategy implements PaymentStrategy {
    private static final Logger LOGGER = LoggerFactory.getLogger(CashPaymentStrategy.class);

    public void pay() {
        LOGGER.info("Customer paid bill by using 100$!");
    }
}
