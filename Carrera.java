import java.util.Date;


public class Carrera
{
    private Integer codigo_carrera;
    private String nombre_carrera;
    private Integer semestres;
    private Integer creditos;
    private String titulo;
    private String director;
    private Date fecha_inicio;
    
    
    public Carrera()
    {
    }
    
    public Carrera(Integer codigo_carrera, String nombre_carrera, Integer semestres,Integer creditos, String titulo, String director,  Date fecha_inicio )
    {
        this.codigo_carrera= codigo_carrera;
        this.nombre_carrera= nombre_carrera;
        this.semestres=semestres;
        this.creditos=creditos;
        this.titulo=titulo;
        this.director= director;
        this.fecha_inicio=fecha_inicio;
        
    }
    
    public Integer getCodigo_carrera()
    {
        return codigo_carrera;
    }
    
    public String getNombre_carrera()
    {
        return nombre_carrera;
    }
    
    public Integer getSemestres()
    {
        return semestres;
    }
    
    public Integer getCreditos()
    {
        return creditos;
    }
    
    public String  getTitulo()
    {
        return titulo;
    }
    
    public String  getDirector()
    {
        return director;
    }
    
    public Date  getFecha_inicio()
    {
        return fecha_inicio;
    }
    
    public void setCodigo_carrera(Integer codigo_carrera)
    {
        this.codigo_carrera=codigo_carrera;
    }
    
    public void setNombre_carrera(String nombre_carrera)
    {
        this.nombre_carrera=nombre_carrera;
    }
    
    public void setSemestres(Integer semestres)
    {
        this.semestres=semestres;
    }
    
    public void setCreditos(Integer creditos)
    {
        this.creditos=creditos;
    }
    
    public void setTitulo(String titulo)
    {
        this.titulo=titulo;
    }
    
    public void setDirector(String director)
    {
        this.director=director;
    }
    
    public void setFecha_inicio(Date fecha_inicio)
    {
        this.fecha_inicio=fecha_inicio;
    }
    
    public void imprimirCreditos(){
        System.out.println("Los creditos de la carrera so:" +getCreditos());
    }
}
    
    
    
    

