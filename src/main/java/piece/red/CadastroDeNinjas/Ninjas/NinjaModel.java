package piece.red.CadastroDeNinjas.Ninjas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import piece.red.CadastroDeNinjas.Missoes.MissaoModel;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;

    @Column (unique = true)
    private String email;
    private int idade;

    @ManyToOne //muitos NINJAS para uma MISSAO
    @JoinColumn(name = "missoes_id")
    //juntar coluna de MISSOES com a de NINJAS, que cria outra coluna com o nome especificado dentre os parenteses
    //o "missoes_id" é a foreing key
    private MissaoModel missoes; //um ninja tem uma unica missao



}