package DaniQ.MarketPlace.domain;

import lombok.Data;

import javax.swing.text.StyledEditorKit;

@Data
public class Category {

    private int categoryId;
    private String category;
    private Boolean active;

}
