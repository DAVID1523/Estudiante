
public class Estudiante
{
    
    private Integer codigo;
    private String nombre;
    private Integer  telefono;
    private String email;
    private String direccion;
    private Integer edad;
    private Integer documento;
    private String tipo_documento;
    private Integer creditos_cursados;
    private Integer semestres_cursados;
    private String estado;
    private Carrera carrera;
   
    public Estudiante(){
    }
    
    public Estudiante(Integer codigo, String nombre, Integer telefono, String email, String direccion, Integer edad,Integer documento,String tipo_documento, Integer creditos_cursados, Integer semestres_cursados,String estado, Carrera carrera ){
    
        this.codigo=codigo;
        this.nombre=nombre;
        this.telefono=telefono;
        this.email=email;
        this.direccion=direccion;
        this.edad=edad;
        this.documento=documento;
        this.tipo_documento=tipo_documento;
        this.creditos_cursados=creditos_cursados;
        this.semestres_cursados=semestres_cursados;
        this.estado=estado;
        this.carrera=carrera;
        
    }
    
    
    public Integer getCodigo()
    {
        return codigo;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public Integer getTelefono()
    {
        return telefono;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getDireccion()
    {
        return direccion;
    }
    
    public Integer getEdad()
    {
        return edad;
    }
    
    public Integer getDocumento()
    {
        return documento;
    }
    
    public String getTipo_documento()
    {
        return tipo_documento;
    }
    
    public Integer getCreditos_cursados()
    {
        return creditos_cursados;
    }
    
    public Integer getSemestres_cursados()
    {
        return semestres_cursados;
    }
    
    public String getEstado()
    {
        return estado;
    }
    
    public void setCodigo(Integer codigo)
    {
        this.codigo= codigo;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre= nombre;
    }
    
     public void setTelefono(Integer telefono)
    {
        this.telefono=telefono;
    }
    
     public void setEmail(String email)
    {
        this.email=email;
    }
    
     public void setDireccion(String direccion)
    {
        this.direccion=direccion;
    }
    
     public void setEdad(Integer edad)
    {
        this.edad=edad;
    }
    
     public void setDocumento(Integer documento)
    {
        this.documento=documento;
    }
    
    public void setTipo_documento(String tipo_documento)
    {
        this.tipo_documento=tipo_documento;
    }
    
    public void setCreditos_cursados(Integer creditos_cursados)
    {
        this.creditos_cursados=creditos_cursados;
    }
    
    public void setSemestres_cursados(Integer semestres_cursados)
    {
        this.semestres_cursados=semestres_cursados;
    }
    
    public void setEstado(String estado)
    {
        this.estado=estado;
    }
    
    //metodos
    
    public void calcularEdad()
    {
        if (getEdad()>=18){
            System.out.println("El estudiante es mayor de edad");
        }
        else {
            System.out.println("El estudiante es menor de edad");}

    }
    
    
    
    
   
   
    }

