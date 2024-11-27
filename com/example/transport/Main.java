package com.example.transport;

public class Main {
    public static void main(String[] args) {
        TransportFactory electricFactory = new ElectricTransportFactory();
        TransportFactory humanFactory = new HumanPoweredTransportFactory();

        Transport electricScooter = electricFactory.createScooter();
        electricScooter.ride();

        Transport humanBike = humanFactory.createBike();
        humanBike.ride();
    }
}
