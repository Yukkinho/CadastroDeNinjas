package piece.red.CadastroDeNinjas;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    Long id;
    String nome;
    String email;
    int idade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //no args constructor (vazio)
    public NinjaModel() {

    }

    //all args constructor (cheio)
    public NinjaModel(Long id, String nome, String email, int idade) {

        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;


    }
}