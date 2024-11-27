package com.example.transport;

public class HumanPoweredTransportFactory extends TransportFactory {
    @Override
    public Transport createScooter() {
        return new Skateboard(); // Opcional, pode ser ajustado.
    }

    @Override
    public Transport createBike() {
        return new Bicycle();
    }
}
