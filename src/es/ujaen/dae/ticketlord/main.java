package es.ujaen.dae.ticketlord;

import es.ujaen.dae.ticketlord.dtos.UsuarioDTO;
import es.ujaen.dae.ticketlord.services.VentaTicketsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {

        ApplicationContext appContext = new
                ClassPathXmlApplicationContext("resources/applicationContext.xml");

        VentaTicketsService ventaTicketsService = (VentaTicketsService) appContext.getBean("ventaTickets");

        UsuarioDTO usuario1 = new UsuarioDTO();

        ventaTicketsService.agregarUsuario(usuario1);
    }
}
