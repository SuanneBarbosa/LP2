package br.suanne.Restaurante.dto;

import br.suanne.Restaurante.model.Cliente;
import br.suanne.Restaurante.model.Pedido;
import br.suanne.Restaurante.model.Prato;

import java.util.List;

public record PedidoRequestDTO(String title, Long cliente, List<Long> pratos) {
//    public PedidoRequestDTO(Pedido p){
//        this(p.getTitle(),p.getCliente().getId(),p.getPratos().stream().map((Prato::new).toList()));
//    }
}
