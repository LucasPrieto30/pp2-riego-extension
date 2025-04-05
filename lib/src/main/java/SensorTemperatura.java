
import java.util.Random;

import com.riego.EstrategiaEvaluacion;
import com.riego.Sensor;

public class SensorTemperatura extends Sensor {

    @Override
    public void medir() {
        Random random = new Random();
        valorMedido = random.nextInt(40);
        System.out.println("SensorTemperatura: " + valorMedido + "°C");
        notificarObservadores();
    }

    @Override
    public EstrategiaEvaluacion getEstrategiaEvaluacion() {
        return (valor, umbral) -> valor > umbral;
    }
}