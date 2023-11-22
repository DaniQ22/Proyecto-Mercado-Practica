package DaniQ.MarketPlace.persistence.mapper;

import DaniQ.MarketPlace.domain.Buy;
import DaniQ.MarketPlace.persistence.entity.Compra;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ClientMapper.class})
public interface BuyMapper {

    @Mappings({
            @Mapping(source = "idCompra", target = "buyId"),
            @Mapping(source = "idCliente", target = "clientId"),
            @Mapping(source = "fecha", target = "date"),
            @Mapping(source = "medioPago", target = "descryption"),
            @Mapping(source = "comentario", target = "active"),
            @Mapping(source = "estado", target = "client"),
    })
    Buy toBuys(Compra compra);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Compra toCompra(Buy buy);
}
