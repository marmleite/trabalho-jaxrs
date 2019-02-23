/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.ClienteDAO;
import java.util.List;
import model.Cliente;

public class ClienteService implements ServiceInterface<Cliente> {

    private ClienteDAO clienteDAO;

    @Override
    public void salvar(Cliente obj) {
        clienteDAO.salvar(obj);
    }

    @Override
    public Cliente update(Cliente obj) {
        return clienteDAO.update(obj);
    }

    @Override
    public void remover(Cliente obj) {
        clienteDAO.remover(obj);
    }

    @Override
    public Cliente findById(int id) {
        return clienteDAO.findById(id);
    }

    @Override
    public List<Cliente> listAll() {
        return clienteDAO.listAll();
    }
    
}
