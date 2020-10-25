package be.ac.umons.Class;

public interface PizzaComponent {
    public abstract String getName();
    public abstract float getPrice();
    public abstract void setName(String name);
    public abstract void setPrice(float price);
    public abstract String toString();
}
