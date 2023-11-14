package br.suanne.Restaurante.repository;

import br.suanne.Restaurante.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
