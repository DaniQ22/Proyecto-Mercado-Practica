package DaniQ.MarketPlace.domain;

import lombok.Data;

import java.time.LocalTime;

@Data
public class Buy {
    private int buyId;
    private  int clientId;
    private LocalTime date;
    private String descryption;
    private boolean active;
    private Client client;


}
