package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Pedido;

public class PedidoDAOImpl extends GenericDAO<Pedido> implements PedidoDAO {

    public PedidoDAOImpl() {
        super(Pedido.class);
    }
    
    @Override
    public List<Pedido> findByIdUsuario(int id)
    {
        EntityManager em = emf.createEntityManager();
		Query query = em
				.createQuery("select u from Pedido u where u.pedidousr_id = :pedidousr_id");
		query.setParameter("pedidousr_id", id);
		return query.getResultList();
    }
}
