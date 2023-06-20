package CompaniaAerea.Aviones;

public class Avion {//Tenemos la clase avion
    String modelo;//se especifica el modelo del avion
    int capacidad;//y la capacidad del avion
    //metodos constructores con parametros vacios y parametros completos
    String codigo;
    public Avion() {
    }
    public Avion(String modelo, int capacidad, String codigo) {
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.codigo = codigo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getModelo() {
        return modelo;
    }
    public int getCapacidad(){
        return capacidad;

    }
}