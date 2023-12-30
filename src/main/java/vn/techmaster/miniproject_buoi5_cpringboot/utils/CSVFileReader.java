package vn.techmaster.miniproject_buoi5_cpringboot.utils;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.springframework.stereotype.Component;
import vn.techmaster.miniproject_buoi5_cpringboot.model.Product;

import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Component
public class CSVFileReader implements IFileReader {

    @Override
    public List<Product> readFile(String filePath) {

        List<Product> products = new ArrayList<>();

        Path path = Paths.get(filePath);
        try {
            FileReader filereader = new FileReader(path.toFile());
            CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .withSkipLines(1)
                    .build();

            List<String[]> allData = csvReader.readAll();
            for (String[] row : allData) {
                Product product = new Product();
                product.setId(Integer.valueOf(row[0]));
                product.setName(row[1]);
                product.setDescription(row[2]);
                product.setThumbnail(row[3]);
                product.setPrice(Integer.valueOf(row[4]));
                product.setRating(Double.valueOf(row[5]));


                if (row[6] != null && !row[6].isEmpty()) {
                    product.setPriceDiscount(Integer.valueOf(row[6]));
                }


                products.add(product);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return products;
    }
}
