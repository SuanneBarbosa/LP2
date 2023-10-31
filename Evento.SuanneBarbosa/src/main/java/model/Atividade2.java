package model;

import jakarta.persistence.*;

import java.util.List;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "atividades")
public class Atividade2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAtividade;
    @Column
    private String tipo;
    @Column
    private String data;
    @Column
    private String endereco;

    @Column
    private String nomeOrganizador;



    @ManyToMany(mappedBy = "atividades")
    private List<Participante> participantes;

    public Atividade2(String tipo, String data, String endereco, String nomeOrganizador) {
        this.tipo = tipo;
        this.data = data;
        this.endereco = endereco;
        this.nomeOrganizador = nomeOrganizador;
    }

}
