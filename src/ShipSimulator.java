public class ShipSimulator {
    public static void main(String[] args) {
        Ship model = new ShipModel();
        model.chooseGun();
        model.setGunBehaviour(new LaserGun());
        model.chooseGun();
    }
}
