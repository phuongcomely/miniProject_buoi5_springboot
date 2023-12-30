package vn.techmaster.miniproject_buoi5_cpringboot.utils;



import vn.techmaster.miniproject_buoi5_cpringboot.model.Product;

import java.util.List;

public interface IFileReader {
    List<Product> readFile(String filePath);
}