package br.suanne.Restaurante.controller;

import br.suanne.Restaurante.dto.ClienteRequestDTO;
import br.suanne.Restaurante.dto.ClienteResponseDTO;
import br.suanne.Restaurante.dto.FuncionarioRequestDTO;
import br.suanne.Restaurante.dto.FuncionarioResponseDTO;
import br.suanne.Restaurante.model.Cliente;
import br.suanne.Restaurante.model.Funcionario;
import br.suanne.Restaurante.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("funcionario")
public class FuncionarioController {


    @Autowired
    FuncionarioRepository funcionarioRepository;

    @GetMapping
    public List<FuncionarioResponseDTO> getAll() {
        return funcionarioRepository.findAll().stream().map(FuncionarioResponseDTO::new).toList();

    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void addFuncionario(@RequestBody FuncionarioRequestDTO data){
        funcionarioRepository.save(new Funcionario(data));
    }

    @DeleteMapping("/{id}")
    public void deleteFuncionario(@PathVariable Long id){
        funcionarioRepository.deleteById(id);
    }


    @GetMapping("/{id}")
    public Optional<Funcionario> findFuncionario(@PathVariable Long id){
        Optional<Funcionario> funcionario = funcionarioRepository.findById(id);
        return funcionario;
    }

    @PutMapping("/{id}")
    public void editarFuncionario(@PathVariable Long id, @RequestBody FuncionarioRequestDTO data){
        Funcionario funcionario = new Funcionario(data);
        funcionario.setId(id);
        funcionarioRepository.save(funcionario);
    }

}

