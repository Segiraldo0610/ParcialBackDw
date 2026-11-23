package com.ejemplo.bodegas.config;

import com.ejemplo.bodegas.entidad.Bodega;
import com.ejemplo.bodegas.entidad.Producto;
import com.ejemplo.bodegas.repositorio.BodegaRepository;
import com.ejemplo.bodegas.repositorio.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.math.BigDecimal;

@Configuration
public class DatosIniciales {
    @Bean
    CommandLineRunner cargarInventario(BodegaRepository bodegas, ProductoRepository productos) {
        return args -> {
            Bodega norte = bodegas.save(new Bodega("Bodega Norte", "Zona norte"));
            Bodega sur = bodegas.save(new Bodega("Bodega Sur", "Zona sur"));
            productos.save(new Producto("Computador portátil", "Portátil de oficina", new BigDecimal("2500000"), 15, norte));
            productos.save(new Producto("Monitor", "Pantalla de escritorio", new BigDecimal("750000"), 20, norte));
            productos.save(new Producto("Impresora", "Impresora de oficina", new BigDecimal("1200000"), 8, sur));
        };
    }
}
