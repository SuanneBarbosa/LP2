package br.suanne.Restaurante.controller;

import br.suanne.Restaurante.dto.CardapioRequestDTO;
import br.suanne.Restaurante.dto.CardapioResponseDTO;
import br.suanne.Restaurante.model.Prato;
import br.suanne.Restaurante.repository.CardapioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Arrays;

@RestController
@RequestMapping("cardapio")
public class CardapioController {
    @Autowired
    CardapioRepository cardapioRepository;

    @GetMapping
    public List<CardapioResponseDTO> getAll() {
        return cardapioRepository.findAll().stream().map(CardapioResponseDTO::new).toList();
    }

    @PostMapping
    public void addPrato(@RequestBody CardapioRequestDTO data){

        cardapioRepository.save(new Prato(data));
    }

    @PutMapping("/{id}")
    public void editarPrato(@PathVariable Long id, @RequestBody CardapioRequestDTO data){
        Prato prato = new Prato(data);
        prato.setId(id);
        cardapioRepository.save(prato);
    }

    @DeleteMapping("/{id}")
    public void deletePrato(@PathVariable Long id){
        cardapioRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Prato findPrato(@PathVariable Long id) {
        cardapioRepository.findById(id);
        return null;
    }
}
