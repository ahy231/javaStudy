package pojo;

import lombok.Data;

import java.util.List;

@Data
public class Category {
    private int id;
    private String name;
    private List<Product> products;
}
