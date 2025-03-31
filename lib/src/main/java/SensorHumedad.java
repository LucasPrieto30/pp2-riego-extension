
import com.riego.Sensor;

import java.util.Random;

public class SensorHumedad extends Sensor {

    public SensorHumedad(int umbral) {
    	super(umbral);
    }

    @Override
    public void medir() {
        Random random = new Random();
        valorMedido = random.nextInt(100);
        System.out.println("Sensor de Humedad: " + valorMedido + "%");
        notificarObservadores();
    }

    @Override
    public boolean necesitaRiego() {
        return valorMedido < umbral;
    }
}

