package service;

import java.util.List;

public interface ServiceInterface<T> {
    
    	public void salvar(T obj);
	public T update(T obj);
	public void remover(T obj);
	public T findById(int id);
	public List<T> listAll();
}
