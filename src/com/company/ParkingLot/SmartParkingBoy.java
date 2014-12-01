package com.company.ParkingLot;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SmartParkingBoy extends ParkingBoy{

    public SmartParkingBoy(List<ParkingLot> parkingLots) {
        super(parkingLots);
    }

    @Override
    public ParkingLot chooseParkingLot(List<ParkingLot> parkingLots){
        Collections.sort(parkingLots, new Comparator<ParkingLot>() {
            public int compare(ParkingLot o1, ParkingLot o2) {
                return o1.getCapacity().compareTo(o2.getCapacity());
            }
        });
        return parkingLots.get(parkingLots.size()-1);
    }
}
