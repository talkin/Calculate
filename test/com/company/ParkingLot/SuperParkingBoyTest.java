package com.company.ParkingLot;

import com.company.ParkingLot.Exception.NotAvailableException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SuperParkingBoyTest {

    List<ParkingLot> parkingLots = new ArrayList<ParkingLot>();

    @Test(expected = NotAvailableException.class)
    public void should_get_exception_when_all_parking_lot_is_not_available() throws Exception {
        parkingLots.add(new ParkingLot(0));

        SuperParkingBoy superParkingBoy = new SuperParkingBoy(parkingLots);
        superParkingBoy.park(new Car());
    }
}
