
import java.util.Timer;
import java.util.TimerTask;

import com.riego.Evaluador;

public class EvaluadorHumedadLogger extends Evaluador {

    public EvaluadorHumedadLogger() {
        iniciarEvaluaciones();
    }

    @Override
    protected int obtenerMedicion() {
        return 1; // Siempre mide 1 para forzar activación
    }

    @Override
    protected void iniciarEvaluaciones() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                int medicion = obtenerMedicion();
                debeRegar = medicion < umbral;
                notificarObservadores();
            }
        }, 0, 3000);
    }

}