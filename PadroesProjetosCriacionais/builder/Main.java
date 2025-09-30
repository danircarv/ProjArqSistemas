package builder;
public class Main {
    public static void main(String[] args) {
        
        // Uso direto com Builder
        PizzaBuilder builder = new PizzaTradicionalBuilder();
        builder.setMassa("fina");
        builder.setQueijo();
        builder.setPepperoni();
        Pizza pizza1 = builder.getResult();
        pizza1.mostrar();

        // Uso com Diretor
        PizzaDirector diretor = new PizzaDirector();
        PizzaBuilder builder2 = new PizzaTradicionalBuilder();
        diretor.construirPizzaPepperoni(builder2);
        Pizza pizza2 = builder2.getResult();
        pizza2.mostrar();
    }
}
