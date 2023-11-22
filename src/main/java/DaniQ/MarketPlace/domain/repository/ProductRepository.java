package DaniQ.MarketPlace.domain.repository;

import DaniQ.MarketPlace.domain.Product;

import javax.swing.*;
import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getAll();

    Optional<List<Product>> getByIdCategory(int categoryId);

    Optional<List<Product>> getProductEscasosAndActive(int quanty, boolean active);

    List<Product> getProductEscasos();

    Optional<Product> getProductById(int productId);

    Product save(Product product);
    void delete(int productId);




}
