
import com.riego.Sensor;

import java.util.Random;

public class SensorHumedad extends Sensor {

    public SensorHumedad(int umbral) {
    	super(umbral);
    }

    @Override
    public void medir() {
        Random random = new Random();
        valor = random.nextInt(100);
        System.out.println("Sensor de Humedad: " + valor + "%");

        notificarObservadores();
    }

    @Override
    public boolean necesitaRiego() {
        return valor < umbral;
    }
}

