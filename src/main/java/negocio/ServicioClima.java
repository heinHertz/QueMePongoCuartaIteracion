package negocio;

import java.time.Instant;
import java.util.List;

import clima.*;
import excepciones.ExcepcionServicioClima;
import proveedorclima.ProveedorClima;

public class ServicioClima implements InterfazServicioClima{

	  List<Clima> climas;
	 
	  ProveedorClima proveedorClima;
	
	  public ServicioClima(ProveedorClima proveedorClima) {
	        this.proveedorClima = proveedorClima;
	    }
	
	  
	  
	  @Override
	    public Clima getClima(Instant fecha) {

	        Clima climaFecha = this.buscarClimaFecha(fecha);

	        if (climaFecha == null) {
	            try {
	            	
	                this.climas = this.proveedorClima.getWeather();
	            }
	            
	            catch (Exception ex) {
	                ex.printStackTrace();
	                throw new ExcepcionServicioClima("No se puedieron obtener los climas del " + fecha.toString());
	            }
	        }

	        return this.buscarClimaFecha(fecha);
	    }
	  
	  
	  
	  private Clima buscarClimaFecha(Instant fecha) {

	        Clima climaFecha = null;

	        if (this.climas != null) {
	            climaFecha = this.climas
	                    .stream()
	                    .filter(clima -> clima.esClimaFecha(fecha)).findFirst()
	                    .orElse(null);
	        }

	        return climaFecha;
	    }
	  
	  
	  
	  
	 // public Clima getClima(Instant fecha) {  return new Clima(); }
	
}
