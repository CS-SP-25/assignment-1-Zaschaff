public class Alaska extends State {
    public Alaska() {
        this.name = "Alaska";
    }

    @Override
    public void showTax(double value) {
        double tax = salesTaxBehavior.compute(value);
        System.out.printf("The sales tax on $%.2f in %s is $%.2f.%n",
                value, name, tax);
    }
}
