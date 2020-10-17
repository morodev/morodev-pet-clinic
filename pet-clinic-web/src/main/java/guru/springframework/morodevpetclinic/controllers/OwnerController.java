package guru.springframework.morodevpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created By Luca Moro on 17/10/2020 13:31
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public  String listOwners() {
        return "owners/index";
    }
}
