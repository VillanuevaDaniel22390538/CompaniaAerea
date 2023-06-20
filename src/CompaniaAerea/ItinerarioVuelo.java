package CompaniaAerea;

import CompaniaAerea.Aviones.Avion;
import CompaniaAerea.Pilotos.Piloto;

import java.time.LocalDateTime;

public class ItinerarioVuelo {
    public String origen;
    public String destino;
    public LocalDateTime horaInicio;
    public LocalDateTime horaFin;
    public Avion avion;
    public Piloto piloto;

    public ItinerarioVuelo(String origen, String destino, LocalDateTime horaInicio, LocalDateTime horaFin) {
        this.origen = origen;
        this.destino = destino;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public LocalDateTime getHoraFin() {
        return horaFin;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }



}
