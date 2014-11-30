package com.company.ParkingLot;


import com.company.ParkingLot.Exception.InvalidTicketException;
import com.company.ParkingLot.Exception.NotAvailableException;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private int capacity;

    private Map<Ticket, Car> listMap= new HashMap<Ticket, Car>();

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    public Ticket park(Car car) throws NotAvailableException {
        Ticket ticket = new Ticket();
        if (capacity > 0) {
            listMap.put(ticket, car);
            capacity -= 1;
            return ticket;
        } else {
            throw new NotAvailableException();
        }
    }

    public Car getCar(Ticket ticket) throws InvalidTicketException {
        Car car = listMap.get(ticket);
        if (car == null) {
            throw new InvalidTicketException();
        } else {
            capacity++;
        }
        return car;
    }
}
