package dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.transaction.UserTransaction;

@ManagedBean(name = "genericDao")
public class GenericDAO<T> implements DAO<T>, Serializable {
	private static final long serialVersionUID = 1L;

	@PersistenceUnit(unitName = "trabalhoweb")
	protected EntityManagerFactory emf;

	@Resource
	private UserTransaction utx;

	protected Class<T> classe;

	public GenericDAO() {
	}

	public GenericDAO(Class<T> classe) {
		this.classe = classe;
	}

	public void salvar(T obj) {
		EntityManager em = emf.createEntityManager();
		try {
			utx.begin();
			em.joinTransaction();
			boolean committed = false;
			try {
				em.persist(obj);
				utx.commit();
				committed = true;
			} finally {
				if (!committed)
					utx.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

	@Override
	public T update(T obj) {
		EntityManager em = emf.createEntityManager();
		try {
			utx.begin();
			em.joinTransaction();
			boolean committed = false;
			try {
				obj = em.merge(obj);
				utx.commit();
				committed = true;
			} finally {
				if (!committed)
					utx.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return obj;
	}

	@Override
	public void remover(T obj) throws IllegalStateException{
		EntityManager em = emf.createEntityManager();
		try {
			utx.begin();
			em.joinTransaction();
			boolean committed = false;
			try {
				obj = em.merge(obj);
				em.refresh(obj);
				em.remove(obj);
				utx.commit();
				committed = true;
			} finally {
				if (!committed)
					utx.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

	@Override
	public T findById(long id) {
		EntityManager em = emf.createEntityManager();
		return em.find(classe, id);
	}

	@Override
	public T findById(int id) {
		EntityManager em = emf.createEntityManager();
		return em.find(classe, id);
	}
	@Override
	public T findByIdInteger(Integer id) {
		EntityManager em = emf.createEntityManager();
		return em.find(classe, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> listAll() {
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("SELECT a from " + classe.getSimpleName()
				+ " a order by a.id DESC");
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> findByName(String nome) {
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("SELECT a from " + classe.getSimpleName()
				+ " where a.nome like concat('%', :nome, '%')");
		query.setParameter("nome", nome);
		return query.getResultList();
	}

}
