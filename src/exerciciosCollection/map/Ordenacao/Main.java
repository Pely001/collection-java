package exerciciosCollection.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.MAY, 20), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 12), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER, 1), "Evento 3", "Atração 3");

        agendaEventos.exibirAgenda();   
        
        agendaEventos.obterProximoEvento();
    }
}
