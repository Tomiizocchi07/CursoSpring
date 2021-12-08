package com.example.HolaSpring.web;

import com.example.HolaSpring.Domain.Persona;
import com.example.HolaSpring.dao.PersonaDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private PersonaDao personaDao;

    @GetMapping("/")
    public String inicio(Model model){

        var personas = personaDao.findAll();

        log.info("Ejecutando el controlador Spring MVC");

        model.addAttribute("personas",personas);

        return "index";
    }
}
