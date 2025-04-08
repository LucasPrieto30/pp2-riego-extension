
import com.riego.EstrategiaEvaluacion;
import com.riego.Sensor;

import java.util.Random;

public class SensorHumedad extends Sensor {

    @Override
    public int medir() {
        Random random = new Random();
        valorMedido = random.nextInt(100);
        System.out.println("Sensor de Humedad: " + valorMedido + "%");
        notificarObservadores();
        return valorMedido;
    }
    
    @Override
    public EstrategiaEvaluacion getEstrategiaEvaluacion() {
        return (valor, umbral) -> valor < umbral;
    }

}

