package ch.bbw.personenverwaltung;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.time.LocalDate;

@Entity
public class Person {

    private long id;
    private String name;
    private String vorname;
    private String email;
    private Date geburtsdatum;
    private char geschlecht;

    public Person(int id, String name, String vorname, String email, Date geburtsdatum, char geschlecht) {
    }

    public Person(long id, String name, String vorname, String email, Date geburtsdatum, char geschlecht) {
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

    public Date getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(Date geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public char getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }
}