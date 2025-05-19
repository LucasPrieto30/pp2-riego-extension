
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import com.riego.Evaluador;

public class EvaluadorHumedad extends Evaluador {

    public EvaluadorHumedad() {
        iniciarEvaluaciones();
    }

    @Override
    protected int obtenerMedicion() {
        return new Random().nextInt(100);
    }

    @Override
    protected void iniciarEvaluaciones() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
            	ultimaMedicion = obtenerMedicion();
                debeRegar = ultimaMedicion < umbral;
                notificarObservadores();
            }
        }, 0, 3000);
    }
}
