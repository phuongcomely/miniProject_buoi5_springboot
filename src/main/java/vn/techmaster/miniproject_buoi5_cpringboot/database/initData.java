package vn.techmaster.miniproject_buoi5_cpringboot.database;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import vn.techmaster.miniproject_buoi5_cpringboot.utils.IFileReader;


@Configuration
public class initData implements CommandLineRunner {
    @Autowired
    private IFileReader fileReader;

    @Override
    public void run(String... args) throws Exception {
        ProductDB.productList = fileReader.readFile("Product.csv");
        System.out.println("people size : " + ProductDB.productList.size());

        ProductDB.productList.forEach(System.out::println);
    }
}
