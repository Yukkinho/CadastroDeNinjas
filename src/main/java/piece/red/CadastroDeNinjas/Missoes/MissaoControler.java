package piece.red.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissaoControler {

   @GetMapping("/listar")
    public String listarMissao() {
       return "Missao listada com sucesso";
   }

   @PostMapping("/criar")
    public String criarMissao() {
       return "Missao criada com sucesso";
   }

   @PutMapping("/alternar")
    public String alternarMissao(){
       return "Missao alternada com sucesso";
   }
}
