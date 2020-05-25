package prenda;


import java.util.Objects;

public class Prenda {

    TipoPrenda tipoPrenda;

  //  Categoria categoria;

    Material material;

    Color colorPrimario;

    Color colorSecundario;
    
    Trama trama = Trama.LISA;

    public Prenda( TipoPrenda tipoPrenda, Material material, Color colorPrimario,Color colorSecundario, Trama trama){

    	this.tipoPrenda = Objects.requireNonNull(tipoPrenda, "tipo de prenda es obligatorio");
    	
    	this.material = Objects.requireNonNull(material, "material es obligatorio");
    			  
    	this.colorPrimario = Objects.requireNonNull(colorPrimario, "color es obligatorio");
    	
    	this.colorSecundario = Objects.requireNonNull(colorSecundario, "color es obligatorio");
    	

    	this.trama = Objects.requireNonNull(trama, "trama es obligatorio");
        

    }

    
    
    public void setTipoPrenda(TipoPrenda tipoPrenda ) {    	    	
  	  this.tipoPrenda = Objects.requireNonNull(tipoPrenda, "tipoPrenda es obligatorio");
     }

    
    public void setMaterial(Material material ) {
    	this.material = Objects.requireNonNull(material, "material no debe ser nulo");
    }

    

    public void setColorPrimario(Color colorPrimario) {
    	this.colorPrimario = Objects.requireNonNull(colorPrimario, "color es obligatorio");
    }

    
    public void setColorSecundario(Color colorSecundario) {
    	this.colorSecundario = Objects.requireNonNull(colorSecundario, "color es obligatorio no nulo");
    }

//    public boolean prendaPerteneceACategoria(Categoria categoria){
//        if(this.getCategoria().equals(categoria))
//            return true;
//        else return false;
//    }

   


    public Color getColorPrimario() {
        return this.colorPrimario;
    }

    public TipoPrenda getTipoPrenda() {
		return tipoPrenda;
	}



    public Categoria getCategoriaDePrenda() {
		return tipoPrenda.getCategoria();
	}


	public Color getColorSecundario() {
        return colorSecundario;
    }

//	 public boolean poseeCategoria(Categoria categoria) {
//	        return this.tipoPrenda.poseeCategoria(categoria);
//	    }

    // ESTO SIRVE SI AL COMPARAR DOS OBJETOS PRENDA , SON IGUALES SI TIENEN LAS MISMAS ATRIBUTOS CON LOS MISMOS VALORES
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prenda)) return false;
        Prenda prenda = (Prenda) o;
        return  tipoPrenda.equals(prenda.tipoPrenda) &&
                colorPrimario.equals(prenda.colorPrimario) &&
                Objects.equals(colorSecundario, prenda.colorSecundario) &&
                material == prenda.material;
    	}


}



