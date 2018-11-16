package dao;

import java.util.List;
import dao.DAO;
import model.Pedido;

public interface PedidoDAO extends DAO<Pedido> {
        public List<Pedido> findByIdUsuario(int id);
}
