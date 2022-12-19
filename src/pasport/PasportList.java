package pasport;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PasportList {
    private Set<Pasport>pasports;

    public PasportList(Set<Pasport> pasports) {
        this.pasports = pasports;
    }

    public void addPasport(Pasport pasport) {
        Pasport oldPasport=get(pasport.getNumber());
        if (oldPasport !=null) {
            pasports.remove(oldPasport);
        }
            pasports.add(pasport);

    }

    public Pasport get(String number) {
        for(Pasport pasport:pasports) {
            if (pasport.getNumber().equals(number)) {
                return pasport;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return pasports.toString();
    }

}
