package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation <A extends Transport> {
    private final String name;
    private final Queue<Transport> queue = new LinkedList<>();

    public ServiceStation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void addTransport(Transport auto) {
        queue.offer(auto);
    }
    public void addCar(Car car) {
        addTransport(car);
    }
    public void addTruck(Truck truck) {
        addTransport(truck);
    }
    public void techInspection() {
        Transport transport=queue.poll();
        if (transport != null) {
            System.out.println("Станция техобслуживания "+name+" провела техосмотр "+transport);
            techInspection();
        } else {
            System.out.println("В очереди больше нет транспорта");
        }
    }

}
