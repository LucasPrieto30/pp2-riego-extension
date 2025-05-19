
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import com.riego.Evaluador;

public class EvaluadorTemperatura extends Evaluador {

    public EvaluadorTemperatura() {
        iniciarEvaluaciones();
    }

    @Override
    protected int obtenerMedicion() {
        return 15 + new Random().nextInt(25); // Temperatura entre 15 y 39
    }

    @Override
    protected void iniciarEvaluaciones() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
            	ultimaMedicion = obtenerMedicion();
                debeRegar = ultimaMedicion > umbral;
                notificarObservadores();
            }
        }, 0, 3000);
    }
}
