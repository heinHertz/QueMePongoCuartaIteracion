package test;

import com.sun.corba.se.spi.logging.CORBALogDomains;
import main.java.prenda.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PrendaTest {

    public TipoPrenda remera = new TipoPrenda( "remera", Categoria.SUPERIOR );
    public TipoPrenda pantalon = new TipoPrenda( "pantalon", Categoria.INFERIOR );

    //test que espera una exception
    @Test(expected = RuntimeException.class)
    public void testPrendaCategoriaNULL(){

        Prenda pantalon1 = new Prenda( pantalon, null, Material.POLIESTER, Color.NEGRO,Color.BLANCO    );

    }

    @Test
    public void testPrendaColorSecundarioDiferentes(){

        Prenda pantalonAdidas = new Prenda( pantalon, Categoria.INFERIOR, Material.POLIESTER, Color.NEGRO,null   );

        pantalonAdidas.setColorSecundario(Color.BLANCO);

        assertEquals(  pantalonAdidas.getColorSecundario() , Color.BLANCO);
    }
    @Test
    public void testPrendaPerteneceACategoria(){

        Prenda pantalonAdidas = new Prenda( pantalon, Categoria.INFERIOR, Material.POLIESTER, Color.NEGRO,null   );

        assertEquals( pantalonAdidas.prendaPerteneceACategoria(Categoria.INFERIOR) , true);

    }

    @Test
    public void testPrendaDistintosDeberiaFallar(){

        Prenda pantalonAdidas = new Prenda( pantalon, Categoria.INFERIOR, Material.POLIESTER, Color.NEGRO,null   );

        assertNotEquals( pantalonAdidas.getColorPrimario(), Color.BLANCO);
    }

    //  TEST  QUE ESPERA UNA EXCEPTION POR FALLA DE COLOR PRIMARIO
    @Test(expected = RuntimeException.class)
    public void testPrendaColorPrincipalNullSaltaException(){

        Prenda pantalon1 = new Prenda( pantalon, Categoria.INFERIOR, Material.POLIESTER, null,  null    );

    }

    @Test(expected = RuntimeException.class)
    public void testPrendaCategoriaNullSaltaException(){

        Prenda pantalonAdidas = new Prenda( pantalon, null, Material.POLIESTER, Color.NEGRO,  null    );

    }
    @Test(expected = RuntimeException.class)
    public void testPrendaMaterialNullSaltaException(){

        Prenda pantalonAdidas = new Prenda( pantalon, Categoria.INFERIOR, null, Color.NEGRO,  null    );

    }

    @Test(expected = RuntimeException.class)
    public void testPrendaTipoPrendaNullSaltaException(){

        Prenda pantalonAdidas = new Prenda( null,Categoria.SUPERIOR , Material.POLIESTER, Color.NEGRO,  null    );

    }


}
