package prototype;

public class Documento implements Clonavel {
    private String titulo;
    private String conteudo;

    
    public Documento(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

  
    private Documento(Documento original) {
        this.titulo = original.titulo;
        this.conteudo = original.conteudo;
    }

    @Override
    public Documento clone() {
        return new Documento(this);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void visualize() {
        System.out.println("Titulo: " + titulo + " Conteudo: " + conteudo);
    }
}

