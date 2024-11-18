// The Bagger class extends the Associate class, representing a bagger in the system
public class Bagger extends Associate {

    // Constructor to initialize the bagger's name
    public Bagger(String name) {
        super(name); // Calls the constructor of the superclass (Associate) to set the name
    }

    // Overrides the abstract Call method from the Associate class
    @Override
    public void Call() {
        // Prints a message indicating the bagger should be called for help
        System.out.println("Call " + getName() + " the bagger for help.");
    }
}

