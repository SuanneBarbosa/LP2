package br.suanne.Restaurante.dto;

import br.suanne.Restaurante.model.Funcionario;

public record FuncionarioRequestDTO(String nome, String cpf) {
    public FuncionarioRequestDTO(Funcionario f){
        this(f.getNome(), f.getCpf());
    }
}
