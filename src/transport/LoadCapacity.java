package transport;

public enum LoadCapacity {
    N1(0D,3.5),
    N2(3.5,12D),
    N3(12D,null);
    private final Double from;
    private final Double to;

    LoadCapacity(Double from, Double to) {
        this.from = from;
        this.to = to;
    }

    public Double getFrom() {
        return from;
    }

    public Double getTo() {
        return to;
    }
}
