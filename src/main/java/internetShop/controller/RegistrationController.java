package internetShop.controller;

import internetShop.entity.User;
import internetShop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return "/registration";
    }

    @PostMapping("/registration")
    public String registryUser(@ModelAttribute("userForm") User userForm,
                               Model model, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/registration";
        }
        if (!userService.saveUser(userForm)) {
            model.addAttribute("usernameError", "User with such username already exists.");
            return "/registration";
        }
        return "redirect:/";
    }

}
