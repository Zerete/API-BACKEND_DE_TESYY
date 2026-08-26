package cl.duoc.apibackend.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ordenes")
public class OrdenesController {

    @GetMapping
    @PreAuthorize("hasAuthority('SCOPE_OT.Create')")
    public String obtenerOrdenes() {
        return "API protegida - acceso autorizado con OT.Create";
    }
}