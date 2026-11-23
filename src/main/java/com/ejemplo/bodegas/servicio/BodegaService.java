package com.ejemplo.bodegas.servicio;

import com.ejemplo.bodegas.entidad.Bodega;
import com.ejemplo.bodegas.repositorio.BodegaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BodegaService {
    private final BodegaRepository bodegas;

    public BodegaService(BodegaRepository bodegas) {
        this.bodegas = bodegas;
    }

    public Bodega registrar(String nombre, String ubicacion) {
        return bodegas.save(new Bodega(nombre.trim(), ubicacion.trim()));
    }

    public List<Bodega> consultar() {
        return bodegas.listarConProductos();
    }
}
