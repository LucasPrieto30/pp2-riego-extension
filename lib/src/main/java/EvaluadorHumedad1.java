import com.riego.Evaluador;

public class EvaluadorHumedad1 extends Evaluador {
    @Override
    protected int obtenerMedicion() {
        return 1; // Siempre mide 1 para forzar activación y logeo
    }

    @Override
    public void evaluar() {
    	ultimaMedicion = obtenerMedicion();
        debeRegar = ultimaMedicion < umbral;
        notificarObservadores();
    }
}