/**
 * Created by willi on 20/03/2017.
 */
public class Autor {

    String nome;
    String email;
    String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do autor");
        System.out.println("Nome: "+ nome);
        System.out.println("E-mail: "+ email);
        System.out.println("CPF: "+cpf);
    }
}
