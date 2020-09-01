package internetShop.mvc;

import internetShop.entity.product.Product;
import internetShop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String main(Model model) {
        List<Product> products = productService.getProducts();
        model.addAttribute("products", products);
        return "/products";
    }

    @GetMapping("/deleteProduct/{id}")
    public String deleteProduct(
            @PathVariable Long id
    ) {
        productService.deleteProduct(id);
        return "redirect:/";
    }

    @PostMapping("/addProduct")
    public String add(@RequestParam String name, Double price) {
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        productService.saveProduct(product);
        return "redirect:/";
    }
}