package br.unicamp.ic.inf335.app.inf335_prj05;

import java.net.URL;
import java.util.ArrayList;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    private AnuncianteBean anunciante;
    private AnuncioBean anuncio1;
    private AnuncioBean anuncio2;

    
    public void testApp()
    {
        assertTrue( true );
    }
    public void testAddAnuncio() {
   	 ProdutoBean produto1 = new ProdutoBean("001", "Produto A", "Descrição do Produto A", 100.0, "Novo");
        anuncio1 = new AnuncioBean(produto1, new ArrayList<URL>(), 0.1);

        ProdutoBean produto2 = new ProdutoBean("002", "Produto B", "Descrição do Produto B", 200.0, "Usado");
        anuncio2 = new AnuncioBean(produto2, new ArrayList<URL>(), 0.2);

        ArrayList<AnuncioBean> anuncios = new ArrayList<>();
        anuncios.add(anuncio1);
        anuncios.add(anuncio2);

        anunciante = new AnuncianteBean("Anunciante A", "12345678901", anuncios);
       ProdutoBean produto3 = new ProdutoBean("003", "Produto C", "Descrição do Produto C", 300.0, "Novo");
       AnuncioBean anuncio3 = new AnuncioBean(produto3, new ArrayList<URL>(), 0.3);

       anunciante.addAnuncio(anuncio3);
       assertTrue(3 == anunciante.getAnuncios().size());
   }
    public void testRemoveAnuncio() {
   	 ProdutoBean produto1 = new ProdutoBean("001", "Produto A", "Descrição do Produto A", 100.0, "Novo");
        anuncio1 = new AnuncioBean(produto1, new ArrayList<URL>(), 0.1);

        ProdutoBean produto2 = new ProdutoBean("002", "Produto B", "Descrição do Produto B", 200.0, "Usado");
        anuncio2 = new AnuncioBean(produto2, new ArrayList<URL>(), 0.2);

        ArrayList<AnuncioBean> anuncios = new ArrayList<>();
        anuncios.add(anuncio1);
        anuncios.add(anuncio2);

        anunciante = new AnuncianteBean("Anunciante A", "12345678901", anuncios);
       anunciante.removeAnuncio(0);
       assertEquals(1, anunciante.getAnuncios().size());
       assertEquals(anuncio2, anunciante.getAnuncios().get(0));
   }
    
    public void testValorMedioAnuncios() {
   	 ProdutoBean produto1 = new ProdutoBean("001", "Produto A", "Descrição do Produto A", 100.0, "Novo");
        anuncio1 = new AnuncioBean(produto1, new ArrayList<URL>(), 0.1);

        ProdutoBean produto2 = new ProdutoBean("002", "Produto B", "Descrição do Produto B", 200.0, "Usado");
        anuncio2 = new AnuncioBean(produto2, new ArrayList<URL>(), 0.2);

        ArrayList<AnuncioBean> anuncios = new ArrayList<>();
        anuncios.add(anuncio1);
        anuncios.add(anuncio2);

        anunciante = new AnuncianteBean("Anunciante A", "12345678901", anuncios);
       assertEquals(Double.valueOf(125.0), anunciante.valorMedioAnuncios());
    }
    public void testQuantidadeAnunios() {
   	 ProdutoBean produto1 = new ProdutoBean("001", "Produto A", "Descrição do Produto A", 100.0, "Novo");
        anuncio1 = new AnuncioBean(produto1, new ArrayList<URL>(), 0.1);

        ProdutoBean produto2 = new ProdutoBean("002", "Produto B", "Descrição do Produto B", 200.0, "Usado");
        anuncio2 = new AnuncioBean(produto2, new ArrayList<URL>(), 0.2);

        ArrayList<AnuncioBean> anuncios = new ArrayList<>();
        anuncios.add(anuncio1);
        anuncios.add(anuncio2);

        anunciante = new AnuncianteBean("Anunciante A", "12345678901", anuncios);
       assertEquals(anunciante.getAnuncios().size(), 2);
   }
    
    public void testGetValor() {
   	 ProdutoBean produto1 = new ProdutoBean("001", "Produto A", "Descrição do Produto A", 100.0, "Novo");
        anuncio1 = new AnuncioBean(produto1, new ArrayList<URL>(), 0.1);

        ProdutoBean produto2 = new ProdutoBean("002", "Produto B", "Descrição do Produto B", 200.0, "Usado");
        anuncio2 = new AnuncioBean(produto2, new ArrayList<URL>(), 0.2);

        ArrayList<AnuncioBean> anuncios = new ArrayList<>();
        anuncios.add(anuncio1);
        anuncios.add(anuncio2);

        anunciante = new AnuncianteBean("Anunciante A", "12345678901", anuncios);
       assertEquals(Double.valueOf(90.0), anuncio1.getValor());
   }
}
