package ch.bbw.personenverwaltung;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface DataRepository extends CrudRepository<Person, Long> {

}