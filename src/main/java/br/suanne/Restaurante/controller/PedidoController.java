package br.suanne.Restaurante.controller;

import br.suanne.Restaurante.dto.CardapioRequestDTO;
import br.suanne.Restaurante.dto.ClienteRequestDTO;
import br.suanne.Restaurante.dto.PedidoRequestDTO;
import br.suanne.Restaurante.dto.PedidoResponseDTO;
import br.suanne.Restaurante.model.Cliente;
import br.suanne.Restaurante.model.Pedido;
import br.suanne.Restaurante.model.Prato;
import br.suanne.Restaurante.repository.CardapioRepository;
import br.suanne.Restaurante.repository.ClienteRepository;
import br.suanne.Restaurante.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("pedido")
public class PedidoController {
    @Autowired
    private PedidoRepository repository;

    @Autowired
    private ClienteRepository repositoryCliente;

    @Autowired
    private CardapioRepository repositoryPratos;

    @GetMapping
    public List<PedidoResponseDTO> getAll(){
        return repository.findAll().stream().map(PedidoResponseDTO::new).toList();
    }

    @PostMapping
    public void savePedido(@RequestBody PedidoRequestDTO data){
        List<Prato> p = new ArrayList<>();
        for (Long prato: data.pratos()) {
            p.add(repositoryPratos.findById(prato).get());
        }
        repository.save(new Pedido(data.title(), repositoryCliente.findById(data.cliente()).get(), p));
    }


    @PutMapping("/{id}")
    public void editarPedido(@PathVariable Long id, @RequestBody PedidoRequestDTO data){
        Pedido pedido = repository.findById(id).get();
        if(pedido != null) {
            List<Prato> p = new ArrayList<>();
            for (Long prato: data.pratos()) {
                p.add(repositoryPratos.findById(prato).get());
            }
            pedido.setCliente(repositoryCliente.findById(data.cliente()).get());
            pedido.setPratos(p);
            pedido.setTitle(data.title());
            repository.save(pedido);
        }
    }

    @DeleteMapping("/{id}")
    public void deletePedido(@PathVariable Long id){
        repository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<Pedido> findPedido(@PathVariable Long id) {
        Optional<Pedido> pedido = repository.findById(id);
        return pedido;
    }


}
