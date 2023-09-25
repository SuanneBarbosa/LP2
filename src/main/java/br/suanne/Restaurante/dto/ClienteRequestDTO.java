package br.suanne.Restaurante.dto;

import br.suanne.Restaurante.model.Cliente;
import br.suanne.Restaurante.model.Endereco;
import br.suanne.Restaurante.model.Prato;

public record ClienteRequestDTO(String nome, Endereco endereco) {
    public ClienteRequestDTO(Cliente c){
        this(c.getNome(), c.getEndereco());
    }
}
