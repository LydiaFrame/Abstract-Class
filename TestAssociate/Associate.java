// Abstract class representing a generic associate in the system
public abstract class Associate {

    // Instance variable to store the name of the associate
    private String name;

    // Constructor to initialize the name of the associate
    public Associate(String name) {
        this.name = name;
    }

    // Abstract method that must be implemented by subclasses
    public abstract void Call();

    // Getter method to access the name of the associate
    public String getName() {
        return name; 
    }
}
