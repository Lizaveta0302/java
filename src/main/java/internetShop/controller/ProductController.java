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

    private static final String redirect = "redirect:/products/listProducts";
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/listProducts")
    public String products(Model model) {
        List<Product> products = productService.getProducts();
        model.addAttribute("products", products);
        return "products";
    }

    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return redirect;
    }

    @PostMapping("/addProduct")
    public String add(@ModelAttribute("product") Product product) {
        productService.saveProduct(product);
        return redirect;
    }
}