package com.ejemplo.bodegas.entidad;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Bodega {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String ubicacion;
    @OneToMany(mappedBy = "bodega")
    private List<Producto> productos = new ArrayList<>();

    protected Bodega() {}

    public Bodega(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public String getUbicacion() { return ubicacion; }
    public List<Producto> getProductos() { return productos; }
}
