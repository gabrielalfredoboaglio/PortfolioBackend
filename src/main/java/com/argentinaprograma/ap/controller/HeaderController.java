package com.argentinaprograma.ap.controller;
import com.argentinaprograma.ap.models.Header;
import com.argentinaprograma.ap.services.HeaderService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/header")
@CrossOrigin(origins = "http://localhost:4200")
public class HeaderController {
    private final HeaderService headerService;

    public HeaderController(HeaderService headerService) {
        this.headerService = headerService;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Header> obtenerHeader(@PathVariable("id")Long id){
        Header header = headerService.buscarHeaderPorID(id);
        return new ResponseEntity<>(header, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Header> editarHeader(@RequestBody Header header){
        Header updateHeader=headerService.editarHeader(header);
        return new ResponseEntity<>(updateHeader,HttpStatus.OK);
    }

}