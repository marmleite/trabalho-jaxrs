package dao;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Cliente;

@ApplicationScoped
@Named("clienteDao")
public class ClienteDAOImpl extends GenericDAO<Cliente> implements ClienteDAO {

    public ClienteDAOImpl() {
        super(Cliente.class);
    }

    /**
     *
     * @param cpf
     * @return
     */
    @Override
    public Cliente findByCpf(String cpf) {
        EntityManager em = emf.createEntityManager();
		Query query;
        query = em
                .createQuery("select u from Usuario u where u.cpf=:cpf");
		query.setParameter("cpf", cpf);
		return (Cliente) query.getSingleResult();
	}
    
}
