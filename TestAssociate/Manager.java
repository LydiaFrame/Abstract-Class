// The Manager class extends the Associate class, representing a manager in the system
public class Manager extends Associate {

    // Constructor to initialize the manager's name
    public Manager(String name) {
        super(name); // Calls the constructor of the superclass (Associate) to set the name
    }

    // Overrides the abstract Call method from the Associate class
    @Override
    public void Call() {
        // Prints a message indicating the manager should be called for help
        System.out.println("Call " + getName() + " the manager for help.");
    }
}

