package com.impactovisual.apirest.Registro;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class personControler {

    private final personService personService;

    @PostMapping
    public void createPersona(@RequestBody persona persona) {
        personService.createPerson(persona);
    }

}
