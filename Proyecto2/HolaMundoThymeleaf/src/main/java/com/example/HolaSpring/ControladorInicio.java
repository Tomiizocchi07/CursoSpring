package com.example.HolaSpring;

import com.example.HolaSpring.Domain.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
public class ControladorInicio {

    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model){

        var persona = new Persona();
        var mensaje = "Hola mundo con Thymeleaf";

        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEmail("JuanPerez@gmail.com");
        persona.setTelefono("1145421245");

        var persona2 = new Persona();

        persona2.setNombre("Carla");
        persona2.setApellido("Gomez");
        persona2.setEmail("CarlaGomez@gmail.com");
        persona2.setTelefono("1157483913");

        List<Persona> personas = new ArrayList<>();
        personas.add(persona);
        personas.add(persona2);

        log.info("Ejecutando el controlador Spring MVC");

        model.addAttribute("mensaje",mensaje);
        model.addAttribute("saludo",saludo);
        //model.addAttribute("persona",persona);
        model.addAttribute("personas",personas);
        return "index";
    }
}
