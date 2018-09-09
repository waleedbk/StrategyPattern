public abstract class Ship {
    GunBehaviour gunBehaviour;
    ShipType shipType;

    public abstract void display();

    public void chooseGun() {
        gunBehaviour.shoot();
    }
    public void chooseShip() {
        shipType.ship();
    }

    public void setGunBehaviour(GunBehaviour gb) {
        gunBehaviour = gb;
    }
    public void setShipType(ShipType st) {
        shipType = st;
    }
}
