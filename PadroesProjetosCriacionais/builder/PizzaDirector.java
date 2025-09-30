package builder;
public class PizzaDirector {
    public void construirPizzaMargherita(PizzaBuilder builder) {
        builder.reset();
        builder.setMassa("fina");
        builder.setQueijo();
    }

    public void construirPizzaPepperoni(PizzaBuilder builder) {
        builder.reset();
        builder.setMassa("grossa");
        builder.setQueijo();
        builder.setPepperoni();
    }
}