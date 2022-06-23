package ch.bbw.personenverwaltung;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Scope("request")
public class MainController {


    @Autowired
    public MainController() {

    }

    @PostConstruct
    private void init() {

    }

    @PreDestroy
    private void destroy() {
    }

    @GetMapping("/")
    public String index(Model model) {

        return "index";
    }

}
