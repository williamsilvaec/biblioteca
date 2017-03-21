public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Livro livro = new Livro();
        livro.setNome("java 8 prático");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.90);
        livro.setIsbn("978-85-66250-46-6");

        livro.mostrarDetalhes();
    }
}
