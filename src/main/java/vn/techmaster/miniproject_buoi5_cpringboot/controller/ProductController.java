package vn.techmaster.miniproject_buoi5_cpringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import vn.techmaster.miniproject_buoi5_cpringboot.dao.ProductDAO;
import vn.techmaster.miniproject_buoi5_cpringboot.model.Product;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductDAO productDAO;

    @GetMapping("/")
    public String getAll(Model model){
        List<Product> allProduct = productDAO.getAll();
        model.addAttribute("product", allProduct);
        return "index";
    }
    @GetMapping("/product/{id}")
    public String findById(@PathVariable int id, Model model) {
        Product product = productDAO.getProduct(id);

        if (product != null) {
            model.addAttribute("product", product);
            return "productDetail";
        } else {
            return "notFound";
        }
    }
}
