package dev.java10x.CadastroDeNinjas.Ninjas;


import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


// JPA = Java Persistence API
// Entity ele transforma uma classe comum em uma entidade do Banco de dados
@Entity
@Table(name = "tb_cadastro")
@Data // Criar os GETTERS e SETTERS automáticamente
@NoArgsConstructor // Criar construtor sem argumentos // O Lombok faz automáticamente
@AllArgsConstructor // Criar construtor com todos os argumentos // ^-^

public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true) // coluna de e-mail única. O e-mail será único por usuário
    private String email;

    private int idade;

    // @ManyToOne -- um ninja tem uma unica missão
    @ManyToOne
    @JoinColumn(name = "missoes_id")  // @JoinColumn -- Vai juntar a coluna de missoes com a de ninja  // missoes_id -- Foreing key ou chave estrangeira.
    private MissoesModel missoes;


}
