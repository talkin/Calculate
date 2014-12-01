package com.company.ParkingLot;

import com.company.ParkingLot.Exception.NotAvailableException;

import java.util.List;

public class SimpleParkingBoy extends ParkingBoy {
    public SimpleParkingBoy(List<ParkingLot> parkingLots) {
        super(parkingLots);
    }

    public ParkingLot chooseParkingLot(List<ParkingLot> parkingLots) throws NotAvailableException {
        for (ParkingLot parkingLot : parkingLots) {
            if (parkingLot.getCapacity() > 0) {
                return parkingLot;
            }
        }
        throw new NotAvailableException();
    }
}
