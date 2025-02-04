/**
 * SalesTaxBehavior is the Strategy interface.
 * It declares the method for computing sales tax for a given value.
 */
public interface SalesTaxBehavior {
    /**
     * Computes the sales tax on the given sale amount.
     *
     * @param value The sale amount
     * @return The computed sales tax
     */
    double compute(double value);
}
