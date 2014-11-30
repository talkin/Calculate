package com.company.ParkingLot;

import com.company.ParkingLot.Exception.InvalidTicketException;
import com.company.ParkingLot.Exception.NotAvailableException;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

public class ParkingLotTest {

    @Test
    public void should_get_ticket_when_parking_lot_is_available() throws Exception {
        ParkingLot parkingLot = new ParkingLot(1);
        Ticket ticket = parkingLot.park(new Car());
        assertThat(ticket, notNullValue());
    }

    @Test(expected = NotAvailableException.class)
    public void should_not_get_ticket_when_parking_lot_is_not_available() throws Exception {
        ParkingLot parkingLot = new ParkingLot(0);
        parkingLot.park(new Car());
    }

    @Test
    public void should_get_car_when_ticket_is_available() throws Exception {
        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car();
        Ticket ticket = parkingLot.park(car);
        Car actualCar = parkingLot.getCar(ticket);
        assertThat(actualCar, is(car));
    }

    @Test(expected = InvalidTicketException.class)
    public void should_not_get_car_when_ticket_is_invalid() throws Exception {
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.getCar(new Ticket());
    }

}
