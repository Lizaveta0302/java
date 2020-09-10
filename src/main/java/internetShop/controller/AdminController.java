package internetShop.controller;

import internetShop.entity.User;
import internetShop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @GetMapping("/adminPage")
    public String adminPage(Model model) {
        List<User> allUsers = userService.getUsers();
        model.addAttribute("allUsers", allUsers);
        return "admin";
    }

    @PostMapping("/deleteUser")
    public String deleteUser(@RequestParam Long id) {
        userService.deleteUser(id);
        return "redirect:/admin/adminPage";
    }

}
