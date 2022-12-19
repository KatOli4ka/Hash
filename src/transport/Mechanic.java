package transport;


import java.util.Objects;

public class Mechanic <A extends Transport>{
    private final String fio;
    private final String nameCompany;
    public Mechanic(String fio, String nameCompany) {
        this.fio = fio;
        this.nameCompany = nameCompany;
    }

    public String getFio() {
        return fio;
    }

    public String getNameCompany() {
        return nameCompany;
    }
    public boolean getDiagnostic(A t) {
        return t.getDiagnostic();
    }

    public void fix(A t) {
        t.fix();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(fio, mechanic.fio) && Objects.equals(nameCompany, mechanic.nameCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, nameCompany);
    }

    @Override
    public String toString() {
        return getFio() +" из компании " + getNameCompany();
    }
}
