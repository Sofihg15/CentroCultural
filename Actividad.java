import java.util.ArrayList;

public class Actividad {
    private String nombre;
    private String tipo;
    private String instructorResponsable;
    private String areaFisicaAsignada; // identificador del área
    private String areaAlmacenamientoAsignada;
    private ArrayList<String> equiposRequeridos; // códigos de inventario
    private ArrayList<String> alumnosInscritos; // números de expediente

    public Actividad(String nombre, String tipo, String instructorResponsable,
                     String areaFisicaAsignada, String areaAlmacenamientoAsignada) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.instructorResponsable = instructorResponsable;
        this.areaFisicaAsignada = areaFisicaAsignada;
        this.areaAlmacenamientoAsignada = areaAlmacenamientoAsignada;
        this.equiposRequeridos = new ArrayList<>();
        this.alumnosInscritos = new ArrayList<>();
    }

    // Getters y setters 
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; } 
    public void setTipo(String tipo) { this.tipo = tipo; }
    
    public String getInstructorResponsable() { return instructorResponsable; } 
    public void setInstructorResponsable(String instructorResponsable) {
        this.instructorResponsable = instructorResponsable;
    }
    public String getAreaFisicaAsignada() { return areaFisicaAsignada; } 
    public void setAreaFisicaAsignada(String areaFisicaAsignada) {
        this.areaFisicaAsignada = areaFisicaAsignada;
    }
    public String getAreaAlmacenamientoAsignada() { return areaAlmacenamientoAsignada; } 
    public void setAreaAlmacenamientoAsignada(String areaAlmacenamientoAsignada) {
        this.areaAlmacenamientoAsignada = areaAlmacenamientoAsignada;
    }

    public ArrayList<String> getEquiposRequeridos() { return equiposRequeridos; }
    public ArrayList<String> getAlumnosInscritos() { return alumnosInscritos; }

    public void agregarEquipo(String codigoEquipo) {
        equiposRequeridos.add(codigoEquipo);
    }

    public void inscribirAlumno(String numeroExpediente) {
        alumnosInscritos.add(numeroExpediente);
    }
}

