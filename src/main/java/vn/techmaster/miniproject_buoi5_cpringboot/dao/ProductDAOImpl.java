package vn.techmaster.miniproject_buoi5_cpringboot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import vn.techmaster.miniproject_buoi5_cpringboot.database.ProductDB;
import vn.techmaster.miniproject_buoi5_cpringboot.model.Product;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductDAOImpl implements  ProductDAO{

    @Override
    public void printListPeople(List<Product> products) {
        products.forEach(System.out::println);
    }

    @Override
    public List<Product> getAll() {

        return ProductDB.productList;
    }

    @Override
    public Product getProduct(int id) {
        for (Product product : ProductDB.productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}
