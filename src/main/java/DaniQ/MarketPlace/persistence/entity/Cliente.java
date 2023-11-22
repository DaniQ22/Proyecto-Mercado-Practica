package DaniQ.MarketPlace.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import javax.xml.transform.sax.SAXTransformerFactory;
import java.util.List;

@Entity
@Table(name = "clientes")
@Data
public class Cliente {
    @Id
    private Integer id;

    private String nombre;

    private String apellidos;

    private String celular;

    private String direccion;

    @Column(name = "correo_electronico")
    private String correElectronico;

    //CREAMOS LA RELACIPN ENTRE LA TANLA CLIENTE Y COMPRA

    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;

}
