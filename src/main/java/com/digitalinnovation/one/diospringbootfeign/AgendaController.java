package com.digitalinnovation.one.diospringbootfeign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contact")
public class AgendaController {

    @GetMapping
    public Contact contactReturn(){
        return Contact.builder()
                .id(1L)
                .name("John")
                .phone("99999-9999")
                .build();
    }


}
