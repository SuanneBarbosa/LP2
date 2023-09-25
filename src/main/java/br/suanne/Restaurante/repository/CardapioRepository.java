package br.suanne.Restaurante.repository;

import br.suanne.Restaurante.model.Prato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardapioRepository extends JpaRepository<Prato, Long> {
}
