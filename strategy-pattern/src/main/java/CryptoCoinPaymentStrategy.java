import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CryptoCoinPaymentStrategy implements PaymentStrategy {
    private static final Logger LOGGER = LoggerFactory.getLogger(CryptoCoinPaymentStrategy.class);

    public void pay() {
        LOGGER.info("Customer paid bill by using bitcoin wallet!");
    }
}