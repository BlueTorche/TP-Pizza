package be.ac.umons.Class;

public interface PizzaComponent {
    public abstract String getName();
    public abstract double getPrice();
    public abstract void setName(String name);
    public abstract void setPrice(double price);
    public abstract String toString();
}
