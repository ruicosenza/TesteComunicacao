package Teste;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TesteController {
    private final AtomicLong counter = new AtomicLong();

    /*@RequestMapping(value = "/teste", produces = (MediaType.APPLICATION_JSON_VALUE))*/
    @RequestMapping(value = "/teste", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ArrayList<Socio> teste(){
        ArrayList<Socio> a = new ArrayList<>();
        Socio s;

        for( int i = 0; i <= 5; i++){
            s = new Socio(counter.incrementAndGet(), "Teste" + i);
            a.add(s);
        }

        return a;
    }

    @RequestMapping(value = "/teste1", produces = (MediaType.APPLICATION_JSON_VALUE))
    public Socio teste1(){
        Socio s = new Socio(counter.incrementAndGet(), "Teste" + counter.incrementAndGet());

        return s;
    }
}