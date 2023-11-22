package DaniQ.MarketPlace.persistence.mapper;

import DaniQ.MarketPlace.domain.Client;
import DaniQ.MarketPlace.persistence.entity.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    @Mappings({
            @Mapping(source = "id", target = "clientId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "apellidos", target = "lastName"),
            @Mapping(source = "celular", target = "numberPhone"),
            @Mapping(source = "direccion", target = "addres"),
            @Mapping(source = "correElectronico", target = "email"),
    })
    Client toClients(Cliente cliente);
    List<Client> toClient(List<Cliente> clientes);


    @Mapping(target = "compras", ignore = true)
    @InheritInverseConfiguration
    Cliente toCliente(Client client);
}
