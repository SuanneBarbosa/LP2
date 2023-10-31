package model;
import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {


    public static Cliente buscarClientePorCpf(String cpf,List<Cliente> clientes) {

        for (Cliente cliente : clientes) {

            System.out.println(cliente.getCpf()  + " " + cpf);

            if (cliente.getCpf().equals(cpf)) {

                return cliente;
            }
        }
        return null;
    }
}
