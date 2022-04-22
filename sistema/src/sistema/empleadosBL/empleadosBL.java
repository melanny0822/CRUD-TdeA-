
package sistema.empleadosBL;

/**
 *Creamos los métodos setters y getters de cada elemento
 * @author Daniel
 */
public class empleadosBL {
    
    int ID;
    String nombre,apellido,contacto,correo;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    

    public void setApellido(String Apellido) {
        this.apellido = Apellido;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    
    public String getCorreo () {
        return correo;
    }

    public void setCorreo (String Correo) {
        this.correo = correo;
    }
}
