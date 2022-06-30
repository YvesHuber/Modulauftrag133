/*package ch.bbw.personenverwaltung;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseConection {

    private ArrayList<Person> persons;

    public DatabaseConection() {
        persons = new ArrayList<>();

        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Personen", "root", "root");
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM Person");
                ResultSet results = statement.executeQuery();) {

            while (results.next()) {
                persons.add(new Person(results.getInt("id"),
                        results.getString("name"),
                        results.getString("vorname"),
                        results.getString("email"),
                        results.getDate("geburtsdatum"),
                        results.getString("geschlecht")));
            }

        } catch (SQLException ex) {
            System.out.println("Error while communicating with the database");
        }
    }

    public void testrun() {
        persons.stream()
                .forEach(person -> System.out.println(person.getId() + " " + person.getName() + " " + person.getVorname() + " " + person.getEmail() + " " + person.getGeburtsdatum() + " " + person.getGeschlecht()));
    }

}
*/