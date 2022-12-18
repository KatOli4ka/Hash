package transport;

public class Truck extends Transport {
    private LoadCapacity loadCapacity;
    public Truck(String model, String brand, double engineVolume,LoadCapacity loadCapacity) {
        super(model, brand, engineVolume);
        this.loadCapacity=loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void end() {
        super.end();
    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по грузовику недостаточно");
        } else {
            String from=loadCapacity.getFrom()==null? "" : "от " +loadCapacity.getFrom()+" т. ";
            String to=loadCapacity.getTo()==null? "" : "от " +loadCapacity.getTo()+" т.";
            System.out.println("Грузоподъемность грузовика - " + from + to);
        }
    }

    @Override
    public boolean getDiagnostic() {

        return Math.random()>0.8;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void fix() {
        System.out.println("Грузовик "+ getBrand()+ " "+getModel()+" отремонтирова!");
    }


    @Override
    public void pitStop() {
        System.out.println("Грузовик ушел на пит-стоп");
    }

    @Override
    public double bestTime() {
        return Math.random()*10;
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random()*150);
    }
}
