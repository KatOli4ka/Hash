package transport;

public class Bus extends Transport {
    private Capacity capacity;
    public Bus(String model, String brand, double engineVolume,Capacity capacity) {
        super(model, brand, engineVolume);
        this.capacity=capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
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
        if (capacity == null) {
            System.out.println("Данных по автобусу недостаточно");
        } else{
           System.out.println("Вместимость автобуса от - " + capacity.getFrom()+" чел. до "+capacity.getTo()+" чел.");
        }
    }

    @Override
    public boolean getDiagnostic() {
        System.out.println("Автобус "+getBrand()+" "+getModel()+" в диагностике не требуется");
        return true;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void fix() {
        System.out.println("Автоьус "+ getBrand()+ " "+getModel()+" отремонтирован!");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус ушел на пит-стоп");
    }
    @Override
    public double bestTime() {
        return Math.random()*15;
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random()*100);
    }
}
