package transport;

public class Sponsor {
    private final String name;
    private final int sum;

    public Sponsor(String name, int sum) {
        this.name = name;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }

    public void sponsorRace() {
        System.out.printf("Спонсор \"%s\" проспонсировал заезд на %d%n",name,sum);
    }

    @Override
    public String toString() {
        return getName() + ", сумма поддержки - "+getSum();
    }
}
