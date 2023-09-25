package br.suanne.Restaurante.model;
import br.suanne.Restaurante.dto.FuncionarioRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "funcionarios")
@Entity(name = "funcionarios")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;


    public Funcionario(FuncionarioRequestDTO Data) {

        this.nome = nome;
        this.cpf = cpf;
    }
}
