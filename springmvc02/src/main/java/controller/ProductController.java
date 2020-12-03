package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    @RequestMapping("/addProduct")
    public ModelAndView add() {
        ModelAndView modelAndView = new ModelAndView("showProduct");
        return modelAndView;
    }
}
