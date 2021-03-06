package com.company.ParkingLot;

import com.company.ParkingLot.Exception.InvalidTicketException;
import com.company.ParkingLot.Exception.NotAvailableException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ParkingBoy {
    Map<Ticket, ParkingLot> ticketSource = new HashMap<Ticket, ParkingLot>();

    private List<ParkingLot> parkingLots;

    public ParkingBoy(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public Ticket park(Car car) throws NotAvailableException {
        ParkingLot parkingLot = chooseParkingLot(parkingLots);
        Ticket ticket = parkingLot.park(car);
        ticketSource.put(ticket, parkingLot);
        return ticket;
    }

    public abstract ParkingLot chooseParkingLot(List<ParkingLot> parkingLots) throws NotAvailableException;

    public Car getCar(Ticket ticket) throws InvalidTicketException {
        ParkingLot parkingLot = ticketSource.get(ticket);
        if (parkingLot == null) {
            throw new InvalidTicketException();
        }
        return parkingLot.getCar(ticket);
    }
}
