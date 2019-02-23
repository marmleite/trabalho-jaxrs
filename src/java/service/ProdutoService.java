/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.ProdutoDAO;
import java.util.List;
import model.Produto;

public class ProdutoService implements ServiceInterface<Produto>{

    private ProdutoDAO produtoDAO;

    @Override
    public void salvar(Produto obj) {
        produtoDAO.salvar(obj);
    }

    @Override
    public Produto update(Produto obj) {
        return produtoDAO.update(obj);
    }

    @Override
    public void remover(Produto obj) {
        produtoDAO.remover(obj);
    }

    @Override
    public Produto findById(int id) {
        return produtoDAO.findById(id);
    }

    @Override
    public List<Produto> listAll() {
        return produtoDAO.listAll();
    }
    
}
