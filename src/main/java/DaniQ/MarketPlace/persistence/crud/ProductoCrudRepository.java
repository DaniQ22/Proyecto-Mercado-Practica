package DaniQ.MarketPlace.persistence.crud;

import DaniQ.MarketPlace.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

//Creamos la interfaz de JPAREPOSITORY
//Aqui creamos todas las consultas a nuestra base de datos en la columna producto
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    //ECONTRAR TODOS LOS PRODUCTOS QUE PERTENEZCAN A UNA CATEGORIA ESPECIFICA (QueryMethods)
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    //Traer aquellos productos que se estan agotanto y que estan disponibles
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

    //TAMBIEN SE PUEDE HACER CONSULTAS CON QUERYNATIVO

    //OBTENER PRODUCTOS AGOTADOS
    List<Producto> findByCantidadStockIsZeroOrLessThan(int cantidadStock);

    //Obtener Productos

}
