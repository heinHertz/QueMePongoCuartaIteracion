package test;

import main.java.atuendo.Atuendo;
import main.java.prenda.*;
import org.junit.Test;

public class testTipoPrenda {

    @Test
    public void testTipoPrendaNormal(){

        // quiero especificar qué tipo de prenda estoy cargando (zapatos, camisa de mangas cortas, pantalón, etc).
        // tipo zapatos, zapatillas, chancletas

        TipoPrenda remera = new TipoPrenda( "remera", Categoria.SUPERIOR );

        Prenda chomba = new Prenda( remera, Categoria.SUPERIOR, Material.POLIESTER, Color.FUCSIA,  null    );


    }

    @Test(expected = RuntimeException.class)
    public void testTipoPrenda2CategoriasDiferentesDeberiaFallar(){


        TipoPrenda remera = new TipoPrenda( "remera", Categoria.SUPERIOR );

        Prenda chomba = new Prenda( remera, Categoria.CALZADO, Material.POLIESTER, Color.FUCSIA,  null    );


    }


}
