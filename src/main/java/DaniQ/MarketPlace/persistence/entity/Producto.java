package DaniQ.MarketPlace.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "producto")
@Data
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    private String nombre;

    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "codigo_barra")
    private String codigoBarra;

    @Column(name = "precio-venta")
    private double precioVenta;

    @Column(name = "cantidad_stock")
    private Integer cantidadStock;
    private Boolean estado;

    //CREAR RELACION ENTRE LA TABLA CATEGORIA (1:M) PRODUCTO
    //insertable = false, updatable = false, con estas espicificaciones estamos indicando que desde esta
    //clase no insertaremos, modificaremos o crearemos ningunca categoria
    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;

}
