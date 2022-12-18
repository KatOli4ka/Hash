package transport.driver;

import transport.Bus;

public class DriverD extends Driver<Bus>{

    public DriverD(String fio, boolean hasDriveLicense, int expirience,String category) {
        super(fio, hasDriveLicense, expirience,category);
    }

    @Override
    public void start(Bus transport) {
        transport.start();
    }

    @Override
    public void stop(Bus transport) {
        transport.end();
    }
    @Override
    public void refuel(Bus transport) {
        System.out.println("Водитель - "+getFio()+" заправляет автобус - "+transport.getBrand());
    }
}
