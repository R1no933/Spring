package spring.http.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import spring.dto.UserReadDto;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/api/v1")
@SessionAttributes({"user"})
public class GreetingController {

    @GetMapping("/hello")
    public String helloWorld(Model model, HttpServletRequest request) {
        //model.addAttribute("user", new UserReadDto(1L, "Ivan"));

        return "greeting/hello";
    }

    @GetMapping("/bye")
    public String byeWorld(@SessionAttribute("user") UserReadDto user) {
        return "greeting/bye";
    }

    @GetMapping("/hello/{id}")
    public ModelAndView helloWorld2(ModelAndView modelAndView, HttpServletRequest request,
                                   @RequestParam("age") Integer age,
                                   @RequestHeader("accept") String accept,
                                   @CookieValue("JSESSIONID") String jsessionId,
                                   @PathVariable("id") Integer id) {

        modelAndView.setViewName("greeting/hello");

        return modelAndView;
    }
}
