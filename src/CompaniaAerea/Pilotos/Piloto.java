package CompaniaAerea.Pilotos;

public class Piloto {
    String nombre;
    String apellido;
    String idpilot;

    public Piloto() {
    }

    public Piloto(String nombre, String apellido, String idpilot) { //Metodo constructor para generar al piloto
        this.nombre = nombre;
        this.apellido = apellido;
        this.idpilot = idpilot;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdpilot() {
        return idpilot;
    }

    public void setIdpilot(String idpilot) {
        this.idpilot = idpilot;
    }


    public String getNombre() {
        return nombre;
    }


}
