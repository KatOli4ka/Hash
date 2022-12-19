package transport.driver;

import transport.Truck;

public class DriverC extends Driver<Truck> {
    public DriverC(String fio, boolean hasDriveLicense, int expirience,String category) {
        super(fio, hasDriveLicense, expirience,category);
    }

    @Override
    public void start(Truck transport) {
        transport.start();
    }

    @Override
    public void stop(Truck transport) {
        transport.end();
    }

    @Override
    public void refuel(Truck transport) {
        System.out.println("Водитель - "+getFio()+" заправляет грузовик - "+transport.getBrand());
    }
}
