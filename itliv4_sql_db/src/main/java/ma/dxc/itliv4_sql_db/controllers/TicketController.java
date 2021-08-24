package ma.dxc.itliv4_sql_db.controllers;

import ma.dxc.itliv4_sql_db.entities.Ticket;
import ma.dxc.itliv4_sql_db.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/addTicket")
    public Ticket saveTicket(@RequestBody Ticket ticket) {
        return ticketService.saveTicket(ticket);
    }

    @PostMapping("/addTickets")
    public List<Ticket> saveTickets(@RequestBody List<Ticket> tickets) {
        return ticketService.saveTickets(tickets);
    }

    @GetMapping("/tickets")
    public List<Ticket> findAllTickets() {
        return ticketService.getTickets();
    }

    @GetMapping("/tickets/findById/{id}")
    public Ticket getTicketById(@PathVariable Long id) {
        return ticketService.getTicketById(id);
    }

    @GetMapping("/ticket/findByTitre/{name}")
    public List<Ticket> getTicketByTitre(@PathVariable String name) {
        return ticketService.getTicketByTitre(name);
    }

    @PutMapping("/updateTicket")
    public Ticket UpdateProduct(@RequestBody Ticket ticket) {
        return ticketService.updateTicket(ticket);
    }

    @DeleteMapping("/deleteTicket/{id}")
    public String deleteTicket(@PathVariable Long id) {
        return ticketService.deleteTicket(id);
    }
}
