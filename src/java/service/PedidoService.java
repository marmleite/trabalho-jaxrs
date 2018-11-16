package service;

import dao.PedidoDAO;
import java.util.List;
import model.Pedido;

public class PedidoService implements ServiceInteface<Pedido> {

    private PedidoDAO pedidoDAO;

    public PedidoDAO getPedidoDAO() {
        return pedidoDAO;
    }

    public void setPedidoDAO(PedidoDAO pedidoDAO) {
        this.pedidoDAO = pedidoDAO;
    }

    @Override
    public void salvar(Pedido obj) {
        pedidoDAO.salvar(obj);
    }

    @Override
    public Pedido update(Pedido obj) {
        return pedidoDAO.update(obj);
    }

    @Override
    public void remover(Pedido obj) {
        pedidoDAO.remover(obj);
    }

    @Override
    public Pedido findById(int id) {
        return pedidoDAO.findById(id);
    }

    @Override
    public List<Pedido> listAll() {
        return pedidoDAO.listAll();
    }
    
}
