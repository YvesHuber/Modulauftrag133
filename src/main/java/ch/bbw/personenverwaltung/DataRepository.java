package ch.bbw.personenverwaltung;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;

@Repository
public class DataRepository {

    private ArrayList<Person> persons;

    public DataRepository() {
        persons = new ArrayList<>();

        persons.add(
                new Person(1, "Dubach", "Silvan", "silvan.dubach@lernende.bbw.ch", LocalDate.of(2004,06,22), 'm'));
    }

     public ArrayList<Person> getAllPersons() {
        return this.persons;
    }

    public Person getallPersonById(long id) {
        Person person = persons.stream()
                .filter(a -> a.getId() == id)
                .findFirst().orElse(new Person());
        return person;
    }

}