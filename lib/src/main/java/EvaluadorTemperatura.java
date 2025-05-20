
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import com.riego.Evaluador;

public class EvaluadorTemperatura extends Evaluador {

    @Override
    protected int obtenerMedicion() {
        return 15 + new Random().nextInt(25); // Temperatura entre 15 y 39
    }
    
    @Override
    public void evaluar() {
    	ultimaMedicion = obtenerMedicion();
        debeRegar = ultimaMedicion > umbral;
        notificarObservadores();
    }
}
