package vn.techmaster.miniproject_buoi5_cpringboot.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {
     int id;
     String name;
     String description;
     String thumbnail;
     int price;
     Double rating;
    int priceDiscount;

}
