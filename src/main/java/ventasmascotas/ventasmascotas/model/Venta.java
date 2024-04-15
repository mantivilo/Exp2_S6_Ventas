package ventasmascotas.ventasmascotas.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "venta")
public class Venta {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ven")
    private Long id;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fecha")
    private String fecha;
    @Column(name = "cantidadpro")
    private Long cantidadpro;
    @Column(name = "montoventa")
    private Double montoventa;
    
    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public Long getCantidadpro() {
        return cantidadpro;
    }

    public Double getMontoventa(){
        return montoventa;
    }  

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCantidadpro(Long cantidadpro) {
        this.cantidadpro = cantidadpro;
    }

    public void setMontoventa(Double montoventa) {
        this.montoventa = montoventa;
    }
}