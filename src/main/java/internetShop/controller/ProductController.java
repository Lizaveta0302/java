package internetShop.controller;

import internetShop.entity.product.Product;
import internetShop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/listProducts")
    public String products(Model model) {
        List<Product> products = productService.getProducts();
        model.addAttribute("products", products);
        return "products";
    }

    @GetMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return "redirect:/products/listProducts";
    }

    @PostMapping("/addProduct")
    public String add(@ModelAttribute("product") Product product) {
        productService.saveProduct(product);
        return "redirect:/products/listProducts";
    }
}