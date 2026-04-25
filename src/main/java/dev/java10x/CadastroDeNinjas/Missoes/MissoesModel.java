package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data // Criar os GETTERS e SETTERS automáticamente
@NoArgsConstructor // Criar construtor sem argumentos // O Lombok faz automáticamente
@AllArgsConstructor // Criar construtor com todos os argumentos // ^-^
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeDaMissao;

    private String dificuldade;

    // @OneToMany -- Uma missão pode ter vários ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;







}


