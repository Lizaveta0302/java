package internetShop.controller;

import internetShop.entity.User;
import internetShop.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private UserServiceInterface userService;

    @GetMapping("/admin")
    public String adminPage(Model model) {
        List<User> allUsers = userService.getUsers();
        model.addAttribute("allUsers", allUsers);
        return "admin";
    }

    @PostMapping("/admin")
    public String deleteUser(@RequestParam Long id) {
        userService.deleteUser(id);
        return "redirect:/admin";
    }

}
