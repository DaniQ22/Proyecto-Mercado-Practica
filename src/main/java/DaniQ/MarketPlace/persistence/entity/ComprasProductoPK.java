package DaniQ.MarketPlace.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

import java.beans.IntrospectionException;
import java.io.Serializable;

@Embeddable
@Data
public class ComprasProductoPK implements Serializable {

    @Column(name = "id_producto")
    private Integer idProducto;
    @Column(name = "id_compra")
    private Integer idCompra;

}
