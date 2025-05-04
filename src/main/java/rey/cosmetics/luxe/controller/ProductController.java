package rey.cosmetics.luxe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/products")
    public String product() {
        return "Luxe Cosmetics Backend API is running.";
    }
}