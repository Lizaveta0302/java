package internetShop.controller;

import internetShop.entity.product.Product;
import internetShop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

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
        List<Product> products = userService.loadBucket(username);
        model.addAttribute("bucket", products);
        return "bucket";
    }
}
