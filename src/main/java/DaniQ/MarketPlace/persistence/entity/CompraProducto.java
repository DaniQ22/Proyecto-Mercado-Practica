package DaniQ.MarketPlace.persistence.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

@Entity
@Data
@Table(name = "compras_productos")
public class CompraProducto extends ComprasProductoPK {
    @EmbeddedId
    private ComprasProductoPK id;
    private Integer cantidad;
    private Double total;
    private Boolean estado;

    //CREAMOS LA REALCION ENTRE LAS TABLAS PRODUCTOS Y COMPRAS_PRODCUTO
    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;

    //CREAMOS LA REALCION ENTRE LAS TABLAS COMPRAS Y COMPRAS_PRODCUTO
    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;





}
