package prototype;

public class Main {
    public static void main(String[] args) {
        Documento original = new Documento("Relatório", "Conteúdo inicial");
    Documento copia = original.clone();
    copia.setTitulo("Relatório - Cópia");
    
    original.visualize(); 
    copia.visualize();    
    }
}
