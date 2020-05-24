package atuendo;

import prenda.*;

import java.util.ArrayList;

import java.util.List;

import java.util.Objects;

public class Atuendo {

    List<Prenda> prendas = new ArrayList<Prenda>();

    public void agregarPrenda( Prenda prendaNueva){

    	prendas.add( Objects.requireNonNull(prendaNueva, "prenda no debe ser nula") );

    }

    public List<Prenda> getPrendas() {   return prendas;    }

    public boolean tieneCategoriaValida(Prenda prendaNueva ){

        return !prendas.stream().anyMatch( p -> p.getTipoPrenda().getCategoria().equals(prendaNueva.getTipoPrenda().getCategoria()) );

    }

    public boolean tieneTodasLasCategorias(){

        if( this.cantidadCategorias() == 4 ) return true; else return  false;

    }

    public long cantidadCategorias(){

        return  (long)prendas.stream()
                .filter( p-> p.getTipoPrenda().getCategoria().equals(Categoria.INFERIOR)
                ||  p.getTipoPrenda().getCategoria().equals(Categoria.SUPERIOR)
                ||  p.getTipoPrenda().getCategoria().equals(Categoria.CALZADO)
                 ||  p.getTipoPrenda().getCategoria().equals(Categoria.ACCESORIOS) )
                .count();

    }



}
