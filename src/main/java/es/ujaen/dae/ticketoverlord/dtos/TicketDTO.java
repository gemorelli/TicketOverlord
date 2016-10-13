package es.ujaen.dae.ticketoverlord.dtos;

import es.ujaen.dae.ticketoverlord.models.Ticket;

import java.math.BigDecimal;

public class TicketDTO {
    private BigDecimal price;
    private EventDTO event;
    private ZoneDTO zone;

    public TicketDTO() {
    }

    public TicketDTO(Ticket ticket) {
        this.price = ticket.getPrice();
        this.event = new EventDTO(ticket.getEvent());
        this.zone = new ZoneDTO(ticket.getZone());
    }

    @Override
    public String toString() {
        return "TicketDTO{" +
                "price=" + price +
                ", event=" + event +
                ", zone=" + zone +
                '}';
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public EventDTO getEvent() {
        return event;
    }

    public void setEvent(EventDTO event) {
        this.event = event;
    }

    public ZoneDTO getZone() {
        return zone;
    }

    public void setZone(ZoneDTO zone) {
        this.zone = zone;
    }
}
