package dao;

import model.Cliente;

public interface ClienteDAO extends DAO<Cliente> {

    public Cliente findByCpf(String cpf);
}
