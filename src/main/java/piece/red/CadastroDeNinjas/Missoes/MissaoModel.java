package piece.red.CadastroDeNinjas.Missoes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import piece.red.CadastroDeNinjas.Ninjas.NinjaModel;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissaoModel {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String rank;
    private String descricao;

    @OneToMany(mappedBy = "missoes") // uma MISSAO para muitos NINJAS
    private List<NinjaModel> ninjas;

}