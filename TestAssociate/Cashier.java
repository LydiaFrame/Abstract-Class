// The Cashier class extends the Associate class, representing a cashier in the system
public class Cashier extends Associate {

    // Constructor to initialize the cashier's name
    public Cashier(String name) {
        super(name); // Calls the constructor of the superclass (Associate) to set the name
    }

    // Overrides the abstract Call method from the Associate class
    @Override
    public void Call() {
        // Prints a message indicating the cashier should be called for help
        System.out.println("Call " + getName() + " the cashier for help.");
    }
}
