package multiply;

import java.util.Objects;

public class MultiplicationTable {
    private final int a;
    private final int b;

    public MultiplicationTable(int a,int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultiplicationTable multiplicationTable = (MultiplicationTable) o;
        return a == multiplicationTable.a && b == multiplicationTable.b
                ||a == multiplicationTable.b && b == multiplicationTable.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a)+Objects.hash(b);
    }

    @Override
    public String toString() {
        return a+" * "+ b +" = ?";
    }
}
