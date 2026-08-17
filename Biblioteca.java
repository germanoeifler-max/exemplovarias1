import java.util.ArrayList;

/**
 * Classe catalogo de Livros
 */

public class Biblioteca {
    private ArrayList<Livro> acervo;
    private int posicao;    // Indice do livro a acessar

    public Biblioteca() {
        acervo = new ArrayList<Livro>();
        posicao = 0;
    }

    // Reinicia a posicao
    public void reset() {
        posicao = 0;
    }

    // Retorna o livro da posicao atual e incrementa o indice
    public Livro next() {
        if(hasNext()) {
            Livro aux = acervo.get(posicao);
            posicao++;
            return aux;
        }
        return null;
    }

    // Retorna se ha proxima posicao
    public boolean hasNext() {
        if(posicao < acervo.size())
            return true;
        return false;
    }

    /**
     * Cadastra um novo livro na colecao
     * @param novo Novo livro a cadastrar
     * @return true se o livro foi adicionado
     */
    public boolean cadastraLivro(Livro novo) {
        return acervo.add(novo);
    }

    /**
     * Consulta um livro pelo seu titulo
     * @param titulo Titulo do livro a ser consultado
     * @return livro com o titulo indicado ou null se nao existir
     */
    public Livro consultaLivroPorTitulo(String titulo) {
        for(Livro aux : acervo) {
            if(aux.getTitulo().equals(titulo))
                return aux;
        }
        return null;
    }

}
