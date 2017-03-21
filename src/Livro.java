/**
 * Created by willi on 20/03/2017.
 */
public class Livro {

    String nome;
    String descricao;
    double valor;
    String isbn;

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

    public void mostrarDetalhes() {
        System.out.println(this.nome);
        System.out.println(this.descricao);
        System.out.println(this.valor);
        System.out.println(this.isbn);
    }
}
