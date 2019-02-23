/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.Produto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcelo
 */
public class ProdutoServiceTest {
    
    public ProdutoServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of salvar method, of class ProdutoService.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        Produto obj = null;
        ProdutoService instance = new ProdutoService();
        instance.salvar(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ProdutoService.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Produto obj = null;
        ProdutoService instance = new ProdutoService();
        Produto expResult = null;
        Produto result = instance.update(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remover method, of class ProdutoService.
     */
    @Test
    public void testRemover() {
        System.out.println("remover");
        Produto obj = null;
        ProdutoService instance = new ProdutoService();
        instance.remover(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class ProdutoService.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        ProdutoService instance = new ProdutoService();
        Produto expResult = null;
        Produto result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listAll method, of class ProdutoService.
     */
    @Test
    public void testListAll() {
        System.out.println("listAll");
        ProdutoService instance = new ProdutoService();
        List<Produto> expResult = null;
        List<Produto> result = instance.listAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
