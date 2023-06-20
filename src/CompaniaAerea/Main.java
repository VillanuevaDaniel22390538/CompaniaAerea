package CompaniaAerea;
import CompaniaAerea.Aviones.Avion;
import CompaniaAerea.Pilotos.Piloto;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Set<String> usuariosUtilizados = new HashSet<>();

        Avion avion1 = new Avion("Boeing737", 250, "001");
        Avion avion2 = new Avion("Boeing 242", 200, "002");
        Avion avion3 = new Avion("VivaAirbus666", 666, "003");
        Piloto pilot1 = new Piloto("Daniel Donaldo", "Villanueva Canul", "22390538");
        Piloto pilot2 = new Piloto("Hailie Ailee", "Villanueva Colli", "22121417");
        Piloto pilot3 = new Piloto("Joshua Daniel", "Villanueva Canul", "22152002");

        ControladorVuelo controlador = new ControladorVuelo();
        controlador.agregarAvion(avion1);
        controlador.agregarAvion(avion2);
        controlador.agregarAvion(avion3);

        controlador.agregarPiloto(pilot1);
        controlador.agregarPiloto(pilot2);
        controlador.agregarPiloto(pilot3);

        Map<String, Piloto> pilotosMap = new HashMap<>();
        pilotosMap.put(pilot1.getIdpilot(), pilot1);
        pilotosMap.put(pilot2.getIdpilot(), pilot2);
        pilotosMap.put(pilot3.getIdpilot(), pilot3);

        Map<String, Avion> avionesMap = new HashMap<>();
        avionesMap.put(avion1.getCodigo(), avion1);
        avionesMap.put(avion2.getCodigo(), avion2);
        avionesMap.put(avion3.getCodigo(), avion3);

        System.out.println("-------COMPAÑIA AEREA ITCH---------");
        System.out.println("-----------------------------------");

        Avion avion = null;
        for (int i = 1; i <= 3; i++) {
            String idPiloto;
            boolean idValido = false;

            Scanner scanner = new Scanner(System.in);
            Piloto piloto;
            do {

                System.out.print("Ingrese el ID del piloto: ");
                idPiloto = scanner.nextLine();
                // Obtener nombre del piloto a partir del ID
                piloto = pilotosMap.get(idPiloto);
                if (usuariosUtilizados.contains(idPiloto)) {
                    System.out.println("El ID del Piloto ya se ha UTILIZADO Y TIENE UN VUELO PROGRAMADO. Ingrese otro ID de otro Piloto.");
                } else {
                    idValido = true;
                    usuariosUtilizados.add(idPiloto);
                }
            } while (!idValido);


            if (piloto != null) {
                System.out.println("El nombre del piloto con ID " + idPiloto + " es: " + piloto.getNombre() + " " + piloto.getApellido());
                System.out.println("El Piloto se encuentra Disponible ");
            } else {
                System.out.println("No se encontró un piloto con ID " + idPiloto);
            }
                String codigoAvion;

                do {
                    System.out.print("Ingrese el codigo del avion: ");
                    codigoAvion = scanner.nextLine();
                    // Obtener modelo del avion apartir del codigo y capacidad de lugares
                    avion = avionesMap.get(codigoAvion);

                    if (usuariosUtilizados.contains(codigoAvion)) {
                        System.out.println("El Avion ya se ha asignado, por favor ingrese otro avion");
                    } else {
                        idValido = true;
                        usuariosUtilizados.add(codigoAvion);
                    }
                } while (!idValido);

                if (avion != null) {
                    System.out.println("El Avion asignado al Piloto: " + piloto.getNombre() + ", con codigo de avion de: " + codigoAvion + " es: " + avion.getModelo() + " con una capacidad de: " + avion.getCapacidad() + " pasajeros.");
                } else {
                    System.out.println("No se encontró un avion con codigo " + codigoAvion);

                }
                int horasalida, Horallegada;
                System.out.print("Ingrese el Destino del vuelo: ");
                String destinovuelo = scanner.nextLine();
                System.out.println("El destino del vuelo es: " + destinovuelo);
                System.out.println("El Aeropuerto de salida es Aeropuerto ITCH de la Ciudad de Chetumal");
                System.out.print("Ingrese la hora de salida: ");
                horasalida = teclado.nextInt();
                Horallegada = horasalida + 2;
                System.out.println("La hora de salida es: " + horasalida + " horas");
                System.out.println("La hora estimada de llegada al aeropuerto de la ciudad de " + destinovuelo + " es a las " + Horallegada + " horas");
            }
        }
    }

