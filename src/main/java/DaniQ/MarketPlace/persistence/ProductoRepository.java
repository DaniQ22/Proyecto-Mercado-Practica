package DaniQ.MarketPlace.persistence;

import DaniQ.MarketPlace.persistence.crud.ProductoCrudRepository;
import DaniQ.MarketPlace.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    //Crearemos un metodo para recuperar todos los obejtos de la tabla producto
    public List<Producto> getPorductos () {
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> obtenerProductoPorCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> obtenerProductosCasiAgotadosYenVenta(int cantidadStock, boolean estado){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidadStock, true);
    }

    public List<Producto> obetenerProductosEscasos(){
        return productoCrudRepository.findByCantidadStockIsZeroOrLessThan(1);
    }

    public  Optional<Producto> obtenerProducto(int idProducto){
        return productoCrudRepository.findById(idProducto);
    }

    public void creaProducto(Producto producto){
        productoCrudRepository.save(producto);
    }

    public void eliminarProducto(int idProducto){
        productoCrudRepository.deleteById(idProducto);
    }






}
