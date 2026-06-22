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
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas (){
        return ninjaService.listarNinjas();
    }

    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable long id){
        return ninjaService.listarNinjasPorId(id);
    }


    //Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){

        return ninjaService.criarNinja(ninja);

    }

    //Deletar ninja (DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorId(@PathVariable Long id) {
        ninjaService.deletarNinjaPorId(id);
    }

    //Alterar dados do ninja (UPDATE)
    @PutMapping("/atualizar/{id}")
    public NinjaModel atualizarNinja (@PathVariable Long id,@RequestBody NinjaModel ninjaAtualizado) {
        return ninjaService.atualizarNinja(id, ninjaAtualizado);
    }




    //Mostrar todos ninjas por ID (READ)
    @GetMapping("/todosID")
    public String mostrarTodosNinjasCriadosPorId(){
        return "Todos ninjas criados por ID.";
    }




}
