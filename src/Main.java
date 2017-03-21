public class Main {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("José da Silva");
        autor.setEmail("silva@gmail.com");
        autor.setCpf("123.345.453-90");

        Livro livro = new Livro();
        livro.setNome("java 8 prático");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.90);
        livro.aplicaDescontoDe(0.1);
        livro.setIsbn("978-85-66250-46-6");
        livro.setAutor(autor);

        livro.mostrarDetalhes();

    }
}
