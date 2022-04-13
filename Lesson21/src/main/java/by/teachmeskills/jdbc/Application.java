package by.teachmeskills.jdbc;

import by.teachmeskills.jdbc.model.Product;
import by.teachmeskills.jdbc.utils.CRUD;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Стиральный порошок", "Описание", 8.99, 78, true);
        System.out.println("Saved students:");
        System.out.println(CRUD.saveProduct(product));
        System.out.println("---------------------------------------------------");

        System.out.println("All products:");
        System.out.println(CRUD.getAllProducts());
        System.out.println("---------------------------------------------------");

        System.out.println("Updated products:");
        System.out.println(CRUD.updateProduct(false, 0));
        System.out.println("----------------------------------------------------");

//        System.out.println("Deleted products: ");
//        System.out.println(CRUD.deleteProduct(0));
    }
}
