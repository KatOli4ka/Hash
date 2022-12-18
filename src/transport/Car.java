package transport;


public class Car extends Transport implements Competing{
    private TypeOfBody typeOfBody;

    public Car(String model, String brand, double engineVolume,TypeOfBody typeOfBody) {
        super(model, brand, engineVolume);
        this.typeOfBody=typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
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
        if (typeOfBody == null) {
            System.out.println("Данных по авто недостаточно");
        }else{
            System.out.println("Тип кузова авто - "+typeOfBody);
        }
    }

    @Override
    public boolean getDiagnostic() {

        return Math.random()>0.6;
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
        System.out.println("Машина "+ getBrand()+ " "+getModel());
    }

    @Override
    public void pitStop() {
        System.out.println("Авто ушел на пит-стоп");
    }

    @Override
    public double bestTime() {
        return Math.random()*5;
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random()*250);
    }

}


