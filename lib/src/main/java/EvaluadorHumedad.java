
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import com.riego.Evaluador;

public class EvaluadorHumedad extends Evaluador {
    @Override
    protected int obtenerMedicion() {
        return new Random().nextInt(100);
    }
    
    @Override
    public void evaluar() {
    	ultimaMedicion = obtenerMedicion();
        debeRegar = ultimaMedicion < umbral;
        notificarObservadores();
    }

}
