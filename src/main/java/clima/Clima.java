package clima;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Clima {
	
	int temperatura;
	
	Instant fecha;
	
	
	
	
	
	
    public boolean esClimaFecha(Instant fecha) {
        return fecha.equals(this.fecha) || this.noSuperaHora(fecha);
    }

    private boolean noSuperaHora(Instant fecha) {
        return fecha.isAfter(this.fecha) && ChronoUnit.HOURS.between(this.fecha, fecha) == 0;
    }
	

}
