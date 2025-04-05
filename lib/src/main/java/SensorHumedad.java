
import com.riego.EstrategiaEvaluacion;
import com.riego.Sensor;

import java.util.Random;

public class SensorHumedad extends Sensor {

    @Override
    public void medir() {
        Random random = new Random();
        valorMedido = random.nextInt(100);
        System.out.println("Sensor de Humedad: " + valorMedido + "%");
        notificarObservadores();
    }
    
    @Override
    public EstrategiaEvaluacion getEstrategiaEvaluacion() {
        return (valor, umbral) -> valor < umbral;
    }

}

