package DaniQ.MarketPlace.persistence.mapper;

import DaniQ.MarketPlace.domain.Category;
import DaniQ.MarketPlace.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import javax.swing.*;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId" ),
            @Mapping(source = "descripcion", target = "category" ),
            @Mapping(source = "estado", target = "active" ),

    })
    Category toCategory(Categoria categoria); //Vamos a converitir una categoria a category
    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Categoria toCategoria(Category category); //Viceversa se convierte una category a categoria


}
