package dao;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import model.Produto;

@ApplicationScoped
@Named("produtoDao")
public class ProdutoDAOImpl extends GenericDAO<Produto> implements ProdutoDAO {

    public ProdutoDAOImpl() {
        super(Produto.class);
    }
}
