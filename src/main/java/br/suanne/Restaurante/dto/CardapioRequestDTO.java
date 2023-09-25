package br.suanne.Restaurante.dto;

import br.suanne.Restaurante.model.Prato;

public record CardapioRequestDTO(String titulo, String descricao, Double preco) {
 public CardapioRequestDTO(Prato p){
     this(p.getTitulo(), p.getDescricao(), p.getPreco());
     }

}
