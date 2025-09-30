package builder;
public interface PizzaBuilder {
    void reset();
    void setMassa(String tipo);
    void setQueijo();
    void setPepperoni();
    Pizza getResult();
}
