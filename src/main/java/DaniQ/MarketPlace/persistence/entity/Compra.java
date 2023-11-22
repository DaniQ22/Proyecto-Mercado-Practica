package DaniQ.MarketPlace.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.sql.ast.SqlTreeCreationException;

import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "compras")
@Data
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_cliente")
    private Integer idCliente;

    private LocalTime fecha;

    @Column(name = "medio_pago")
    private String medioPago;

    private String comentario;

    private Boolean estado;

    //CREAR RELACION ENTRE LA TABLA CLIENTE (1:M) COMPRAS
    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    private Cliente cliente;

    //CREAMOS LA REALCION ENTRE LA TABLAS COMPRAS Y COMPRAS_PRODUCTO
    @OneToMany(mappedBy = "compras")
    private List<CompraProducto> productos;
}
