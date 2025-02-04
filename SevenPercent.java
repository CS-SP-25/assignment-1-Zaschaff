/**
 * SevenPercent implements SalesTaxBehavior.
 * This class represents a strategy that applies a 7% sales tax.
 */
public class SevenPercent implements SalesTaxBehavior {

    /**
     * Returns 7% of the provided sale amount.
     */
    @Override
    public double compute(double value) {
        // 7% sales tax
        return value * 0.07;
    }
}
