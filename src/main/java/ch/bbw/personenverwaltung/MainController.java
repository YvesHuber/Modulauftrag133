package ch.bbw.personenverwaltung;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.swing.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.util.Date;

@Controller
public class MainController {

    private DataRepository dataRepository;

    @Autowired
    public MainController(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @GetMapping("/")
    public String persons(Model model) {
        model.addAttribute("persons", dataRepository.findAll());

        return "persons";
    }

    @GetMapping("/personenverwaltung/{id}")
    public String personenverwaltung(@PathVariable long id, Model model) {
        model.addAttribute("verwaltung", dataRepository.findById(id).get());

        return "personenverwaltung";
    }

    @PostMapping("/update/{id}")
    public String create(@PathVariable Long id, @ModelAttribute Person person){
        person.setId(id);
        System.out.println(person.getId());
        dataRepository.save(person);
        return "redirect:/";
    }

    @GetMapping("/create")
    public String getcreate(Model model) {
        model.addAttribute("person", new Person());

        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Person person) {
        dataRepository.save(person);
        System.out.println("successful");

        return "redirect:/";
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable long id, Person person) {
        dataRepository.deleteById(id);
        System.out.println("successful");

        return "redirect:/";
    }

}