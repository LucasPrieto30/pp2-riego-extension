
import java.util.Random;

import com.riego.EstrategiaEvaluacion;
import com.riego.Sensor;

public class SensorTemperatura extends Sensor {

    @Override
    public int medir() {
        Random random = new Random();
        valorMedido = random.nextInt(40);
        System.out.println("SensorTemperatura: " + valorMedido + "°C");
        notificarObservadores();
        return valorMedido;
    }

    @Override
    public EstrategiaEvaluacion getEstrategiaEvaluacion() {
        return (valor, umbral) -> valor > umbral;
    }
}