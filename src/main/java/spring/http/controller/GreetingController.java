package spring.http.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api/v1")
public class GreetingController {

    @GetMapping("/hello/{id}")
    public ModelAndView helloWorld(ModelAndView modelAndView, HttpServletRequest request,
                                   @RequestParam("age") Integer age,
                                   @RequestHeader("accept") String accept,
                                   @CookieValue("JSESSIONID") String jsessionId,
                                   @PathVariable("id") Integer id) {

        modelAndView.setViewName("greeting/hello");

        return modelAndView;
    }

    @GetMapping("/bye")
    public ModelAndView byeWorld(ModelAndView modelAndView) {
        modelAndView.setViewName("greeting/bye");

        return modelAndView;
    }
}
