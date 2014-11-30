package com.company.ParkingLot;

import com.company.ParkingLot.Exception.InvalidTicketException;
import com.company.ParkingLot.Exception.NotAvailableException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingBoy {
    Map<Ticket, ParkingLot> ticketSource = new HashMap<Ticket, ParkingLot>();

    private List<ParkingLot> parkingLots;

    public ParkingBoy(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public Ticket park(Car car) throws NotAvailableException {
        ParkingLot parkingLot = chooseParkingLot(parkingLots);
        if (parkingLot.getCapacity() > 0) {
            Ticket ticket = parkingLot.park(car);
            ticketSource.put(ticket, parkingLot);
            return ticket;
        } else {
            throw new NotAvailableException();
        }
    }

    public ParkingLot chooseParkingLot(List<ParkingLot> parkingLots) throws NotAvailableException {
        for (ParkingLot parkingLot : parkingLots) {
            if (parkingLot.getCapacity() > 0) {
                return parkingLot;
            }
        }
        throw new NotAvailableException();
    }

    public Car getCar(Ticket ticket) throws InvalidTicketException {
        ParkingLot parkingLot = ticketSource.get(ticket);
        if (parkingLot == null) {
            throw new InvalidTicketException();
        }
        return parkingLot.getCar(ticket);
    }
}
