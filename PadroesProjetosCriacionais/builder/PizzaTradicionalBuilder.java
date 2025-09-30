package builder;
public class PizzaTradicionalBuilder implements PizzaBuilder {
    private Pizza pizza;

    public PizzaTradicionalBuilder() {
        this.reset();
    }

    public void reset() {
        this.pizza = new Pizza();
    }

    public void setMassa(String tipo) {
        pizza.setMassa(tipo);
    }

    public void setQueijo() {
        pizza.setQueijo(true);
    }

    public void setPepperoni() {
        pizza.setPepperoni(true);
    }

    public Pizza getResult() {
        Pizza resultado = this.pizza;
        this.reset();
        return resultado;
    }
}