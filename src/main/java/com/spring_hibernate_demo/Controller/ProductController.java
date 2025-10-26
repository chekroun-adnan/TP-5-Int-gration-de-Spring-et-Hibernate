package com.spring_hibernate_demo.Controller;

import com.spring_hibernate_demo.dao.IDao;
import com.spring_hibernate_demo.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @Autowired
    private IDao<Product> productDao;

    @GetMapping("/products")
    public String list(Model model) {
        model.addAttribute("products", productDao.findAll());
        return "products";
    }
}
