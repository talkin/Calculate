package com.company.ParkingLot;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SmartParkingBoyTest {

    List<ParkingLot> parkingLots = new ArrayList<ParkingLot>();

    @Test
    public void should_choose_the_most_capacity_parking_lot() throws Exception {
        ParkingLot p1 = new ParkingLot(2);
        parkingLots.add(p1);
        ParkingLot p2 = new ParkingLot(5);
        parkingLots.add(p2);

        SmartParkingBoy smartParkingBoy = new SmartParkingBoy(parkingLots);
        ParkingLot parkingLot = smartParkingBoy.chooseParkingLot(parkingLots);

        assertThat(parkingLot, is(p2));
    }
}
