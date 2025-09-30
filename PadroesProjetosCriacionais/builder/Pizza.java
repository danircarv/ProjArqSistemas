package builder;
public class Pizza {
    private String massa;
    private boolean queijo;
    private boolean pepperoni;

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public void setQueijo(boolean queijo) {
        this.queijo = queijo;
    }

    public void setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
    }

    public void mostrar() {
        System.out.println("Pizza - Massa: " + massa + 
                         ", Queijo: " + queijo + 
                         ", Pepperoni: " + pepperoni);
    }
}