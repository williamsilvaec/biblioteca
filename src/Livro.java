/**
 * Created by willi on 20/03/2017.
 */
public class Livro {

    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do livro");
        System.out.println("Nome: "+this.nome);
        System.out.println("Descrição: "+ this.descricao);
        System.out.println("Valor atual: "+this.valor);
        System.out.println("ISBN: "+this.isbn);
        if (this.temAutor()) {
            this.autor.mostrarDetalhes();
        }
        System.out.println("--");
    }

    public void aplicaDescontoDe(double valor) {
        this.valor -= this.valor * valor;
    }

    public boolean temAutor() {
        return this.autor != null;
    }
}
