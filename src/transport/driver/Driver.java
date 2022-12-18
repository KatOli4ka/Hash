package transport.driver;

import transport.Transport;

public  class Driver<A extends Transport> {
    private final String fio;
    private boolean hasDriveLicense;
    private int expirience;
    private String category;


    public Driver(String fio, boolean hasDriveLicense, int expirience,String category) {
        this.fio = fio;
        this.hasDriveLicense = hasDriveLicense;
        this.expirience = expirience;
        this.category=category;
    }

    public String getFio() {
        return fio;
    }

    public boolean isHasDriveLicense() {
        return hasDriveLicense;
    }

    public void setHasDriveLicense(boolean hasDriveLicense) {
        this.hasDriveLicense = hasDriveLicense;
    }

    public int getExpirience() {
        return expirience;
    }

    public void setExpirience(int expirience) {
        this.expirience = expirience;
    }

    public void start(A transport){};

    public void stop(A transport){};

    public void refuel(A transport){};

    public void printInfo(A transport) {
        System.out.println("Водитель - "+fio+" управляет автомобилем "+transport.getBrand()+" и будет участвовать в заезде");
    }

    @Override
    public String toString() {
        return getFio() +" со стажем вождения "  + expirience +" лет, категория "+category;
    }
}
