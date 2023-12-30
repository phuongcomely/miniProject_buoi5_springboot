package vn.techmaster.miniproject_buoi5_cpringboot.dao;

import org.springframework.web.bind.annotation.PathVariable;
import vn.techmaster.miniproject_buoi5_cpringboot.model.Product;

import java.util.List;

public interface ProductDAO {
    void printListPeople(List<Product> products);

    List<Product> getAll(); //Liệt kê danh sách tất cả

    Product getProduct(int id); //Tìm kiếm sản phẩm theo int id


}
