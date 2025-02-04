public abstract class State {
    protected String name;
    protected SalesTaxBehavior salesTaxBehavior;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Allows setting the strategy at runtime (dynamically).
     */
    public void setSalesTaxBehavior(SalesTaxBehavior salesTaxBehavior) {
        this.salesTaxBehavior = salesTaxBehavior;
    }

    public abstract void showTax(double value);
}
