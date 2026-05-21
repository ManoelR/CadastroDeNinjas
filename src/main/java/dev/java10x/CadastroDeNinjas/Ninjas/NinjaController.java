package dev.java10x.CadastroDeNinjas.Ninjas;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

    // Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja Criado";
    }

    // Mostrar todos os ninjas ninja (CREATE)
    @GetMapping("/listar")
    public String mostrarTodosOsNinjas() {
        return "Mostrar Todos os Ninjas";
    }

    // Mostar ninja por ID (READ)
    @GetMapping("/listarID")
    public String mostrarTodosOsNinjasPorId() {
        return "Mostrar Ninja Por ID";
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String aleterarNinjaPorId() {
        return "Alterar Ninja por ID";
    }

    // Deletar ninja (DELETE)
    @DeleteMapping("/DeletarID")
    public String deletarNinjaPorId() {
        return "Ninja Deletado por ID";
    }


}
