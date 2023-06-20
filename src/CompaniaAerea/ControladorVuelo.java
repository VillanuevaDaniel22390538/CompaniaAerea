package CompaniaAerea;

import CompaniaAerea.Aviones.Avion;
import CompaniaAerea.Pilotos.Piloto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ControladorVuelo {
    public List<ItinerarioVuelo> itinerarios;
    public Map<String, Avion> avionesMap;
    public Map<String, Piloto> pilotosMap;
    public ItinerarioVuelo[] getItinerarios;

    public ControladorVuelo() {
        itinerarios = new ArrayList<>();
        avionesMap = new HashMap<>();
        pilotosMap = new HashMap<>();
    }

    public void agregarItinerario(ItinerarioVuelo itinerario) {
        itinerarios.add(itinerario);
    }
    public void agregarAvion(Avion avion) {
        avionesMap.put(avion.getCodigo(), avion);
    }

    public void agregarPiloto(Piloto piloto) {
        pilotosMap.put(piloto.getIdpilot(), piloto);
    }
    public void asignarAvionYPiloto() {
        for (ItinerarioVuelo itinerario : itinerarios) {
            Avion avion = buscarAvionDisponible(itinerario.getHoraInicio(), itinerario.getHoraFin());
            Piloto piloto = buscarPilotoDisponible(itinerario.getHoraInicio(), itinerario.getHoraFin(), itinerario.getPiloto());
            itinerario.setAvion(avion);
            itinerario.setPiloto(piloto);
            System.out.println("Horario de salida: " + formatDateTime(itinerario.getHoraInicio()));
            System.out.println("Horario de llegada: " + formatDateTime(itinerario.getHoraFin()));
            System.out.println("Piloto asignado: " + piloto.getNombre());
            System.out.println("Avión asignado: " + avion.getModelo());
            System.out.println("-----------------------");
        }
    }

    public Avion buscarAvionDisponible(LocalDateTime horaSalida, LocalDateTime horaLlegada) {
        // Lógica para buscar un avión disponible según las horas de salida y llegada
        // En este ejemplo, se seleccionará un avión disponible al azar
        return avionesMap.values().stream().findFirst().orElse(null);
    }

    public Piloto buscarPilotoDisponible(LocalDateTime horaSalida, LocalDateTime horaLlegada, Piloto pilotoActual) {
        // Lógica para buscar un piloto disponible según las horas de salida y llegada
        // En este ejemplo, se seleccionará un piloto disponible al azar que no sea el mismo piloto actual
        for (Piloto piloto : pilotosMap.values()) {
            if (!piloto.equals(pilotoActual)) {
                return piloto;
            }
        }
        return null;
    }

    public String formatDateTime(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return dateTime.format(formatter);
    }

    public ItinerarioVuelo[] getItinerarios() {
        return new ItinerarioVuelo[0];
    }
}
