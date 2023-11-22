package DaniQ.MarketPlace.domain;

import lombok.Data;

import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.sax.SAXTransformerFactory;

@Data
public class Client {

    private int clientId;
    private String name;
    private String lastName;
    private String numberPhone;
    private String addres;
    private String email;
}
