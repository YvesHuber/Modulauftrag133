package ch.bbw.personenverwaltung;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Person {

    private long id;
    private String name;
    private String vorname;
    private String email;
    private LocalDate geburtsdatum;
    private char geschlecht;

    public Person() {
        this(0, "", "", "", LocalDate.of(0000,00,00), 'x');
    }

    public Person(long id, String name, String vorname, String email, LocalDate geburtsdatum, char geschlecht) {
        this.id = id;
        this.name = name;
        this.vorname = vorname;
        this.email = email;
        this.geburtsdatum = geburtsdatum;
        this.geschlecht = geschlecht;
    }


    @Id
    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(LocalDate geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public char getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }
}