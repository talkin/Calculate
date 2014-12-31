package com.company.ParkingLot;

import com.company.ParkingLot.Exception.NotAvailableException;

import java.util.List;

public class SuperParkingBoy extends ParkingBoy{

    public SuperParkingBoy(List<ParkingLot> parkingLots) {
        super(parkingLots);
    }

    @Override
    public ParkingLot chooseParkingLot(List<ParkingLot> parkingLots) throws NotAvailableException {
        for (ParkingLot parkingLot : parkingLots) {
            int ratio = parkingLot.getAvailableLot() / parkingLot.getCapacity();
        }
        return null;
    }
}
