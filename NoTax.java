/**
 * NoTax implements SalesTaxBehavior.
 * This class represents a "no tax" strategy (e.g. Alaska).
 */
public class NoTax implements SalesTaxBehavior {

    /**
     * Returns zero, indicating there is no sales tax.
     */
    @Override
    public double compute(double value) {
        // No sales tax
        return 0.0;
    }
}
