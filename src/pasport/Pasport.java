package pasport;

import java.time.LocalDate;
import java.util.Objects;

public class Pasport {
    private String name;
    private String surname;
    private String patronymic;
    private LocalDate dateOfBirth;
    private String number;

    public Pasport(String name, String surname, String patronymic, LocalDate dateOfBirth, String number) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return "Паспортные данные: " + surname+" "+name +" "+patronymic+" "+dateOfBirth +" " + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pasport pasport = (Pasport) o;
        return Objects.equals(number, pasport.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
