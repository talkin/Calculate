package com.company.ParkingLot;

import com.company.ParkingLot.Exception.InvalidTicketException;
import com.company.ParkingLot.Exception.NotAvailableException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ParkingBoyTest {

    List<ParkingLot> parkingLots = new ArrayList<ParkingLot>();

    @Test(expected = NotAvailableException.class)
    public void should_get_exception_when_all_parking_lot_is_not_available() throws Exception {
        parkingLots.add(new ParkingLot(0));
        ParkingBoy parkingBoy = new ParkingBoy(parkingLots);
        parkingBoy.park(new Car());
    }

    @Test
    public void should_get_a_car_when_have_a_valid_ticket() throws Exception {
        parkingLots.add(new ParkingLot(1));
        ParkingBoy parkingBoy = new ParkingBoy(parkingLots);
        Car car = new Car();

        Ticket ticket = parkingBoy.park(car);
        Car actualCar = parkingBoy.getCar(ticket);

        assertThat(actualCar, is(car));
    }

    @Test
    public void should_choose_the_first_available_parking_lot() throws Exception {
        ParkingLot p1 = new ParkingLot(1);
        parkingLots.add(p1);
        ParkingLot p2 = new ParkingLot(2);
        parkingLots.add(p2);

        ParkingBoy parkingBoy = new ParkingBoy(parkingLots);
        ParkingLot parkingLot = parkingBoy.chooseParkingLot(parkingLots);

        assertThat(parkingLot, is(p1));
    }

    @Test(expected = InvalidTicketException.class)
    public void should_get_exception_when_ticket_is_not_available() throws Exception {
        parkingLots.add(new ParkingLot(2));
        ParkingBoy parkingBoy = new ParkingBoy(parkingLots);
        parkingBoy.getCar(new Ticket());
    }
}
