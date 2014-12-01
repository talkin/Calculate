package com.company.ParkingLot;

import com.company.ParkingLot.Exception.InvalidTicketException;
import com.company.ParkingLot.Exception.NotAvailableException;
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

    @Test(expected = InvalidTicketException.class)
    public void should_get_exception_when_ticket_is_not_available() throws Exception {
        parkingLots.add(new ParkingLot(3));
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy(parkingLots);
        smartParkingBoy.getCar(new Ticket());
    }

    @Test
    public void should_get_car_when_have_a_valid_ticket() throws Exception {
        parkingLots.add(new ParkingLot(3));
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy(parkingLots);
        Car car = new Car();
        Ticket ticket = smartParkingBoy.park(car);
        Car actualCar = smartParkingBoy.getCar(ticket);

        assertThat(actualCar, is(car));
    }

    @Test(expected = NotAvailableException.class)
    public void should_get_exception_when_all_parking_lots_is_not_available() throws Exception {
        parkingLots.add(new ParkingLot(0));
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy(parkingLots);
        smartParkingBoy.park(new Car());
    }
}
