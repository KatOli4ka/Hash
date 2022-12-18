package transport;


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
    public String toString() {
        return getFio() +" из компании " + getNameCompany();
    }
}
