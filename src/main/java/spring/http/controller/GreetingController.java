package spring.http.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {

    @GetMapping("/hello")
    public ModelAndView helloWorld(ModelAndView modelAndView) {
        modelAndView.setViewName("greeting/hello");

        return modelAndView;
    }

    @GetMapping("/bye")
    public ModelAndView byeWorld(ModelAndView modelAndView) {
        modelAndView.setViewName("greeting/bye");

        return modelAndView;
    }
}
