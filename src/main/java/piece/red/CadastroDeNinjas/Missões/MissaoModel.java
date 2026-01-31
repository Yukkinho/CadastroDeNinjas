package piece.red.CadastroDeNinjas.Missões;

import jakarta.persistence.*;
import piece.red.CadastroDeNinjas.Ninjas.NinjaModel;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissaoModel {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String rank;
    private String descricao;

    @OneToMany(mappedBy = "missoes") // uma MISSAO para muitos NINJAS
    private List<NinjaModel> ninjas;






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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String email) {
        this.rank = email;
    }


    //no args constructor (vazio)
    public MissaoModel() {

    }

    //all args constructor (cheio)
    public MissaoModel(Long id, String nome, String rank, String descricao) {

        this.id = id;
        this.nome = nome;
        this.rank = rank;
        this.descricao = descricao;


    }
}