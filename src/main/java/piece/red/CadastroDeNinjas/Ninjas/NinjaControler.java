package piece.red.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaControler {

    private NinjaService ninjaService;

    public NinjaControler ( NinjaService ninjaService ) {
        this.ninjaService = ninjaService;
    }

    //Mostrar todos os ninjas (READ)
    @GetMapping("/listados")
    public List<NinjaModel> listarNinjas (){
        return ninjaService.listarNinjas();
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
