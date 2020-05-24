package test;

import main.java.prenda.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ColorTest {

    TipoPrenda tipoInferior = new TipoPrenda( "pantalon", Categoria.INFERIOR );

    @Test
    public void colorSecundarioTest(){

        Prenda pantalon = new Prenda( tipoInferior, Categoria.INFERIOR, Material.POLIESTER, Color.NEGRO,Color.BLANCO    );

        assertEquals( pantalon.getColorSecundario(), Color.BLANCO);

    }

    @Test
    public void colorSecundarioTest2(){

        Prenda pantalon = new Prenda( tipoInferior, Categoria.INFERIOR, Material.POLIESTER, Color.NEGRO, null    );

        assertEquals( pantalon.getColorSecundario(), null);

    }

    // este Test espera una Excepcion de Tipo Runtime en caso de que no tenga color principal asignado salta la Exception

    @Test(expected = RuntimeException.class)

    public void tieneColorPrimarioiNull() throws RuntimeException {

        Prenda pantalon = new Prenda( tipoInferior, Categoria.INFERIOR, Material.POLIESTER, null, Color.BLANCO    );

        assertEquals( pantalon.getColorPrimario(), Color.AMARILLO);

    }

   @Test (expected = RuntimeException.class)
    public void colorSecundarioTest3(){

        Prenda pantalon = new Prenda( tipoInferior, Categoria.INFERIOR, Material.POLIESTER, Color.NEGRO, Color.BLANCO    );

        pantalon.setColorSecundario(Color.AMARILLO);

    }





}
