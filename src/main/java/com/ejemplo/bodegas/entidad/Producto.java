package com.ejemplo.bodegas.entidad;

import jakarta.persistence.*;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Producto {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    private int cantidad;
    @ManyToOne(optional = false)
    @JoinColumn(name = "bodega_id", nullable = false)
    private Bodega bodega;

    protected Producto() {}

    public Producto(String nombre, String descripcion, BigDecimal precio, int cantidad, Bodega bodega) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.bodega = bodega;
    }

    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public BigDecimal getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }
    @JsonIgnore
    public Bodega getBodega() { return bodega; }
}
