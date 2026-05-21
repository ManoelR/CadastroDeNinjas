package dev.java10x.CadastroDeNinjas.Missoes;
import org.springframework.web.bind.annotation.*;

@RestController // É uma rota para as API's
@RequestMapping("/missoes") // Mapeia as API's
public class MissoesController {

    // GET -- Manda uma requisição para mostrar as missões
    @GetMapping("/listar")
    public String listarMissoes() {
        return "Missões listadas com sucesso";
    }

    // POST -- Usuário manda uma requisição para criar as missões
    @PostMapping("/criar")
    public String criarMissao() {
        return "Missão criada com sucesso";
    }

    // PUT -- Manda uma requisição para alterar as missões
    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missão alterada com sucesso";
    }

    // DELETE -- Manda uma requisição para deletar a missão
    @DeleteMapping("/Deletar")
    public String deletarMissao() {
        return "Missão deletada com sucesso";
    }
}
