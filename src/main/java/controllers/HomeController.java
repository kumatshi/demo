package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HomeController {

    @RequestMapping("/rest/home")
    @ResponseBody
    public String home() {
        return "ответ с endpoint rest/home";
    }
}
