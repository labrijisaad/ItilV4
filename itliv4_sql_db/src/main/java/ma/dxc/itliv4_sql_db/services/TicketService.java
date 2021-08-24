package ma.dxc.itliv4_sql_db.services;

import ma.dxc.itliv4_sql_db.entities.Ticket;
import ma.dxc.itliv4_sql_db.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    public Ticket saveTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public List<Ticket> saveTickets(List<Ticket> tickets) {
        return ticketRepository.saveAll(tickets);
    }

    public List<Ticket> getTickets() {
        return ticketRepository.findAll();
    }

    public List<Ticket> getTicketByTitre(String titre) {
        return ticketRepository.findByTitre(titre);
    }

    public Ticket getTicketById(Long id) {
        return ticketRepository.findById(id).orElse(null);
    }

    public String deleteTicket(Long id) {
        ticketRepository.deleteById(id);
        return "Ticket " + id + " was deleted";
    }

    public Ticket updateTicket(Ticket ticket) {
        Ticket existingTicket = ticketRepository.findById(ticket.getId()).orElse(null);
        Objects.requireNonNull(existingTicket).setDescription(ticket.getDescription());
        Objects.requireNonNull(existingTicket).setTitre(ticket.getTitre());
        Objects.requireNonNull(existingTicket).setDateCloture(ticket.getDateCloture());
        Objects.requireNonNull(existingTicket).setDateCreation(ticket.getDateCreation());
        return ticketRepository.save(ticket);
    }
}
