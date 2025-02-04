public class SalesTaxCalculator {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly two arguments: <StateName> <SaleAmount>");
            return;
        }

        String stateName = args[0];
        double saleAmount;

        try {
            saleAmount = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid sale amount. Please provide a numeric value.");
            return;
        }

        // Determine which State object to create
        State state;
        switch (stateName.toLowerCase()) {
            case "indiana":
                state = new Indiana();
                // Dynamically set the 7% behavior
                state.setSalesTaxBehavior(new SevenPercent());
                break;
            case "alaska":
                state = new Alaska();
                // Dynamically set the no-tax behavior
                state.setSalesTaxBehavior(new NoTax());
                break;
            case "hawaii":
                state = new Hawaii();
                // Dynamically set the 4.5% behavior
                state.setSalesTaxBehavior(new FourPointFivePercent());
                break;
            default:
                System.out.println("Unsupported state. Please enter 'Indiana', 'Alaska', or 'Hawaii'.");
                return;
        }

        // Display the sales tax
        state.showTax(saleAmount);
    }
}
