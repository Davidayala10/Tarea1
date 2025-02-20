package mx.ipn.escom.holaSpring.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola")
public class Controller {
    

    @GetMapping
    public String holaSpring(){
        return "Hola Spring";
    }

}
