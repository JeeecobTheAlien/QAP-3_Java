public abstract class Shape implements Scalable {
    // Abstract classes implementing interfaces with non-default methods
    // must provide an implementation for those methods or declare them abstract.
    
    // other methods and variables can be added here as needed

    // Provide an implementation for the scale method if not declared abstract
    @Override
    public abstract void scale(double factor);
}
