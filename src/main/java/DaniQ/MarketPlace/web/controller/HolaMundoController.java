package DaniQ.MarketPlace.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
    @GetMapping("/saludar")
    public String saludar(){
        return "Hola cavergas";
    }
}
