package ch.bbw.personenverwaltung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonenverwaltungApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonenverwaltungApplication.class, args);
    }

    /*public static void main(String[] args) {
        DatabaseConection test = new DatabaseConection();
        test.testrun();
    }*/
}
