import java.util.*;

public class App {
    private Scanner entrada;
    private Biblioteca biblioteca;

    public App() {
        entrada = new Scanner(System.in);
        biblioteca = new Biblioteca();
    }

    // Execucao da aplicacao
    public void executar() {
        int opcao;
        do {
            System.out.println("=====================");
            System.out.println("SISTEMA DE BIBLIOTECA");
            menu();
            System.out.print("Digite a opcao desejada: ");
            opcao = entrada.nextInt();
            entrada.nextLine();
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    mostrarTodosLivros();
                    break;
                case 2:
                    cadastrarLivro();
                    break;
                case 3:
                    consultarLivro();
                    break;
                case 99:
                    easterEgg();
                    break;
                default:
                    System.out.println("=====================");
                    System.out.println("Opcao invalida. Redigite, por favor.");
            }
        } while (opcao != 0);
    }

    // Apresenta o menu de opcoes
    private void menu() {
        System.out.println("Opcoes: ");
        System.out.println("[0] Sair");
        System.out.println("[1] Mostrar todos os livros");
        System.out.println("[2] Cadastrar um livro");
        System.out.println("[3] Consultar um livro pelo titulo");
    }

    // Mostra todos os livros cadastrados
    private void mostrarTodosLivros() {
        System.out.println("=====================");
        System.out.println("Mostrar todos os livros: ");
        biblioteca.reset();
        if (!biblioteca.hasNext())
            System.out.println("Nenhum livro cadastrado.");
        else {
            while (biblioteca.hasNext()) {
                Livro aux = biblioteca.next();
                System.out.println("----------------------");
                System.out.println("Titulo: " + aux.getTitulo());
                System.out.println("Numero de paginas: " + aux.getNumPags());
                System.out.println("Valor: " + aux.getValor());
            }
        }
    }

    // Cadastro de um livro
    private void cadastrarLivro() {
        System.out.println("=====================");
        System.out.println("Cadastrar um livro: ");
        System.out.print("Digite o titulo do livro: ");
        String titulo = entrada.nextLine();
        System.out.print("Digite o numero de paginas do livro: ");
        int numPags = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Digite o valor do livro: ");
        double valor = entrada.nextDouble();
        entrada.nextLine();
        Livro novo = new Livro(titulo, numPags, valor);
        biblioteca.cadastraLivro(novo);
    }

    // Consulta de um livro pelo titulo
    private void consultarLivro() {
        System.out.println("=====================");
        System.out.println("Consultar um livro: ");
        System.out.print("Digite o titulo do livro: ");
        String titulo = entrada.nextLine();
        Livro aux = biblioteca.consultaLivroPorTitulo(titulo);
        if (aux == null)
            System.out.println("Livro nao encontrado!");
        else {
            System.out.println("----------------------");
            System.out.println("Titulo: " + aux.getTitulo());
            System.out.println("Numero de paginas: " + aux.getNumPags());
            System.out.println("Valor: " + aux.getValor());
        }
    }

    // Opcao oculta: cadastra alguns livros
    private void easterEgg() {
        System.out.println("=====================");
        System.out.println("Easter egg!!!");
        biblioteca.cadastraLivro(new Livro("Star Wars", 111, 11.11));
        biblioteca.cadastraLivro(new Livro("Vidas Secas", 222, 22.22));
        biblioteca.cadastraLivro(new Livro("Orgulho e Preconceito", 333, 33.33));
    }

}
