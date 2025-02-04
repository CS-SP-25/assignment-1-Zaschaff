public class Hawaii extends State {

    public Hawaii() {
        // Only set the state's name here, not the behavior
        this.name = "Hawaii";
    }

    @Override
    public void showTax(double value) {
        // Defer tax calculation to the Strategy object
        double tax = salesTaxBehavior.compute(value);
        // Print result in the required format
        System.out.printf("The sales tax on $%.2f in %s is $%.2f.%n", value, name, tax);
    }
}
