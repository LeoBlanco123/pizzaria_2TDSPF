package br.com.fiap.pizzaria_2TDSPF;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Pizzaria2TdspfApplication {

    public static void main(String[] args) {

        SpringApplication.run(Pizzaria2TdspfApplication.class, args);
    }

    @GetMapping(value = "/")
    public String index() {
        return "Seja bem-vindo à Benezinho's Pizzaria";
    }

}
