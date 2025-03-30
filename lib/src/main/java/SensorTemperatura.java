
import java.util.Random;

import com.riego.Sensor;

public class SensorTemperatura extends Sensor {

	public SensorTemperatura(int umbral) {
		super(umbral);
	}

    @Override
    public void medir() {
        Random random = new Random();
        valor = random.nextInt(40);
        System.out.println("SensorTemperatura: " + valor + "°C");
        notificarObservadores();
    }

    @Override
    public boolean necesitaRiego() {
        return valor > umbral;
    }
}