
import java.util.Timer;
import java.util.TimerTask;

import com.riego.Evaluador;

public class EvaluadorHumedadLogger extends Evaluador {
    @Override
    protected int obtenerMedicion() {
        return 1; // Siempre mide 1 para forzar activación
    }

    
    @Override
    public void evaluar() {
    	ultimaMedicion = obtenerMedicion();
        debeRegar = ultimaMedicion < umbral;
        notificarObservadores();
    }
}