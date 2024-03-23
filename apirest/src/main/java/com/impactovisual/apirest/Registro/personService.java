package com.impactovisual.apirest.Registro;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class personService {

    private final personRepository personRepo;

    public void createPerson(persona person)
    {
        if (person != null) {
            personRepo.save(person);
        } else {
            System.out.println("No se puede guardar un objeto nulo");
        }
    }
}
