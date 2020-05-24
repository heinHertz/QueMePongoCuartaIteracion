package test;

import main.java.atuendo.Atuendo;
import main.java.prenda.*;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class AtuendoTest {

    TipoPrenda tipoRemera = new TipoPrenda( "remera", Categoria.SUPERIOR );
    TipoPrenda tipoCalzado = new TipoPrenda( "zapatos", Categoria.CALZADO );


    @Test
    public void testTipoPrendaEnAtuendo(){

        Atuendo atuendo = new Atuendo();

        Prenda sueter = new Prenda( tipoRemera,Categoria.SUPERIOR, Material.LANA, Color.AMARILLO, Color.ROJO );

        assertEquals(atuendo.tieneCategoriaValida(sueter) , true);

    }

   @Test
    public void testTipoPrendaNoValida(){

        Atuendo atuendo = new Atuendo();

        Prenda sueter = new Prenda( tipoRemera,Categoria.SUPERIOR, Material.LANA, Color.AMARILLO, Color.ROJO );
        Prenda chomba = new Prenda( tipoRemera,Categoria.SUPERIOR, Material.LANA, Color.AMARILLO, Color.ROJO );

        atuendo.agregarPrenda(sueter);

        assertEquals(atuendo.tieneCategoriaValida(chomba) , false);

    }

   @Test (expected = RuntimeException.class)
    public void testAtuendoSaltaExceptionPorCategoriaRepetida() {

        Atuendo atuendo = new Atuendo();

        Prenda sueter = new Prenda( tipoRemera,Categoria.SUPERIOR, Material.LANA, Color.AMARILLO, Color.ROJO );
        Prenda zapatos = new Prenda( tipoCalzado, Categoria.SUPERIOR, Material.PLASTICO, Color.NEGRO, null    );

        atuendo.agregarPrenda(sueter);

        atuendo.agregarPrenda(zapatos);

    }

    @Test(expected = RuntimeException.class)
    public void testCalzadoDeberiaFallar(){

        Atuendo atuendo = new Atuendo();

        Prenda calzado = new Prenda( tipoRemera, Categoria.CALZADO, Material.PLASTICO, Color.NEGRO, Color.BLANCO);

        atuendo.agregarPrenda(calzado);


    }

    @Test
    public void testA(){

        Atuendo atuendo = new Atuendo();

        TipoPrenda tipoAnteojos = new TipoPrenda( "anteojos", Categoria.ACCESORIOS );
        TipoPrenda tipoPantalon = new TipoPrenda( "pantalon", Categoria.INFERIOR );

        Prenda sueter = new Prenda( tipoRemera,Categoria.SUPERIOR, Material.LANA, Color.AMARILLO, Color.ROJO );
        Prenda zapatillas = new Prenda( tipoCalzado,Categoria.CALZADO, Material.LANA, Color.AMARILLO, Color.ROJO );
        Prenda anteojos = new Prenda( tipoAnteojos,Categoria.ACCESORIOS, Material.PLASTICO, Color.NEGRO, null);
        Prenda pantalon = new Prenda( tipoPantalon,Categoria.INFERIOR, Material.LANA, Color.NEGRO, Color.MARRON );

        atuendo.agregarPrenda(sueter);
        atuendo.agregarPrenda(zapatillas);
        atuendo.agregarPrenda(anteojos);
        atuendo.agregarPrenda(pantalon);

        assertEquals(  atuendo.tieneTodasLasCategorias(), true);

    }



}