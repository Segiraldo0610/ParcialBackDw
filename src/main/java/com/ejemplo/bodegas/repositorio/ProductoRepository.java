package com.ejemplo.bodegas.repositorio;

import com.ejemplo.bodegas.entidad.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
