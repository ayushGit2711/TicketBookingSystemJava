package TicketBookingSystem.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    private String name;
    private String password;
    private String hashPassword;
    private List<Ticket> ticketsBooked;
    private String userId;

    public User(){}

    public User(String name, String password, String hashedPassword, List<Ticket> ticketsBooked, String userId){
        this.name = name;
        this.password = password;
        this.hashPassword = hashedPassword;
        this.ticketsBooked = ticketsBooked;
        this.userId = userId;
    }

    public Object getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public String getHashedPassword() {
        return this.hashPassword;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashPassword = hashedPassword;
    }

    public void setTicketsBooked(List<Ticket> ticketsBooked) {
        this.ticketsBooked = ticketsBooked;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Ticket> getTicketsBooked() {
        return ticketsBooked;
    }

    public void printTickets(){
        for (int i = 0; i<ticketsBooked.size(); i++){
            System.out.println(ticketsBooked.get(i).getTicketInfo());
        }
    }

}
