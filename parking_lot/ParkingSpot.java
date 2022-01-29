package parking_lot;

public abstract class ParkingSpot {
    private String number;
    private boolean free;
    private VehicleType vehicle;
    private ParkingSpotType type;

    public ParkingSpot(ParkingSpotType type) {
        this.type = type;
    }

    public boolean isFree() {
        return free;
    }

    public boolean assignVehicle(VehicleType vehicle) {
        this.vehicle = vehicle;
        free = false;
        return true;
    }

    public boolean removeVehicle(VehicleType vehicle) {
        this.vehicle = null;
        free = true;
        return true;
    }
}