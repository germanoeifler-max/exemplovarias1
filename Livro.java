public class Livro {
    private String titulo;
    private int numPags;
    private double valor;

    public Livro(String titulo, int numPags, double valor) {
        this.titulo = titulo;
        this.numPags = numPags;
        this.valor = valor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPags() {
        return this.numPags;
    }

    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
