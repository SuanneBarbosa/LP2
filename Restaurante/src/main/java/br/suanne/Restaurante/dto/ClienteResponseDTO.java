package br.suanne.Restaurante.dto;

import br.suanne.Restaurante.model.Cliente;
import br.suanne.Restaurante.model.Endereco;

public record ClienteResponseDTO(Long id, String nome, Endereco endereco/*, List<PedidoResponseDTO> pedidos*/) {
    public ClienteResponseDTO(Cliente cliente){
        this(cliente.getId(), cliente.getNome(), cliente.getEndereco()/*, cliente.getPedidos().stream().map(PedidoResponseDTO::new).toList()*/);
    }
}
