package piece.red.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaControler {

    @GetMapping("/boasVindas")
    public String boasVindas() {

        return "Essa é a minha primeira mensagem nessa perereca.";

}

    //Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado.";
    }


    //Mostrar todos ninjas por ID (READ)
    @GetMapping("/todosID")
    public String mostrarTodosNinjasCriadosPorId(){
        return "Todos ninjas criados por ID.";
    }

    //Mostrar todos os ninjas (READ)
    @GetMapping("/listados")
    public String mostrarTodosNinjasListados(){
        return "Todos ninjas listados.";
    }


    //Alterar dados do ninja (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId(){
        return "Alterar ninja por ID";
    }


    //Deletar ninja (DELETE)
    @DeleteMapping("deletarID")
    public String deletarNinjaPorId(){
        return "Ninja deletado por ID.";
    }

}
