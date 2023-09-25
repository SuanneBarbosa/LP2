package br.suanne.Restaurante.controller;

import br.suanne.Restaurante.dto.ClienteRequestDTO;
import br.suanne.Restaurante.dto.ClienteResponseDTO;
import br.suanne.Restaurante.model.Cliente;
import br.suanne.Restaurante.repository.ClienteRepository;
import br.suanne.Restaurante.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;



    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<ClienteResponseDTO> getAll(){
        return clienteRepository.findAll().stream().map(ClienteResponseDTO::new).toList();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void addCliente(@RequestBody ClienteRequestDTO data){
        clienteRepository.save(new Cliente(data));
    }

    @PutMapping("/{id}")
    public void editarCliente(@PathVariable Long id, @RequestBody ClienteRequestDTO data){
        Cliente cliente = new Cliente(data);
        cliente.setId(id);
        clienteRepository.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Long id){
        clienteRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<Cliente> findCliente(@PathVariable Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente;
    }
}
