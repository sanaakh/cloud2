package fr.efrei.rag.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.efrei.rag.web.dto.Sample;

@RestController
public class SampleResource {

    @GetMapping("/samples/{value}")
    public String hello(@PathVariable(value = "value", required=false) final String value) {
        return "Hello " + value + "!";
    }

    @GetMapping("/samples/dto/{value}")
    public Sample helloDto(@PathVariable(value = "value", required=false) final String value) {
        return new Sample("Hello " + value + "!");
    }

}
