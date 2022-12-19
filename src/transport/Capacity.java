package transport;

public enum Capacity {
    TINY(0,10),
    SMALL(10,25),
    MIDDLE(40,50),
    BIG(60,80),
    HUGE(100,120);
    private final int from;
    private final int to;

    Capacity(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }
}
