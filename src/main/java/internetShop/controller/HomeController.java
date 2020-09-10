package internetShop.controller;

import internetShop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/bucket/{username}")
    public String bucket(@PathVariable String username, Model model) {
        model.addAttribute("bucket", userService.loadBucket(username));
        return "bucket";
    }
}
