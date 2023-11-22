package DaniQ.MarketPlace.persistence;

import DaniQ.MarketPlace.domain.Product;
import DaniQ.MarketPlace.domain.repository.ProductRepository;
import DaniQ.MarketPlace.persistence.crud.ProductoCrudRepository;
import DaniQ.MarketPlace.persistence.entity.Producto;
import DaniQ.MarketPlace.persistence.mapper.ProductMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class ProductoRepository implements ProductRepository {
    private ProductoCrudRepository productoCrudRepository;
    private ProductMapper mapper;

    @Override
    public List<Product> getAll() {
        List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
        return mapper.toProducts(productos);
    }

    @Override
    public Optional<List<Product>> getByIdCategory(int categoryId) {
        List<Producto> productos = productoCrudRepository.findByIdCategoriaOrderByNombreAsc(categoryId);
        return Optional.of(mapper.toProducts(productos));
    }

    @Override
    public Optional<List<Product>> getProductEscasosAndActive(int quanty, boolean active) {
        Optional<List<Producto>> productos = productoCrudRepository.findByCantidadStockLessThanAndEstado(quanty, true);
        return productos.map(prods -> mapper.toProducts(prods));
    }

    @Override
    public List<Product> getProductEscasos() {
        List<Producto> productos = productoCrudRepository.findByCantidadStockIsZeroOrLessThan(1);
        return mapper.toProducts(productos);
    }

    @Override
    public Optional<Product> getProductById(int productId) {
        Optional<Producto> productos = productoCrudRepository.findById(productId);
        return productos.map(prods->mapper.toProduct(prods));
    }

    @Override
    public Product save(Product product) {
        Producto producto = mapper.toProducto(product);
        return mapper.toProduct(productoCrudRepository.save(producto));
    }

    @Override
    public void delete(int productId) {
        productoCrudRepository.deleteById(productId);
    }
}
