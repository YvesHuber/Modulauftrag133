package ch.bbw.personenverwaltung;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

    private DataRepository dataRepository;

    @Autowired
    public MainController(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @GetMapping("/")
    public String index() {

        return "index";
    }

    @GetMapping("/persons")
    public String persons(Model model) {
        model.addAttribute("persons", dataRepository.findAll());

        return "persons";
    }

    /*@GetMapping("/person/{id}")
    public String person(@PathVariable long id, Model model) {
        model.addAttribute("person", dataRepository.findById(id));

        return "person";
    }*/

    @GetMapping("/personenverwaltung/{id}")
    public String personenverwaltung(@PathVariable long id, Model model) {
        model.addAttribute("verwaltung", dataRepository.findById(id));

        return "personenverwaltung";
    }

}