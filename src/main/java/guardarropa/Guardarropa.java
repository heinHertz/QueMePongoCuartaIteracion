package guardarropa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import atuendo.*;
import prenda.*;

public class Guardarropa {
	
	 List<Prenda> prendas = new ArrayList<>();
	
	
	
public Atuendo sugerencias (   List<Prenda> prendas   ) {
		
		
		
		
	}
	
	
	

private boolean tieneTodasLasCategorias(List<Prenda> prendas) {
	
    Map<Categoria, List<Prenda>> prendasPorCategoria = prendas.stream().collect(Collectors.groupingBy(Prenda::getCategoriaDePrenda));

    return prendasPorCategoria.containsKey(Categoria.SUPERIOR)
        && prendasPorCategoria.containsKey(Categoria.INFERIOR)
        && prendasPorCategoria.containsKey(Categoria.CALZADO)
        && prendasPorCategoria.containsKey(Categoria.ACCESORIOS);
}

	

}
