package com.ejemplo.bodegas.controlador;

import com.ejemplo.bodegas.controlador.dto.RegistroBodega;
import com.ejemplo.bodegas.entidad.Bodega;
import com.ejemplo.bodegas.servicio.BodegaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/bodegas")
@CrossOrigin(origins = "http://localhost:4200")
public class BodegaController {
    private final BodegaService servicio;

    public BodegaController(BodegaService servicio) {
        this.servicio = servicio;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Bodega registrar(@Valid @RequestBody RegistroBodega datos) {
        return servicio.registrar(datos.nombre(), datos.ubicacion());
    }

    @GetMapping
    public List<Bodega> consultar() {
        return servicio.consultar();
    }
}
