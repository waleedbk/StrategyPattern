public class ShipModel extends Ship{

    public ShipModel() {
        shipType = new UnderWaterShip();
        gunBehaviour = new ShotGun();
    }

    public void display() {
        System.out.println("I'm a ship model");
    }

}
