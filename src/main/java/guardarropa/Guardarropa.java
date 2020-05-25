package guardarropa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import atuendo.*;
import prenda.*;

import excepciones.*;

public class Guardarropa {
	
	 List<Atuendo> atuendos = new ArrayList<Atuendo>();
	
	
	
public Stream<Atuendo> sugerenciasAptasTemperatura (   int temperatura   ) {
		
	//if(!tieneTodasLasCategorias( prendas))excepcion();
		
	return  atuendos.stream().filter( a -> a.esAtuendoAptoTemperatura(temperatura) == true  );		
			 
			 
	}
	


	
	

private boolean tieneTodasLasCategorias(List<Prenda> prendas) {
	
	
    Map<Categoria, List<Prenda>> prendasPorCategoria = prendas.stream().collect(Collectors.groupingBy(Prenda::getCategoriaDePrenda));

    return prendasPorCategoria.containsKey(Categoria.SUPERIOR)
        && prendasPorCategoria.containsKey(Categoria.INFERIOR)
        && prendasPorCategoria.containsKey(Categoria.CALZADO)
        && prendasPorCategoria.containsKey(Categoria.ACCESORIOS);
}


}
