package guru.springframework.morodevpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Luca Moro on 17/10/2020 13:13
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index() {
        return "index";
    }

    @RequestMapping("/oups")
    public String oupsHandler() {
        return "notimplemented";
    }
}
