package br.suanne.Restaurante.dto;

import br.suanne.Restaurante.model.Funcionario;

public record FuncionarioResponseDTO(String nome, Long id, String cpf) {
    public FuncionarioResponseDTO(Funcionario f){
        this(f.getNome(), f.getId(), f.getCpf());
    }
}
